package com.wuhenjian.aurora.db.mapper.nosql.redis;

import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/8 16:33
 */
@Repository("redisTemplateRepository")
public class RedisTemplateRepository {

	@Resource(name = "jedisCluster")
	private JedisCluster jedisCluster;

	/**
	 * 向redis中存入对象
	 * @param key 关键字
	 * @param value 值
	 * @param expire 过期时长（秒）
	 */
	public void set(String key, String value, Integer expire) {
		jedisCluster.setex(key, expire, value);
	}

	/**
	 * 获取字符串
	 * @param key 关键字
	 * @return 字符串
	 */
	public String get(String key) {
		return jedisCluster.get(key);
	}

	/**
	 * 删除对象
	 * @param key 关键字
	 */
	public void del(String key) {
		jedisCluster.del(key);
	}

}
