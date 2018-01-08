package com.wuhenjian.aurora.memberservice.service;

import com.wuhenjian.aurora.memberservice.excphandler.NotifyServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2017/12/28 16:42
 */
@Service
@FeignClient(value = "notify", fallback = NotifyServiceExceptionHandler.class)
public interface NotifyService {

	@RequestMapping(value = "/email/getCaptcha", method = RequestMethod.POST)
	ApiResult getCaptcha(String to, Integer type);
}
