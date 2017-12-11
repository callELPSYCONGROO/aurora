package com.wuhenjian.aurora.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 無痕剑
 * @date 2017/12/11 16:00
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = DbServerApplication.class)
public class RedisSingleTest {

	@Test
	public void setRedis() throws IOException {
		Set<HostAndPort> set = new HashSet<>();
		set.add(new HostAndPort("192.168.28.132", 6380));
		JedisCluster jedisCluster = new JedisCluster(set, 5000);
		jedisCluster.setex("ceshi", 60, "shide2333");
		System.out.println(jedisCluster.get("ceshi"));
		jedisCluster.close();
	}

	@Test
	public void linkSingleRedis() {
		JedisPool jedisPool = new JedisPool("192.168.28.132", 6379);
		Jedis jedis = jedisPool.getResource();
		jedis.setex("ceshi", 30, "nimei");
		System.out.println(jedis.get("ceshi"));
	}
}
