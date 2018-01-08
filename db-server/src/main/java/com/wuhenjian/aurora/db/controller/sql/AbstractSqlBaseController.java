package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2017/12/19 16:24
 */
public abstract class AbstractSqlBaseController<M,Q> {
	public final static String BASE_PATH = "/sql";

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public abstract ApiResult deleteByPrimaryKey(Long id);

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public abstract ApiResult insertSelective(M record);

	@RequestMapping(value = "/selectByQuery", method = RequestMethod.GET)
	public abstract ApiResult selectByCriteria(Q criteria, Page page);

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public abstract ApiResult selectByPrimaryKey(Long id);

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public abstract ApiResult updateByPrimaryKeySelective(M record);

	@RequestMapping(value = "/selectByModel", method = RequestMethod.GET)
	public abstract ApiResult selectByModel(M model, Page page);
}
