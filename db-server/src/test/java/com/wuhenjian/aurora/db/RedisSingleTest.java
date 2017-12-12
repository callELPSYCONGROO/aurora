package com.wuhenjian.aurora.db;

import org.junit.Test;
import redis.clients.jedis.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 無痕剑
 * @date 2017/12/11 16:00
 */
public class RedisSingleTest {

	@Test
	public void setRedis() throws IOException {
		Set<HostAndPort> set = new HashSet<>();
		set.add(new HostAndPort("192.168.28.132", 6385));
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxTotal(200);
		jedisPoolConfig.setMaxIdle(100);
		jedisPoolConfig.setMinIdle(10);
		jedisPoolConfig.setMaxWaitMillis(10000);
//		jedisPoolConfig.setTestOnBorrow(true);
//		jedisPoolConfig.setTestOnReturn(true);
//		jedisPoolConfig.setTestWhileIdle(true);
//		jedisPoolConfig.setTimeBetweenEvictionRunsMillis(30000);
//		jedisPoolConfig.setNumTestsPerEvictionRun(10);
//		jedisPoolConfig.setMinEvictableIdleTimeMillis(60000);
		JedisCluster jedisCluster = new JedisCluster(set, 50000, jedisPoolConfig);
		jedisCluster.set("qwe", "123");
		jedisCluster.setex("ceshi", 60, "shide2333");
		System.out.println(jedisCluster.get("ceshi"));
	}

	@Test
	public void linkSingleRedis() {
		JedisPool jedisPool = new JedisPool("192.168.28.132", 6379);
		Jedis jedis = jedisPool.getResource();
		jedis.setex("ceshi", 30, "nimei");
		System.out.println(jedis.get("ceshi"));
	}
}
