package com.wuhenjian.aurora.db.service.impl;

import com.alibaba.fastjson.JSON;
import com.wuhenjian.aurora.db.mapper.nosql.redis.RedisTemplateRepository;
import com.wuhenjian.aurora.db.service.RedisService;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.constant.CommonContant;
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
	 * 缓存Token及对应用户信息
	 * @param token token
	 * @param memberAcctInfo 用户信息
	 */
	@Override
	public void setToken(String token, MemberAcctInfo memberAcctInfo) {
		String key = this.getTokenKey(token);
		String value = JSON.toJSONString(memberAcctInfo);
		redisTemplateRepository.set(key, value, CommonContant.TOKEN_EXPIRE);
	}

	/**
	 * 获取Token对应的用户信息
	 * @param token token
	 * @return 用户信息
	 */
	@Override
	public MemberAcctInfo getToken(String token) {
		String key = this.getTokenKey(token);
		String value = redisTemplateRepository.get(key);
		return JSON.parseObject(value, MemberAcctInfo.class);
	}

	/**
	 * 删除Token缓存
	 * @param token token
	 */
	@Override
	public void delToken(String token) {
		String key = this.getTokenKey(token);
		redisTemplateRepository.del(new String[]{key});
	}

	private String getTokenKey(String token) {
		return CommonContant.MEMBER_REDIS_PRE + CommonContant.SEPARATOR + token;
	}
}
