package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.PhpProjectServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/11 16:34
 */
@Service
@FeignClient(value = "db", fallback = PhpProjectServiceExceptionHandler.class)
public interface PhpProjectService {
	String BASE_PATH = "/sql/phpProject";

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	ApiResult insertSelective(@RequestBody PhpProject m);

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	ApiResult updateByPrimaryKeySelective(@RequestBody PhpProject m);

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.POST)
	ApiResult selectByModel(@RequestBody PhpProject m);

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	ApiResult selectByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = "/selectByAcctAndRepo", method = RequestMethod.GET)
	ApiResult selectByAcctAndRepo(@RequestParam("acct") String acct, @RequestParam("repo") String repo);

	@RequestMapping("/getList")
	List<PhpProject> getList();
}
