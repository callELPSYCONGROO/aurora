package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.ZimgServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @author SwordNoTrace
 * @date 2018/1/6 10:08
 */
@Service
@FeignClient(value = "file", fallback = ZimgServiceExceptionHandler.class)
public interface ZimgService {

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	ApiResult upload(Map<String, Map<String, Object>> params);

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	ApiResult info(String imgMd5);

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	ApiResult delete(String imgMd5);
}
