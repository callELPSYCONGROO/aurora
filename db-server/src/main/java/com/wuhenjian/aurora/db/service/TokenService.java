package com.wuhenjian.aurora.db.service;

import com.wuhenjian.aurora.utils.entity.MemberInfo;

/**
 * @author 無痕剑
 * @date 2017/12/11 14:45
 */
public interface TokenService {

	/**
	 * Token缓存前缀名称
	 * <p>redis缓存关键字组成：</p>
	 * <p>类型-用户账号-缓存关键字</p>
	 * <p>例如：M-1387593084-MfSdfhGFK28sdiS4348JD7sdDYJ</p>
	 */
	String SEPARATOR = "-";

	/** 用户 */
	String MEMBER_REDIS_PRE = "M";

	/** SQL查询的redis缓存 */
	String SQL_REDIS_PRE = "S";

	/**
	 * 缓存Token及对应用户信息
	 * @param token token
	 * @param memberInfo 用户信息
	 * @param expire 过期时长（秒）
	 */
	void setToken(String token, MemberInfo memberInfo, Integer expire);

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
