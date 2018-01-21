package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.PhpProjectServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
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
 * @date 2018/1/11 16:34
 */
@Service
@FeignClient(value = "db", fallback = PhpProjectServiceExceptionHandler.class)
public interface PhpProjectService {
	String BASE_PATH = "/sql/phpProject";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	int deleteByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	int insertSelective(@RequestBody PhpProject m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	int updateByPrimaryKeySelective(@RequestBody PhpProject m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.POST)
	List<PhpProject> selectByModel(@RequestBody(required = false) PhpProject m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	PhpProject selectByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByAcctAndRepo", method = RequestMethod.GET)
	PhpProject selectByAcctAndRepo(@RequestParam("acct") String acct, @RequestParam("repo") String repo) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectRepoByAcct", method = RequestMethod.POST)
	List<GithubRepo> selectRepoByAcct(@RequestBody PhpProject m) throws BusinessException;
}
