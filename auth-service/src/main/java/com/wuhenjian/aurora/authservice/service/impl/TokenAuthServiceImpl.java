package com.wuhenjian.aurora.authservice.service.impl;

import com.wuhenjian.aurora.authservice.service.RedisService;
import com.wuhenjian.aurora.authservice.service.TokenAuthService;
import com.wuhenjian.aurora.utils.UUIDUtil;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import com.wuhenjian.aurora.utils.security.Base64Util;
import com.wuhenjian.aurora.utils.security.RSAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:23
 */
@Service("tokenAuthService")
public class TokenAuthServiceImpl implements TokenAuthService {
	/** 公匙 */
	@Value("${rsa.key.private}")
	private String privateKey;
	/** 私匙 */
	@Value("${rsa.key.public}")
	private String publicKey;

	@Autowired
	private RedisService redisService;

	/**
	 * 创建Token
	 * @param accountCode 用户账号
	 * @return Token信息
	 */
	@Override
	public TokenInfo createToken(Long accountCode) throws BusinessException {
		String uuid = UUIDUtil.getUuid();//获取uuid
		String token = RSAUtil.encrypt(uuid, this.publicKey);//RSA加密得到Token
		ApiResult apiResult = redisService.setToken(token);
		if (apiResult.getCode() != 1000) {
			throw new BusinessException(apiResult);
		}
		return new TokenInfo(token);
	}

	/**
	 * 验证token
	 * @param token token
	 * @return 正确为true，错误为false
	 */
	@Override
	public boolean authToken(String token) {
		try {
			String decode2Str = Base64Util.decode2Str(token);
			RSAUtil.decrypt(decode2Str, privateKey);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 根据token获取uuid
	 * @param token token
	 * @return uuid
	 * @throws BusinessException 发生异常
	 */
	@Override
	public String decodeToken(String token) throws BusinessException {
		String decode2Str = Base64Util.decode2Str(token);
		return RSAUtil.decrypt(decode2Str, privateKey);
	}
}
