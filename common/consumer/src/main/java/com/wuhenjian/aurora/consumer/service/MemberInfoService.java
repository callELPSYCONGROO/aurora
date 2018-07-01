package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.MemberInfoServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
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
 * @date 2017/12/21 14:16
 */
@Service
@FeignClient(value = "db", fallback = MemberInfoServiceExceptionHandler.class)
public interface MemberInfoService {
	String BASE_PATH = "/sql/memberInfo";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	void deleteByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	void insertSelective(@RequestBody MemberInfo m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	MemberInfo selectByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	void updateByPrimaryKeySelective(@RequestBody MemberInfo m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.POST)
	List<MemberInfo> selectByModel(@RequestParam MemberInfo m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "selectByMaid", method = RequestMethod.GET)
	MemberAcctInfo selectByMaid(@RequestParam("maId") Long maId) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/updateMemberInfoByMaId", method = RequestMethod.POST)
	void updateMemberInfoByMaId(@RequestBody MemberInfo m) throws BusinessException;
}
