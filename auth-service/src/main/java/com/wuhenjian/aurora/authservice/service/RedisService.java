package com.wuhenjian.aurora.authservice.service;

import com.wuhenjian.aurora.authservice.service.impl.RedisServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2017/12/12 15:56
 */
@Service
@FeignClient(value = "db", fallback = RedisServiceExceptionHandler.class)
public interface RedisService {

	@RequestMapping(value = "/redis/setToken", method = RequestMethod.POST)
	ApiResult setToken(String token);

	@RequestMapping(value = "/redis/getToken", method = RequestMethod.GET)
	ApiResult getToken(String token);

	@RequestMapping(value = "/redis/delToken", method = RequestMethod.POST)
	ApiResult delToken(String token);
}
