package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.CommonPictureMapper;
import com.wuhenjian.aurora.utils.BeanUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.CommonPicture;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:29
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/commonPicture")
public class CommonPictureController extends AbstractSqlBaseController<CommonPicture> {

	@Resource(name = "commonPictureMapper")
	private CommonPictureMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(CommonPicture m) {
		mapper.insertSelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		CommonPicture m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(CommonPicture m) {
		mapper.updateByPrimaryKeySelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByModel(CommonPicture m) throws BusinessException {
		boolean pageFlag = !m.isNullPage();
		if (pageFlag) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		List<CommonPicture> list = mapper.selectByModel(m);
		if (pageFlag) {
			PageInfo<CommonPicture> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}
}
