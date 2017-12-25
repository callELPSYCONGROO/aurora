package com.wuhenjian.aurora.db.service.impl;

import com.alibaba.fastjson.JSON;
import com.wuhenjian.aurora.db.mapper.nosql.redis.RedisTemplateRepository;
import com.wuhenjian.aurora.db.service.RedisService;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/11 15:06
 */
@Service("tokenService")
public class RedisServiceImpl implements RedisService {

	@Resource(name = "redisTemplateRepository")
	private RedisTemplateRepository redisTemplateRepository;

	/**
	 * set存放key-value
	 * @param key   关键字
	 * @param value 值
	 * @param expire 缓存时间
	 */
	@Override
	public void set(String key, String value, Integer expire) {
		redisTemplateRepository.set(key, value, expire);
	}

	/**
	 * 获取关键字对应的值
	 * @param key 关键字
	 * @return 值
	 */
	@Override
	public String get(String key) {
		return redisTemplateRepository.get(key);
	}

	/**
	 * 删除key-value
	 * @param key key
	 */
	@Override
	public void del(String key) {
		String redisKey = this.getMemberInfoKey(key);
		redisTemplateRepository.del(redisKey);
	}

	/**
	 * 缓存Token及对应用户信息
	 * @param token token
	 * @param memberAcctInfo 用户信息
	 */
	@Override
	public void setToken(String token, MemberAcctInfo memberAcctInfo) {
		String key = this.getMemberInfoKey(token);
		String value = JSON.toJSONString(memberAcctInfo);
		this.set(key, value, CommonContant.TOKEN_EXPIRE);
	}

	/**
	 * 获取Token对应的用户信息
	 * @param token token
	 * @return 用户信息
	 */
	@Override
	public MemberAcctInfo getToken(String token) {
		String key = this.getMemberInfoKey(token);
		String value = this.get(key);
		return value == null ? null : JSON.parseObject(value, MemberAcctInfo.class);
	}


	/**
	 * 用户信息redis key前缀
	 * @param key key
	 * @return redis缓存key
	 */
	private String getMemberInfoKey(String key) {
		return CommonContant.MEMBER_REDIS_PRE + CommonContant.SEPARATOR + key;
	}
}
