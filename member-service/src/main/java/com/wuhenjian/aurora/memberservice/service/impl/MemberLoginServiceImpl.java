package com.wuhenjian.aurora.memberservice.service.impl;

import com.wuhenjian.aurora.memberservice.service.*;
import com.wuhenjian.aurora.utils.ApiResultUtil;
import com.wuhenjian.aurora.utils.AuthUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.entity.constant.MemberStatus;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
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

	@Value("${rsa.key.public}")
	private String privateKey;

	@Resource(name = "memberAuthService")
	private MemberAuthService memberAuthService;

	@Resource(name = "memberInfoService")
	private MemberInfoService memberInfoService;

	@Resource(name = "redisService")
	private RedisService redisService;

	@Override
	public TokenInfo login(String loginType, String memberAccount, String memberPassword, String paramSign) throws BusinessException {
		//验证签名
		Map<String,String> map = new HashMap<>();
		map.put("loginType", loginType);
		map.put("memberAccount", memberAccount);
		map.put("memberPassword", memberPassword);
		String encode = SHA256.encode(map);
		if (!paramSign.equals(encode)) {
			throw new BusinessException(ResultStatus.LOGIN_SIGN_ERROR);
		}
		//解密
		String sma = Base64Util.decode2Str(memberAccount);
		String smp = Base64Util.decode2Str(memberPassword);
		String account = RSAUtil.decrypt(sma, privateKey);
		String password = RSAUtil.decrypt(smp, privateKey);

		ApiResult r1;
		//校验格式，获取账号信息
		if ("p".equals(loginType)) {//手机号登录
			if (!StringUtil.isPhone(account)) {
				throw new BusinessException(ResultStatus.ACCOUNT_FORMAT_ERROR);
			}
			//通过手机号获取账户
			r1 = memberAuthService.selectByPhone(account);
		} else if ("e".equals(loginType)) {//邮箱登录
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
		String sha256Password = SHA256.encode(password);
		if (!ma.getMemberPassword().equals(sha256Password)) {//验证密码
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
	public void register(String registerType, String memberAccount, String memberPassword, String reMemberPassword, String paramSign) throws BusinessException {

		if (!memberPassword.equals(reMemberPassword)) {//两次输入密码是否相同
			throw new BusinessException(ResultStatus.PASSWORD_REPASSWORD_DIFFERENT);
		}
		//解密
		String smp = Base64Util.decode2Str(memberPassword);
		String sma = Base64Util.decode2Str(memberAccount);
		String account = RSAUtil.decrypt(sma, privateKey);
		String password = RSAUtil.decrypt(smp, privateKey);
		//TODO 注册
	}
}
