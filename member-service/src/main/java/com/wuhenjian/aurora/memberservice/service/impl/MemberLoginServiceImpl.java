package com.wuhenjian.aurora.memberservice.service.impl;

import com.wuhenjian.aurora.consumer.service.*;
import com.wuhenjian.aurora.memberservice.service.MemberLoginService;
import com.wuhenjian.aurora.utils.*;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.constant.DeviceType;
import com.wuhenjian.aurora.utils.constant.MemberStatus;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.bo.TokenInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.bo.AuthParam;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2017/12/21 10:51
 */
@Service("memberLoginService")
public class MemberLoginServiceImpl implements MemberLoginService {

	@Autowired
	private MemberAuthService memberAuthService;

	@Autowired
	private MemberInfoService memberInfoService;

	@Autowired
	private RedisService redisService;

	@Autowired
	private CommonCountService commonCountService;

	@Autowired
	private NotifyService notifyService;

	@Override
	public TokenInfo login(AuthParam authParam) throws BusinessException {
		//签名验证
		if (!AuthUtil.verifySign(authParam.getLoginParam(), authParam.getParamSign())) {
			throw new BusinessException(ResultStatus.SIGN_FAIL);
		}
		//验证码检查
		this.checkCaptcha(authParam.getCaptchaKey(), authParam.getCaptcha());
		//解密
		String account;
		try {
			account = AuthUtil.convert2Plaintext(authParam.getMemberAccount());
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.DECRYPTION_EXCEPTION);
		}
		//校验格式，获取账号信息
		MemberAuth ma = this.verifyAccountTypeGetAccount(account, authParam.getAccountType());
		if (ma == null) {
			throw new BusinessException(ResultStatus.ACCOUNT_NOT_EXIST);
		}
		//管理员锁定
		if (MemberStatus.ADMIN_LOCKED.getCode().equals(ma.getCurrentStatus())) {
			throw new BusinessException(ResultStatus.MEMBER_LOCKED_BY_ADMIN);
		}
		//密码错误次数过多被锁定
		if (MemberStatus.ERROR_PASSWORD_LOCKED.getCode().equals(ma.getCurrentStatus())) {
			throw new BusinessException(ResultStatus.MEMBER_AUTH_OVERTIME);
		}
		//密码错误超过5次
		if (ma.getAuthFail() > 5) {
			MemberAuth memberAuth = new MemberAuth();
			memberAuth.setMaId(ma.getMaId());
			memberAuth.setUpdateTime(new Date());
			memberAuth.setCurrentStatus(MemberStatus.ERROR_PASSWORD_LOCKED.getCode());
			memberAuthService.updateByPrimaryKeySelective(memberAuth);
			throw new BusinessException(ResultStatus.MEMBER_AUTH_OVERTIME);
		}
		String password;
		try {
			password = AuthUtil.convert2Plaintext(authParam.getMemberPassword());
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.DECRYPTION_EXCEPTION);
		}
		if (StringUtil.moreThanLength(password, 16) || StringUtil.lessThanLength(password, 8)) {//密码长度
			this.passwordError(ma);
			throw new BusinessException(ResultStatus.PASSWORD_LENGTH_INVALID);
		}
		if (!AuthUtil.verifyPassword(password, ma.getAuthSalt(), ma.getMemberPassword())) {//验证密码
			this.passwordError(ma);
			throw new BusinessException(ResultStatus.PASSWORD_INVALID);
		}
		MemberInfo memberInfo = new MemberInfo();
		memberInfo.setLastLoginDevice(DeviceType.getCode(authParam.getDeviceType()));
		memberInfo.setLastLoginIP(authParam.getLoginIp());
		memberInfo.setLastLoginTime(new Date());
		memberInfo.setMaId(ma.getMaId());
		memberInfoService.updateMemberInfoByMaId(memberInfo);
		//获取用户信息，存入redis中缓存
		//获取用户信息
		MemberAcctInfo memberAcctInfo = memberInfoService.selectByMaid(ma.getMaId());
		//获取token
		String token;
		try {
			token = AuthUtil.createToken();
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.ENCODING_EXCEPTION);
		}
		//存入redis
		redisService.setToken(token, memberAcctInfo);
		return TokenInfo.defaultInstance(token);
	}

	@Override
	public String sendCaptcha(String memberAccount, Integer captchaType, String timestamp, String paramSign) throws BusinessException {
		Map<String,String> params = new HashMap<>();
		params.put("memberAccount", memberAccount);
		params.put("captchaType", String.valueOf(captchaType));
		params.put("timestamp", timestamp);
		if (!AuthUtil.verifySign(params, paramSign)) {
			throw new BusinessException(ResultStatus.SIGN_FAIL);
		}
		ApiResult r1 = notifyService.sendCaptcha(memberAccount, captchaType);
		return (String) ApiResultUtil.getObject(r1);
	}

	@Override
	public void register(AuthParam authParam) throws BusinessException {
		//签名验证
		if (!AuthUtil.verifySign(authParam.getRegisterParam(), authParam.getParamSign())) {
			throw new BusinessException(ResultStatus.SIGN_FAIL);
		}
		//验证码检查
		this.checkCaptcha(authParam.getCaptchaKey(), authParam.getCaptcha());
		//两次输入密码是否相同
		if (!authParam.getMemberPassword().equals(authParam.getReMemberPassword())) {
			throw new BusinessException(ResultStatus.PASSWORD_REPASSWORD_DIFFERENT);
		}
		String account;
		try {
			account = AuthUtil.convert2Plaintext(authParam.getMemberAccount());
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.DECRYPTION_EXCEPTION);
		}
		MemberAuth ma = this.verifyAccountTypeGetAccount(account, authParam.getAccountType());
		if (ma != null) {//注册账号是否存在
			throw new BusinessException(ResultStatus.MEMBER_ACCOUNT_EXISTED);
		}
		String password;
		try {
			password = AuthUtil.convert2Plaintext(authParam.getMemberPassword());
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.DECRYPTION_EXCEPTION);
		}
		if (StringUtil.moreThanLength(password, 16) && StringUtil.lessThanLength(password, 8)) {
			throw new BusinessException(ResultStatus.PASSWORD_LENGTH_INVALID);
		}
		String salt = UUIDUtil.getRandomString(6);
		String passwordEncrypt = AuthUtil.passwordEncrypt(password, salt);
		long accountCode = commonCountService.getAccountCode();
		MemberAuth memberAuth = new MemberAuth();
		if (CommonContant.LOGIN_TYPE_PHONE.equals(authParam.getAccountType())) {
			memberAuth.setMemberPhone(account);
		} else if (CommonContant.LOGIN_TYPE_EMAIL.equals(authParam.getAccountType())) {
			memberAuth.setMemberEmail(account);
		}
		memberAuth.setMemberPassword(passwordEncrypt);
		memberAuth.setAuthSalt(salt);
		memberAuth.setAccountCode(accountCode);
		memberAuth.setAuthFail(0);
		memberAuth.setCurrentStatus(MemberStatus.NORMAL.getCode());
		memberAuth.setRegisterTime(new Date());
		memberAuth.setUpdateTime(new Date());
		memberAuthService.insertSelective(memberAuth);//创建用户
		commonCountService.addAccountCode();//自增账户表
	}

	@Override
	public void resetPassword(AuthParam authParam) throws BusinessException {
		//签名验证
		if (!AuthUtil.verifySign(authParam.getResetParam(), authParam.getParamSign())) {
			throw new BusinessException(ResultStatus.SIGN_FAIL);
		}
		//验证码检查
		this.checkCaptcha(authParam.getCaptchaKey(), authParam.getCaptcha());
		if (!authParam.getMemberPassword().equals(authParam.getReMemberPassword())) {//两次输入密码是否相同
			throw new BusinessException(ResultStatus.PASSWORD_REPASSWORD_DIFFERENT);
		}
		//解密
		String account;
		try {
			account = AuthUtil.convert2Plaintext(authParam.getMemberAccount());
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.DECRYPTION_EXCEPTION);
		}
		//校验格式，获取账号信息
		MemberAuth ma = verifyAccountTypeGetAccount(account, authParam.getAccountType());
		if (ma == null) {
			throw new BusinessException(ResultStatus.ACCOUNT_NOT_EXIST);
		}
		String password;
		try {
			password = AuthUtil.convert2Plaintext(authParam.getMemberPassword());
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.DECRYPTION_EXCEPTION);
		}
		//密码长度
		if (StringUtil.moreThanLength(password, 16) || StringUtil.lessThanLength(password, 8)) {
			throw new BusinessException(ResultStatus.PASSWORD_LENGTH_INVALID);
		}
		//管理员锁定
		if (MemberStatus.ADMIN_LOCKED.getCode().equals(ma.getCurrentStatus())) {
			throw new BusinessException(ResultStatus.MEMBER_LOCKED_BY_ADMIN);
		}
		//密码错误次数过多被锁定
		if (MemberStatus.ERROR_PASSWORD_LOCKED.getCode().equals(ma.getCurrentStatus())) {
			throw new BusinessException(ResultStatus.MEMBER_AUTH_OVERTIME);
		}
		String passwordEncrypt = AuthUtil.passwordEncrypt(password, ma.getAuthSalt());
		//新旧密码相同
		if (ma.getMemberPassword().equals(passwordEncrypt)) {
			throw new BusinessException(ResultStatus.NEW_OLD_PASSWORD_IS_SAME);
		}
		String newSalt = UUIDUtil.getRandomString(6);
		String newPassword = AuthUtil.passwordEncrypt(password, newSalt);
		//更新密码
		MemberAuth memberAuth = new MemberAuth();
		memberAuth.setMaId(ma.getMaId());
		memberAuth.setMemberPassword(newPassword);
		memberAuth.setAuthSalt(newSalt);
		memberAuth.setAuthFail(0);
		memberAuth.setUpdateTime(new Date());
		memberAuthService.updateByPrimaryKeySelective(memberAuth);
	}

	/**
	 * 检查账号是否存在
	 * @param memberAccount 账号
	 * @param accountType 账号类型
	 * @param paramSign 签名
	 */
	@Override
	public Integer checkAccount(String memberAccount, String accountType, String paramSign) throws BusinessException {
		Map<String,String> params = new HashMap<>();
		params.put("memberAccount", memberAccount);
		params.put("accountType", accountType);
		if (!AuthUtil.verifySign(params, paramSign)) {
			throw new BusinessException(ResultStatus.SIGN_FAIL);
		}
		String account;
		try {
			account = AuthUtil.convert2Plaintext(memberAccount);
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.DECRYPTION_EXCEPTION);
		}
		MemberAuth ma = this.verifyAccountTypeGetAccount(account, accountType);
		if (ma != null) {
			return CommonContant.ACCOUNT_EXIST;
		} else {
			return CommonContant.ACCOUNT_NOT_EXIST;
		}
	}

	/**
	 * 验证账号类型，获取账号信息
	 * @param account 账号
	 * @param accountType 账号类型
	 * @return 账号信息
	 * @throws BusinessException 发生异常
	 */
	private MemberAuth verifyAccountTypeGetAccount(String account, String accountType) throws BusinessException {
		//校验格式，获取账号信息
		MemberAuth memberAuth;
		if (CommonContant.LOGIN_TYPE_PHONE.equals(accountType)) {//手机号登录
			if (!StringUtil.isPhone(account)) {
				throw new BusinessException(ResultStatus.ACCOUNT_FORMAT_ERROR);
			}
			//通过手机号获取账户
			memberAuth = memberAuthService.selectByPhone(account);
		} else if (CommonContant.LOGIN_TYPE_EMAIL.equals(accountType)) {//邮箱登录
			if (!StringUtil.isEmail(account)) {
				throw new BusinessException(ResultStatus.ACCOUNT_FORMAT_ERROR);
			}
			//通过邮箱获取账户
			memberAuth = memberAuthService.selectByEmail(account);
		} else {//登录格式错误
			throw new BusinessException(ResultStatus.LOGIN_TYPE_ERROR);
		}
		return memberAuth;
	}

	/**
	 * 密码错误，更新账号信息
	 * @param ma 原来账号信息
	 */
	private void passwordError(MemberAuth ma) throws BusinessException {
		MemberAuth memberAuth = new MemberAuth();
		memberAuth.setMaId(ma.getMaId());
		memberAuth.setAuthFail(ma.getAuthFail() + 1);
		memberAuth.setUpdateTime(new Date());
		memberAuthService.updateByPrimaryKeySelective(memberAuth);
	}

	/**
	 * 检查验证码是否正确
	 * @param captchaKey 验证码redis缓存的key
	 * @param captcha 用户输入的验证码
	 * @throws BusinessException 发生异常
	 */
	private void checkCaptcha(String captchaKey, String captcha) throws BusinessException {
		String redisCaptcha = redisService.get(captchaKey);
		//验证码是否正确
		if (captcha.equals(redisCaptcha)) {
			throw new BusinessException(ResultStatus.CAPTCHA_ERROR);
		}
	}
}
