package com.wuhenjian.aurora.memberservice.service;

import com.wuhenjian.aurora.memberservice.excphandler.MemberInfoServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfoCriteria;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2017/12/21 14:16
 */
@Service
@FeignClient(value = "db", fallback = MemberInfoServiceExceptionHandler.class)
public interface MemberInfoService {
	String BASE_PATH = "/sql/memberInfo";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	ApiResult deleteByPrimaryKey(Long id);

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	ApiResult insertSelective(MemberInfo record);

	@RequestMapping(value = BASE_PATH + "/selectByQuery", method = RequestMethod.GET)
	ApiResult selectByCriteria(MemberInfoCriteria criteria, Page page);

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	ApiResult selectByPrimaryKey(Long id);

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	ApiResult updateByPrimaryKeySelective(MemberInfo record);

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.GET)
	ApiResult selectByModel(MemberInfo model, Page page);

	@RequestMapping(value = BASE_PATH + "selectByMaid", method = RequestMethod.GET)
	ApiResult selectByMaid(Long maId);

	@RequestMapping(value = BASE_PATH + "/updateMemberInfoByMaId", method = RequestMethod.POST)
	ApiResult updateMemberInfoByMaId(MemberInfo memberInfo);
}
