package com.wuhenjian.aurora.authservice.service.impl;

import com.wuhenjian.aurora.authservice.service.TokenAuthService;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import org.springframework.stereotype.Service;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:23
 */
@Service("tokenAuthService")
public class TokenAuthServiceImpl implements TokenAuthService {

	/**
	 * 创建Token
	 * @param accountCode 用户账号
	 * @return Token信息
	 */
	@Override
	public TokenInfo createToken(Long accountCode) {

		return null;
	}
}
