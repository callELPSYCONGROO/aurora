package com.wuhenjian.aurora.db.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 16:24
 */
public abstract class AbstractSqlBaseController<M,Q,Y extends BaseMapper<M,Q>> implements SqlBaseController<M,Q> {

	private Y mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(M record) {
		mapper.insertSelective(record);
		return ApiResult.success(record);
	}

	@Override
	public ApiResult selectByCriteria(Q criteria, Page page) {
		if (page != null) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<M> list = mapper.selectByCriteria(criteria);
		if (page != null) {
			PageInfo<M> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		M m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(M record) {
		mapper.updateByPrimaryKeySelective(record);
		return ApiResult.success();
	}

	@Override
	public ApiResult selectByModel(M model, Page page) {
		if (page != null) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<M> list = mapper.selectByModel(model);
		if (page != null) {
			PageInfo<M> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	public Y getMapper() {
		return mapper;
	}

	public void setMapper(Y mapper) {
		this.mapper = mapper;
	}
}
