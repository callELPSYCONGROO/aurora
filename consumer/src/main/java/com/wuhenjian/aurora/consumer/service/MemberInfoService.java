package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.MemberInfoServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author 無痕剑
 * @date 2017/12/21 14:16
 */
@Service
@FeignClient(value = "db", fallback = MemberInfoServiceExceptionHandler.class)
public interface MemberInfoService {
	String BASE_PATH = "/sql/memberInfo";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	ApiResult deleteByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	ApiResult insertSelective(@RequestBody MemberInfo m);

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	ApiResult selectByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	ApiResult updateByPrimaryKeySelective(@RequestBody MemberInfo m);

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.POST)
	ApiResult selectByModel(@RequestParam MemberInfo m);

	@RequestMapping(value = BASE_PATH + "selectByMaid", method = RequestMethod.GET)
	ApiResult selectByMaid(@RequestParam("maId") Long maId);

	@RequestMapping(value = BASE_PATH + "/updateMemberInfoByMaId", method = RequestMethod.POST)
	ApiResult updateMemberInfoByMaId(@RequestBody MemberInfo m);
}
