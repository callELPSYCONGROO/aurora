package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 無痕剑
 * @date 2017/12/19 16:24
 */
public abstract class AbstractSqlBaseController<M extends Page> {
	public final static String BASE_PATH = "/sql";

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public abstract ApiResult deleteByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public abstract ApiResult insertSelective(@RequestBody M m);

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public abstract ApiResult selectByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public abstract ApiResult updateByPrimaryKeySelective(@RequestBody M m);

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public abstract ApiResult selectByModel(@RequestParam M m) throws BusinessException;
}
