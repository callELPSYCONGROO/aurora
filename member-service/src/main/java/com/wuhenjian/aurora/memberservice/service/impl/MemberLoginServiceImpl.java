package com.wuhenjian.aurora.memberservice.service.impl;

import com.wuhenjian.aurora.memberservice.service.*;
import com.wuhenjian.aurora.utils.ApiResultUtil;
import com.wuhenjian.aurora.utils.AuthUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.UUIDUtil;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.constant.MemberStatus;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import com.wuhenjian.aurora.utils.security.Base64Util;
import com.wuhenjian.aurora.utils.security.RSAUtil;
import com.wuhenjian.aurora.utils.security.SHA256;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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

	@Override
	public TokenInfo login(String deviceType, String loginType, String memberAccount, String memberPassword, String paramSign) throws BusinessException {
		//解密
		String account = AuthUtil.convert2Plaintext(memberAccount);
		//校验格式，获取账号信息
		ApiResult r1;
		if (CommonContant.LOGIN_TYPE_PHONE.equals(loginType)) {//手机号登录
			if (!StringUtil.isPhone(account)) {
				throw new BusinessException(ResultStatus.ACCOUNT_FORMAT_ERROR);
			}
			//通过手机号获取账户
			r1 = memberAuthService.selectByPhone(account);
		} else if (CommonContant.LOGIN_TYPE_EMAIL.equals(loginType)) {//邮箱登录
			if (!StringUtil.isEmail(account)) {
				throw new BusinessException(ResultStatus.ACCOUNT_FORMAT_ERROR);
			}
			//通过邮箱获取账户
			r1 = memberAuthService.selectByEmail(account);
		} else {//登录格式错误
			throw new BusinessException(ResultStatus.LOGIN_TYPE_ERROR);
		}
		MemberAuth ma = (MemberAuth) ApiResultUtil.getObject(r1);
		if (ma == null) {
			throw new BusinessException(ResultStatus.ACCOUNT_NOT_EXIST);
		}
		String password = AuthUtil.convert2Plaintext(memberPassword);
		if (StringUtil.moreThanLength(password, 16) && StringUtil.lessThanLength(password, 8)) {//密码长度
			throw new BusinessException(ResultStatus.PASSWORD_LENGTH_INVALID);
		}
		if (!AuthUtil.verifyPassword(password, ma.getAuthSalt(), ma.getMemberPassword())) {//验证密码
			throw new BusinessException(ResultStatus.PASSWORD_ISVALID);
		}
		if (MemberStatus.ERROR_PASSWORD_LOCKED.getCode().equals(ma.getCurrentStatus())) {//密码错误次数过多被锁定
			throw new BusinessException(ResultStatus.MEMBER_AUTH_OVERTIME);
		} else if (MemberStatus.ADMIN_LOCKED.getCode().equals(ma.getCurrentStatus())) {//管理员锁定
			throw new BusinessException(ResultStatus.MEMBER_LOCKED_BY_ADMIN);
		}
		if (ma.getAuthFail() > 5) {//密码错误超过5次
			ma.setAuthFail(ma.getAuthFail() + 1);
			ma.setCurrentStatus(MemberStatus.ERROR_PASSWORD_LOCKED.getCode());
			ma.setUpdateTime(new Date());
			memberAuthService.updateByPrimaryKeySelective(ma);
			throw new BusinessException(ResultStatus.MEMBER_AUTH_OVERTIME);
		}
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
	public void register(String deviceType, String registerType, String memberAccount, String memberPassword, String reMemberPassword, String paramSign) throws BusinessException {
		if (!memberPassword.equals(reMemberPassword)) {//两次输入密码是否相同
			throw new BusinessException(ResultStatus.PASSWORD_REPASSWORD_DIFFERENT);
		}
		String account = AuthUtil.convert2Plaintext(memberAccount);
		ApiResult r1 = null;
		if (CommonContant.LOGIN_TYPE_PHONE.equals(registerType) && StringUtil.isPhone(account)) {
			r1 = memberAuthService.selectByPhone(account);
		} else if (CommonContant.LOGIN_TYPE_EMAIL.equals(registerType) && StringUtil.isEmail(account)) {
			r1 = memberAuthService.selectByEmail(account);
		}
		if (r1 == null) {//注册类型与账号不匹配
			throw new BusinessException(ResultStatus.REGISTER_TYPE_AND_ACCOUNT_NOT_MATCH);
		}
		MemberAuth ma = (MemberAuth) ApiResultUtil.getObject(r1);
		if (ma != null) {//注册账号是否存在
			throw new BusinessException(ResultStatus.MEMBER_ACCOUNT_EXISTED);
		}
		String password = AuthUtil.convert2Plaintext(memberPassword);
		if (StringUtil.moreThanLength(password, 16) && StringUtil.lessThanLength(password, 8)) {
			throw new BusinessException(ResultStatus.PASSWORD_LENGTH_INVALID);
		}
		String salt = UUIDUtil.getRandomString(6);
		String passwordEncrypt = AuthUtil.passwordEncrypt(password, salt);
//		long accountCode = ;
		MemberAuth memberAuth = new MemberAuth();
		if (CommonContant.LOGIN_TYPE_PHONE.equals(registerType)) {
			memberAuth.setMemberPhone(account);
		} else if (CommonContant.LOGIN_TYPE_EMAIL.equals(registerType)) {
			memberAuth.setMemberEmail(account);
		}
		memberAuth.setMemberPassword(passwordEncrypt);
		memberAuth.setAuthSalt(salt);
//		memberAuth.setAccountCode(accountCode);
		memberAuth.setAuthFail(0);
		memberAuth.setCurrentStatus(MemberStatus.NORMAL.getCode());
		memberAuth.setRegisterTime(new Date());
		memberAuth.setUpdateTime(new Date());
	}
}
