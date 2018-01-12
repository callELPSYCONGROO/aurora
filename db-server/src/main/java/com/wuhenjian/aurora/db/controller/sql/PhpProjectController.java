package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.PhpProjectMapper;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dao.PhpProjectCriteria;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/11 16:29
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/phpProject")
public class PhpProjectController extends AbstractSqlBaseController<PhpProject, PhpProjectCriteria> {
	
	@Resource(name = "phpProjectMapper")
	private PhpProjectMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(PhpProject record) {
		mapper.insertSelective(record);
		return ApiResult.success(record);
	}

	@Override
	public ApiResult selectByCriteria(PhpProjectCriteria criteria, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<PhpProject> list = mapper.selectByCriteria(criteria);
		if (page != null) {
			PageInfo<PhpProject> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		PhpProject m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(PhpProject record) {
		mapper.updateByPrimaryKeySelective(record);
		return ApiResult.success();
	}

	@Override
	public ApiResult selectByModel(PhpProject model, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<PhpProject> list = mapper.selectByModel(model);
		if (page != null) {
			PageInfo<PhpProject> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@RequestMapping(value = "/selectByAcctAndRepo", method = RequestMethod.GET)
	public ApiResult selectByAcctAndRepo(String acct, String repo) {
		PhpProject phpProject = mapper.selectByAcctAndRepo(acct, repo);
		return ApiResult.success(phpProject);
	}
}
