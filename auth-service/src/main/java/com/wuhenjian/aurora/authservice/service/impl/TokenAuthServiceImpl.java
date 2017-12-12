package com.wuhenjian.aurora.authservice.service.impl;

import com.wuhenjian.aurora.authservice.service.RedisService;
import com.wuhenjian.aurora.authservice.service.TokenAuthService;
import com.wuhenjian.aurora.utils.UUIDUtil;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.entity.TokenModel;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import com.wuhenjian.aurora.utils.security.Base64Util;
import com.wuhenjian.aurora.utils.security.RSAUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

	@Resource(name = "redisService")
	private RedisService redisService;

	/**
	 * 创建Token
	 * @param accountCode 用户账号
	 * @return Token信息
	 */
	@Override
	public TokenInfo createToken(Long accountCode) throws BusinessException {
		String uuid = UUIDUtil.getUuid();//获取uuid
		TokenModel tokenModel = new TokenModel();
		tokenModel.setAccountCode(accountCode);
		tokenModel.setUuid(uuid);
		String accAndUuid = tokenModel.toStringByAccAndUuid();//拼接uuid和accountCode
		String base64 = Base64Util.encode2Str(accAndUuid);//转码
		String token = RSAUtil.encrypt(base64, this.publicKey);//RSA加密得到Token
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
	public boolean authToken(String token) throws BusinessException {
		if (token == null) {
			return false;
		}
		try {
			String decrypt = RSAUtil.decrypt(token, privateKey);
			String accAndUuid = Base64Util.decode2Str(decrypt);
			TokenModel.accuuid2Obj(accAndUuid);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
