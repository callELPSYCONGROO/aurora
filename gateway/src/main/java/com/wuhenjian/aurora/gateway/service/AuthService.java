package com.wuhenjian.aurora.gateway.service;

import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2017/12/13 11:42
 */
@Service
@FeignClient(value = "auth")
public interface AuthService {
	/**
	 * 解析token获得用户账户和uuid
	 * @param token token
	 * @return 用户账户和uuid
	 */
	@RequestMapping(value = "/auth/token/decodeToken", method = RequestMethod.GET)
	ApiResult decodeToken(String token);
}
