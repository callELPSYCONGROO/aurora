package com.wuhenjian.aurora.db.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 無痕剑
 * @date 2017/12/8 11:35
 */
@Configuration
public class RedisClusterConfig {

	@Value("${redis.cluster.nodes}")
	private String nodes;

	@Value("${redis.cluster.pool.max-idle}")
	private int maxIdle;

	@Value("${redis.cluster.pool.max-wait}")
	private long maxWaitMillis;

	@Value("${redis.cluster.pool.min-idle}")
	private int minIdle;

	@Bean(name = "jedisCluster")
	public JedisCluster jedisClusterFactory() {
		String[] split = nodes.trim().split(",");
		Set<HostAndPort> set = new HashSet<>();
		for (String node : split) {
			String[] hostAndPort = node.trim().split(":");
			String host = hostAndPort[0];
			int port = Integer.valueOf(hostAndPort[1]);
			set.add(new HostAndPort(host, port));
		}
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxIdle(maxIdle);
		jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
		jedisPoolConfig.setMinIdle(minIdle);
		return new JedisCluster(set, jedisPoolConfig);
	}
}
