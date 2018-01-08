package com.wuhenjian.aurora.memberservice.service;

import com.wuhenjian.aurora.memberservice.excphandler.CommonCountServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2017/12/27 11:28
 */
@Service
@FeignClient(value = "db", fallback = CommonCountServiceExceptionHandler.class)
public interface CommonCountService {

	@RequestMapping(value = "/getAccountCode", method = RequestMethod.GET)
	ApiResult getAccountCode();

	@RequestMapping(value = "/addAccountCode", method = RequestMethod.POST)
	ApiResult addAccountCode();
}
