package com.wuhenjian.aurora.memberservice.service;

import com.wuhenjian.aurora.memberservice.excphandler.TokenAuthServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:20
 */
@Service
@FeignClient(value = "auth", fallback = TokenAuthServiceExceptionHandler.class)
public interface TokenAuthService {
	String BASE_PATH = "/auth/token";

	@RequestMapping(value = BASE_PATH + "create", method = RequestMethod.POST)
	ApiResult createToken();

	@RequestMapping(value = BASE_PATH + "right", method = RequestMethod.GET)
	ApiResult authToken(String token);

	@RequestMapping(value = BASE_PATH + "decodeToken", method = RequestMethod.GET)
	ApiResult decodeToken(String token);
}
