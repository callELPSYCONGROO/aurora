package com.wuhenjian.aurora.memberservice.service.impl;

import com.wuhenjian.aurora.memberservice.service.*;
import com.wuhenjian.aurora.utils.ApiResultUtil;
import com.wuhenjian.aurora.utils.AuthUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.UUIDUtil;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.constant.DeviceType;
import com.wuhenjian.aurora.utils.constant.MemberStatus;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.param.AuthParam;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author 無痕剑
 * @date 2017/12/21 10:51
 */
@Service("memberLoginService")
public class MemberLoginServiceImpl implements MemberLoginService {

	@Resource(name = "memberAuthService")
	private MemberAuthService memberAuthService;

	@Resource(name = "memberInfoService")
	private MemberInfoService memberInfoService;

	@Resource(name = "redisService")
	private RedisService redisService;

	@Resource(name = "commonCountService")
	private CommonCountService commonCountService;

	@Override
	public TokenInfo login(AuthParam authParam) throws BusinessException {
		//签名验证
		if (!AuthUtil.verifySign(authParam.getLoginParam(), authParam.getParamSign())) {
			throw new BusinessException(ResultStatus.LOGIN_SIGN_ERROR);
		}
		//解密
		String account = AuthUtil.convert2Plaintext(authParam.getMemberAccount());
		//校验格式，获取账号信息
		ApiResult r1 = this.verifyAccountTypeGetAccount(account, authParam.getAccountType());
		MemberAuth ma = (MemberAuth) ApiResultUtil.getObject(r1);
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
			ApiResult apiResult = memberAuthService.updateByPrimaryKeySelective(memberAuth);
			if (apiResult.getCode() != 1000) {
				throw new BusinessException(apiResult);
			}
			throw new BusinessException(ResultStatus.MEMBER_AUTH_OVERTIME);
		}
		String password = AuthUtil.convert2Plaintext(authParam.getMemberPassword());
		if (StringUtil.moreThanLength(password, 16) || StringUtil.lessThanLength(password, 8)) {//密码长度
			this.passwordError(ma);
			throw new BusinessException(ResultStatus.PASSWORD_LENGTH_INVALID);
		}
		if (!AuthUtil.verifyPassword(password, ma.getAuthSalt(), ma.getMemberPassword())) {//验证密码
			this.passwordError(ma);
			throw new BusinessException(ResultStatus.PASSWORD_ISVALID);
		}
		MemberInfo memberInfo = new MemberInfo();
		memberInfo.setLastLoginDevice(DeviceType.getCode(authParam.getDeviceType()));
		memberInfo.setLastLoginIP(authParam.getLoginIp());
		memberInfo.setLastLoginTime(new Date());
		memberInfo.setMaId(ma.getMaId());
		memberInfoService.updateMemberInfoByMaId(memberInfo);
		//获取用户信息，存入redis中缓存
		//获取用户信息
		ApiResult apiResult = memberInfoService.selectByMaid(ma.getMaId());
		MemberAcctInfo memberAcctInfo = (MemberAcctInfo) ApiResultUtil.getObject(apiResult);
		//获取token
		String token = AuthUtil.createToken();
		//存入redis
		redisService.setToken(token, memberAcctInfo);
		return TokenInfo.defaultInstance(token);
	}

	@Override
	public void register(AuthParam authParam) throws BusinessException {
		//TODO 注册、重置密码功能修改流程
		//签名验证
		if (!AuthUtil.verifySign(authParam.getRegisterParam(), authParam.getParamSign())) {
			throw new BusinessException(ResultStatus.LOGIN_SIGN_ERROR);
		}
		//两次输入密码是否相同
		if (!authParam.getMemberPassword().equals(authParam.getReMemberPassword())) {
			throw new BusinessException(ResultStatus.PASSWORD_REPASSWORD_DIFFERENT);
		}
		String account = AuthUtil.convert2Plaintext(authParam.getMemberAccount());
		ApiResult r1 = this.verifyAccountTypeGetAccount(account, authParam.getAccountType());
		MemberAuth ma = (MemberAuth) ApiResultUtil.getObject(r1);
		if (ma != null) {//注册账号是否存在
			throw new BusinessException(ResultStatus.MEMBER_ACCOUNT_EXISTED);
		}
		String password = AuthUtil.convert2Plaintext(authParam.getMemberPassword());
		if (StringUtil.moreThanLength(password, 16) && StringUtil.lessThanLength(password, 8)) {
			throw new BusinessException(ResultStatus.PASSWORD_LENGTH_INVALID);
		}
		String salt = UUIDUtil.getRandomString(6);
		String passwordEncrypt = AuthUtil.passwordEncrypt(password, salt);
		long accountCode = (long) ApiResultUtil.getObject(commonCountService.getAccountCode());
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
			throw new BusinessException(ResultStatus.LOGIN_SIGN_ERROR);
		}
		if (!authParam.getMemberPassword().equals(authParam.getReMemberPassword())) {//两次输入密码是否相同
			throw new BusinessException(ResultStatus.PASSWORD_REPASSWORD_DIFFERENT);
		}
		//解密
		String account = AuthUtil.convert2Plaintext(authParam.getMemberAccount());
		//校验格式，获取账号信息
		ApiResult r1 = verifyAccountTypeGetAccount(account, authParam.getAccountType());
		MemberAuth ma = (MemberAuth) ApiResultUtil.getObject(r1);
		if (ma == null) {
			throw new BusinessException(ResultStatus.ACCOUNT_NOT_EXIST);
		}
		String password = AuthUtil.convert2Plaintext(authParam.getMemberPassword());
		//密码长度
		if (StringUtil.moreThanLength(password, 16) || StringUtil.lessThanLength(password, 8)) {
			throw new BusinessException(ResultStatus.PASSWORD_LENGTH_INVALID);
		}
		String passwordEncrypt = AuthUtil.passwordEncrypt(password, ma.getAuthSalt());
		//管理员锁定
		if (MemberStatus.ADMIN_LOCKED.getCode().equals(ma.getCurrentStatus())) {
			throw new BusinessException(ResultStatus.MEMBER_LOCKED_BY_ADMIN);
		}
		//密码错误次数过多被锁定
		if (MemberStatus.ERROR_PASSWORD_LOCKED.getCode().equals(ma.getCurrentStatus())) {
			throw new BusinessException(ResultStatus.MEMBER_AUTH_OVERTIME);
		}
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
	 * 验证账号类型，获取账号信息
	 * @param account 账号
	 * @param accountType 账号类型
	 * @return 账号信息
	 * @throws BusinessException 发生异常
	 */
	private ApiResult verifyAccountTypeGetAccount(String account, String accountType) throws BusinessException {
		//校验格式，获取账号信息
		ApiResult r1;
		if (CommonContant.LOGIN_TYPE_PHONE.equals(accountType)) {//手机号登录
			if (!StringUtil.isPhone(account)) {
				throw new BusinessException(ResultStatus.ACCOUNT_FORMAT_ERROR);
			}
			//通过手机号获取账户
			r1 = memberAuthService.selectByPhone(account);
		} else if (CommonContant.LOGIN_TYPE_EMAIL.equals(accountType)) {//邮箱登录
			if (!StringUtil.isEmail(account)) {
				throw new BusinessException(ResultStatus.ACCOUNT_FORMAT_ERROR);
			}
			//通过邮箱获取账户
			r1 = memberAuthService.selectByEmail(account);
		} else {//登录格式错误
			throw new BusinessException(ResultStatus.LOGIN_TYPE_ERROR);
		}
		return r1;
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
		ApiResult apiResult = memberAuthService.updateByPrimaryKeySelective(memberAuth);
		if (apiResult.getCode() != 1000) {
			throw new BusinessException(apiResult);
		}
	}
}
