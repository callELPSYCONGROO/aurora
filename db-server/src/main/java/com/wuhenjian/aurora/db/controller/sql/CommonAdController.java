package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.CommonAdMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.CommonAd;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:28
 */
@RestController
@RequestMapping(CommonContant.SQL + "/commonAd")
public class CommonAdController {

	@Resource(name = "commonAdMapper")
	private CommonAdMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public CommonAd selectByPrimaryKey(@RequestParam("id")Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<CommonAd> selectByModel(@RequestBody(required = false) CommonAd m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectByModel(m);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public int updateByPrimaryKeySelective(@RequestBody CommonAd m) {
		return mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public int insertSelective(@RequestBody CommonAd m) {
		return mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public int deleteByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
