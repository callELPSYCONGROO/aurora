package com.wuhenjian.aurora.taskservice.service;

import com.wuhenjian.aurora.taskservice.excphandler.PhpProjectServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dao.PhpProjectCriteria;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 無痕剑
 * @date 2018/1/11 16:34
 */
@Service("phpProjectService")
@FeignClient(value = "db", fallback = PhpProjectServiceExceptionHandler.class)
public interface PhpProjectService {
	String BASE_PATH = "/sql/phpProject";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	ApiResult deleteByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	ApiResult insertSelective(PhpProject record);

	@RequestMapping(value = BASE_PATH + "/selectByQuery", method = RequestMethod.GET)
	ApiResult selectByCriteria(@RequestParam("criteria") PhpProjectCriteria criteria, @RequestParam("page") Page page);

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	ApiResult selectByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	ApiResult updateByPrimaryKeySelective(PhpProject record);

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.GET)
	ApiResult selectByModel(@RequestParam("model") PhpProject model, @RequestParam("page") Page page);

	@RequestMapping(value = "/selectByAcctAndRepo", method = RequestMethod.GET)
	ApiResult selectByAcctAndRepo(@RequestParam("acct") String acct, @RequestParam("repo") String repo);
}
