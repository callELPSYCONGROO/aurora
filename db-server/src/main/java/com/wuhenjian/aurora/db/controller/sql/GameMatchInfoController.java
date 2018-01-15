package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.GameMatchInfoMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.GameMatchInfo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:29
 */
@RestController
@RequestMapping(CommonContant.SQL + "/gameMatchInfo")
public class GameMatchInfoController {

	@Resource(name = "gameMatchInfoMapper")
	private GameMatchInfoMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public GameMatchInfo selectByPrimaryKey(@RequestParam("id")Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<GameMatchInfo> selectByModel(@RequestBody(required = false) GameMatchInfo m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectByModel(m);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public int updateByPrimaryKeySelective(@RequestBody GameMatchInfo m) {
		return mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public int insertSelective(@RequestBody GameMatchInfo m) {
		return mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public int deleteByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
