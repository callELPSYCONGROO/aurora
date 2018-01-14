package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.CommonAdMapper;
import com.wuhenjian.aurora.utils.entity.dao.CommonAd;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:28
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/commonAd")
public class CommonAdController extends AbstractSqlBaseController<CommonAd> {

	@Resource(name = "commonAdMapper")
	private CommonAdMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(CommonAd m) {
		mapper.insertSelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		CommonAd m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(CommonAd m) {
		mapper.updateByPrimaryKeySelective(m);
		return ApiResult.success();
	}

	@Override
	public ApiResult selectByModel(CommonAd m) throws BusinessException {
		boolean pageFlag = !m.isNullPage();
		if (pageFlag) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		List<CommonAd> list = mapper.selectByModel(m);
		if (pageFlag) {
			PageInfo<CommonAd> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}
}
