package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.SysGroupMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.SysGroup;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SwordNoTrace
 * @date 2018/3/13 22:56
 */
@RestController
@RequestMapping(CommonContant.SQL + "/sysGroup")
public class SysGroupController {
	
	@Resource(name = "sysGroupMapper")
	private SysGroupMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public SysGroup selectByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<SysGroup> selectByModel(@RequestBody(required = false) SysGroup m) throws BusinessException {
		if (m != null) {
			if (!m.isNullPage()) {
				PageHelper.startPage(m.getNum(), m.getSize());
			}
			if (m.hasOrderBy()) {
				PageHelper.orderBy(m.getOrderBy());
			}
		}
		return mapper.selectByModel(m);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateByPrimaryKeySelective(@RequestBody(required = false) SysGroup m) {
		mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertSelective(@RequestBody(required = false) SysGroup m) {
		mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteByPrimaryKey(@RequestParam("id") Long id) {
		mapper.deleteByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectBySuId", method = RequestMethod.GET)
	public SysGroup selectBySuId(@RequestParam("suId") Long suId) {
		return mapper.selectBySuId(suId);
	}
}
