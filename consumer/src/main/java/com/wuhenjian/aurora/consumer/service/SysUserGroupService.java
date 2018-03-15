package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.SysUserGroupServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.SysUserGroup;
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
 * @date 2018/3/14 17:32
 */
@Service
@FeignClient(value = "db", fallback = SysUserGroupServiceExceptionHandler.class)
public interface SysUserGroupService {
	String BASE_PATH = "/sql/sysUserGroup";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	void deleteByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	void insertSelective(@RequestBody SysUserGroup m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	void updateByPrimaryKeySelective(@RequestBody SysUserGroup m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.POST)
	List<SysUserGroup> selectByModel(@RequestBody(required = false) SysUserGroup m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	SysUserGroup selectByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;
}
