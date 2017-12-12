package com.wuhenjian.aurora.db.service;

import com.wuhenjian.aurora.utils.entity.MemberInfo;

/**
 * @author 無痕剑
 * @date 2017/12/11 14:45
 */
public interface RedisService {

	/**
	 * 缓存Token及对应用户信息
	 * @param token token
	 * @param memberInfo 用户信息
	 */
	void setToken(String token, MemberInfo memberInfo);

	/**
	 * 获取Token对应的用户信息
	 * @param token token
	 * @return 用户信息
	 */
	MemberInfo getToken(String token);

	/**
	 * 删除Token缓存
	 * @param token token
	 */
	void delToken(String token);
}
