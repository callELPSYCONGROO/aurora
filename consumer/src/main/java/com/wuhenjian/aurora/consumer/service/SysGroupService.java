package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.SysGroupServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.SysGroup;
import com.wuhenjian.aurora.utils.entity.vo.GithubRepo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/3/15 9:47
 */
@Service
@FeignClient(value = "db", fallback = SysGroupServiceExceptionHandler.class)
public interface SysGroupService {
	String BASE_PATH = "/sql/sysGroup";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	void deleteByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	void insertSelective(@RequestBody SysGroup m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	void updateByPrimaryKeySelective(@RequestBody SysGroup m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.POST)
	List<SysGroup> selectByModel(@RequestBody(required = false) SysGroup m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	SysGroup selectByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "selectBySuId", method = RequestMethod.GET)
	SysGroup selectBySuId(@RequestParam("suId") Long suId) throws BusinessException;
}
