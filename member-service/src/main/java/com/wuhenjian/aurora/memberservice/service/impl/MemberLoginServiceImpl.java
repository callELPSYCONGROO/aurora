package com.wuhenjian.aurora.memberservice.service.impl;

import com.wuhenjian.aurora.memberservice.service.MemberAuthService;
import com.wuhenjian.aurora.memberservice.service.MemberInfoService;
import com.wuhenjian.aurora.memberservice.service.MemberLoginService;
import com.wuhenjian.aurora.memberservice.service.TokenAuthService;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
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

	@Resource(name = "tokenAuthService")
	private TokenAuthService tokenAuthService;

	@Override
	public TokenInfo login(String loginType, String memberAccount, String memberPassword, String paramSign) throws BusinessException {
		//验证签名

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
		//校验合法性
		if (r1 == null || r1.getCode() != 1000) {
			throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
		}
		MemberAuth ma = (MemberAuth) r1.getData();
		if (ma == null) {
			throw new BusinessException(ResultStatus.ACCOUNT_NOT_EXIST);
		}
		String sha256Password = SHA256.encode(password);
		if (!ma.getMemberPassword().equals(sha256Password)) {
			throw new BusinessException(ResultStatus.PASSWORD_ISVALID);
		}
		//获取用户信息，存入redis中缓存
		//TODO 登陆逻辑没有写完
		//获取token
		ApiResult r2 = tokenAuthService.createToken();
		if (r2.getCode() != 1000) {
			throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
		}
		String token = (String) r2.getData();


		return null;
	}
}
