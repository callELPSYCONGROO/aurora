package com.wuhenjian.aurora.authservice.service;

import com.wuhenjian.aurora.authservice.exceptionhandler.FeignServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 無痕剑
 * @date 2017/12/12 15:56
 */
@Service("redisService")
@FeignClient(value = "db", fallback = FeignServiceExceptionHandler.class)
public interface RedisService {

	@RequestMapping("/redis/setToken")
	ApiResult setToken(String token);

	@RequestMapping("/redis/getToken")
	ApiResult getToken(String token);

	@RequestMapping("/redis/delToken")
	ApiResult delToken(String token);
}
