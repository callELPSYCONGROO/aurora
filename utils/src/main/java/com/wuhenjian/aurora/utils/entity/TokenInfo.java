package com.wuhenjian.aurora.utils.entity;

import com.wuhenjian.aurora.utils.entity.constant.CommonContant;

/**
 * 返回的Token
 * @author 無痕剑
 * @date 2017/12/6 14:59
 */
public class TokenInfo {

	private String token;

	private Integer expire = CommonContant.TOKEN_EXPIRE;

	public TokenInfo() {}

	public TokenInfo(String token, Integer expire) {
		this.expire = expire;
		this.token = token;
	}

	public TokenInfo(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getExpire() {
		return expire;
	}

	public void setExpire(Integer expire) {
		this.expire = expire;
	}
}
