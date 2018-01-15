package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.MemberAuthServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
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
 * @date 2017/12/21 11:26
 */
@Service
@FeignClient(value = "db", fallback = MemberAuthServiceExceptionHandler.class)
public interface MemberAuthService {
	
	String BASE_PATH = "/sql/memberAuth";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	int deleteByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	int insertSelective(@RequestBody MemberAuth m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	MemberAuth selectByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	int updateByPrimaryKeySelective(@RequestBody MemberAuth m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.POST)
	List<MemberAuth> selectByModel(@RequestParam MemberAuth m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByPhone", method = RequestMethod.GET)
	MemberAuth selectByPhone(@RequestParam("phone") String phone) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByEmail", method = RequestMethod.GET)
	MemberAuth selectByEmail(@RequestParam("email") String email) throws BusinessException;
}
