package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.MemberAuthServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 無痕剑
 * @date 2017/12/21 11:26
 */
@Service
@FeignClient(value = "db", fallback = MemberAuthServiceExceptionHandler.class)
public interface MemberAuthService {
	
	String BASE_PATH = "/sql/memberAuth";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	ApiResult deleteByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	ApiResult insertSelective(@RequestBody MemberAuth m);

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	ApiResult selectByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	ApiResult updateByPrimaryKeySelective(@RequestBody MemberAuth m);

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.POST)
	ApiResult selectByModel(@RequestParam MemberAuth m);

	@RequestMapping(value = BASE_PATH + "/selectByPhone", method = RequestMethod.GET)
	ApiResult selectByPhone(@RequestParam("phone") String phone);

	@RequestMapping(value = BASE_PATH + "/selectByEmail", method = RequestMethod.GET)
	ApiResult selectByEmail(@RequestParam("email") String email);
}
