package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.GameScoreMapper;
import com.wuhenjian.aurora.utils.BeanUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.GameScore;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:30
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/gameScore")
public class GameScoreController extends AbstractSqlBaseController<GameScore> {

	@Resource(name = "gameScoreMapper")
	private GameScoreMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(GameScore m) {
		mapper.insertSelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		GameScore m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(GameScore m) {
		mapper.updateByPrimaryKeySelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByModel(GameScore m) throws BusinessException {
		boolean pageFlag = !m.isNullPage();
		if (pageFlag) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		List<GameScore> list = mapper.selectByModel(m);
		if (pageFlag) {
			PageInfo<GameScore> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}
}
