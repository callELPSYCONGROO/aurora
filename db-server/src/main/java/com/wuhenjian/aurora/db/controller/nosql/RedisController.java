package com.wuhenjian.aurora.db.controller.nosql;

import com.wuhenjian.aurora.db.service.RedisService;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/8 16:34
 */
@RestController
@RequestMapping(CommonContant.NO_SQL + "/redis")
public class RedisController {

	@Resource(name = "tokenService")
	private RedisService redisService;

	@RequestMapping(value = "/setToken", method = RequestMethod.POST)
	public void setToken(String token, MemberAcctInfo memberAcctInfo) {
		redisService.setToken(token, memberAcctInfo);
	}

	@RequestMapping(value = "/getToken", method = RequestMethod.GET)
	public MemberAcctInfo getToken(String token) {
		return redisService.getToken(token);
	}

	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public void del(String key) {
		redisService.del(key);
	}

	@RequestMapping(value = "set", method = RequestMethod.POST)
	public void set(String key, String value, Integer expire) {
		redisService.set(key, value, expire);
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get(String key) {
		return redisService.get(key);
	}
}
