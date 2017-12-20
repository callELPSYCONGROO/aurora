package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.MemberCommentMapper;
import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberComment;
import com.wuhenjian.aurora.utils.entity.dao.MemberCommentCriteria;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:30
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/memberComment")
public class MemberCommentController extends AbstractSqlBaseController<MemberComment,MemberCommentCriteria> {

	@Resource(name = "memberCommentMapper")
	private MemberCommentMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(MemberComment record) {
		mapper.insertSelective(record);
		return ApiResult.success(record);
	}

	@Override
	public ApiResult selectByCriteria(MemberCommentCriteria criteria, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberComment> list = mapper.selectByCriteria(criteria);
		if (page != null) {
			PageInfo<MemberComment> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		MemberComment m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberComment record) {
		mapper.updateByPrimaryKeySelective(record);
		return ApiResult.success();
	}

	@Override
	public ApiResult selectByModel(MemberComment model, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberComment> list = mapper.selectByModel(model);
		if (page != null && !page.isNull()) {
			PageInfo<MemberComment> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}
}
