package com.wuhenjian.aurora.db.controller;

import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:51
 */
public interface SqlBaseController<M,Q> {
	String BASE_PATH = "/sql";

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	ApiResult deleteByPrimaryKey(Long id);

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	ApiResult insertSelective(M record);

	@RequestMapping(value = "/selectByQuery", method = RequestMethod.GET)
	ApiResult selectByCriteria(Q criteria, Page page);

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	ApiResult selectByPrimaryKey(Long id);

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	ApiResult updateByPrimaryKeySelective(M record);

	@RequestMapping(value = "/selectByModel", method = RequestMethod.GET)
	ApiResult selectByModel(M model, Page page);
}
