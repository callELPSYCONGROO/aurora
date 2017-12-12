package com.wuhenjian.aurora.authservice.service;

import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.exception.BusinessException;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:20
 */
public interface TokenAuthService {

	/**
	 * 创建Token
	 * @param accountCode 用户账号
	 * @return Token信息
	 */
	TokenInfo createToken(Long accountCode) throws BusinessException;

	/**
	 * 验证token
	 * @param token token
	 * @return 正确为true，错误为false
	 */
	boolean authToken(String token) throws BusinessException;
}
