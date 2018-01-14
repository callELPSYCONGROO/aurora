package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.PhpProjectMapper;
import com.wuhenjian.aurora.utils.ApiResultUtil;
import com.wuhenjian.aurora.utils.BeanUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/11 16:29
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/phpProject")
public class PhpProjectController extends AbstractSqlBaseController<PhpProject> {
	
	@Resource(name = "phpProjectMapper")
	private PhpProjectMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(PhpProject m) {
		mapper.insertSelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		PhpProject m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(PhpProject m) {
		mapper.updateByPrimaryKeySelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByModel(PhpProject m) throws BusinessException {
		boolean pageFlag = !m.isNullPage();
		if (pageFlag) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		List<PhpProject> list = mapper.selectByModel(m);
		if (pageFlag) {
			PageInfo<PhpProject> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@RequestMapping(value = "/selectByAcctAndRepo", method = RequestMethod.GET)
	public ApiResult selectByAcctAndRepo(@RequestParam("acct") String acct, @RequestParam("repo") String repo) {
		PhpProject phpProject = mapper.selectByAcctAndRepo(acct, repo);
		return ApiResult.success(phpProject);
	}

	@RequestMapping("/getList")
	public List<PhpProject> getList() {
		return mapper.selectByModel(null);
	}
}
