package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.mapper.sql.MemberAuthMapper;
import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuthCriteria;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:30
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/memberAuth")
public class MemberAuthController extends AbstractSqlBaseController<MemberAuth,MemberAuthCriteria> {

	@Resource(name = "memberAuthMapper")
	private MemberAuthMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(MemberAuth record) {
		mapper.insertSelective(record);
		return ApiResult.success(record);
	}

	@Override
	public ApiResult selectByCriteria(MemberAuthCriteria criteria, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberAuth> list = mapper.selectByCriteria(criteria);
		if (page != null && !page.isNull()) {
			PageInfo<MemberAuth> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		MemberAuth m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberAuth record) {
		mapper.updateByPrimaryKeySelective(record);
		return ApiResult.success();
	}

	@Override
	public ApiResult selectByModel(MemberAuth model, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberAuth> list = mapper.selectByModel(model);
		if (page != null && !page.isNull()) {
			PageInfo<MemberAuth> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@RequestMapping(value = "/selectByPhone", method = RequestMethod.GET)
	public ApiResult selectByPhone(String phone) {
		MemberAuth memberAuth = mapper.selectByPhone(phone);
		return ApiResult.success(memberAuth);
	}

	@RequestMapping(value = "/selectByEmail", method = RequestMethod.GET)
	public ApiResult selectByEmail(String email) {
		MemberAuth memberAuth = mapper.selectByEmail(email);
		return ApiResult.success(memberAuth);
	}
}
