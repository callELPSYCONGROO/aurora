package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.MemberInfoMapper;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfoCriteria;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:31
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/memberInfo")
public class MemberInfoController extends AbstractSqlBaseController<MemberInfo,MemberInfoCriteria> {

	@Resource(name = "memberInfoMapper")
	private MemberInfoMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(MemberInfo record) {
		mapper.insertSelective(record);
		return ApiResult.success(record);
	}

	@Override
	public ApiResult selectByCriteria(MemberInfoCriteria criteria, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberInfo> list = mapper.selectByCriteria(criteria);
		if (page != null) {
			PageInfo<MemberInfo> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		MemberInfo m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberInfo record) {
		mapper.updateByPrimaryKeySelective(record);
		return ApiResult.success();
	}

	@Override
	public ApiResult selectByModel(MemberInfo model, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberInfo> list = mapper.selectByModel(model);
		if (page != null) {
			PageInfo<MemberInfo> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@RequestMapping(value = "selectByMaid", method = RequestMethod.GET)
	public ApiResult selectByMaid(Long maId) {
		MemberAcctInfo memberAcctInfo = mapper.selectByMaid(maId);
		return ApiResult.success(memberAcctInfo);
	}

	@RequestMapping(value = "/updateMemberInfoByMaId", method = RequestMethod.POST)
	public ApiResult updateMemberInfoByMaId(MemberInfo memberInfo) {
		mapper.updateMemberInfoByMaId(memberInfo);
		return ApiResult.success();
	}
}
