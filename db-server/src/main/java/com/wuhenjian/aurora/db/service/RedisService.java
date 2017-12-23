package com.wuhenjian.aurora.db.service;

import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;

/**
 * @author 無痕剑
 * @date 2017/12/11 14:45
 */
public interface RedisService {

	/**
	 * 缓存Token及对应用户信息
	 * @param token token
	 * @param memberAcctInfo 用户信息
	 */
	void setToken(String token, MemberAcctInfo memberAcctInfo);

	/**
	 * 获取Token对应的用户信息
	 * @param token token
	 * @return 用户信息
	 */
	MemberAcctInfo getToken(String token);

	/**
	 * 删除key-value
	 * @param key key
	 */
	void del(String key);

	/**
	 * set存放key-value
	 * @param key 关键字
	 * @param value 值
	 * @param expire 缓存时间
	 */
	void set(String key, String value, Integer expire);

	/**
	 * 获取关键字对应的值
	 * @param key 关键字
	 * @return 值
	 */
	String get(String key);
}
