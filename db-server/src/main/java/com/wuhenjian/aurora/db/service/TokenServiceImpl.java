package com.wuhenjian.aurora.db.service;

import com.alibaba.fastjson.JSON;
import com.wuhenjian.aurora.db.dao.nosql.redis.RedisTemplateRepository;
import com.wuhenjian.aurora.utils.entity.MemberInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/11 15:06
 */
@Service("tokenService")
public class TokenServiceImpl implements TokenService {

	@Resource(name = "redisTemplateRepository")
	private RedisTemplateRepository redisTemplateRepository;

	/**
	 * 缓存Token及对应用户信息
	 * @param token token
	 * @param memberInfo 用户信息
	 * @param expire 过期时长（秒）
	 */
	@Override
	public void setToken(String token, MemberInfo memberInfo, Integer expire) {
		String key = this.getTokenKey(token);
		String value = JSON.toJSONString(memberInfo);
		redisTemplateRepository.set(key, value, expire);
	}

	/**
	 * 获取Token对应的用户信息
	 * @param token token
	 * @return 用户信息
	 */
	@Override
	public MemberInfo getToken(String token) {
		String key = this.getTokenKey(token);
		String value = redisTemplateRepository.get(key);
		return JSON.parseObject(value, MemberInfo.class);
	}

	/**
	 * 删除Token缓存
	 * @param token token
	 */
	@Override
	public void delToken(String token) {
		String key = this.getTokenKey(token);

	}

	private String getTokenKey(String token) {
		return TokenService.MEMBER_REDIS_PRE + TokenService.SEPARATOR + token;
	}
}
