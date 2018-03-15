package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.SysRolePermissionMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.SysRolePermission;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SwordNoTrace
 * @date 2018-03-13 23:05:34
 */
@RestController
@RequestMapping(CommonContant.SQL + "/sysRolePermission")
public class SysRolePermissionController {
	
	@Resource(name = "sysRolePermissionMapper")
	private SysRolePermissionMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public SysRolePermission selectByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<SysRolePermission> selectByModel(@RequestBody(required = false) SysRolePermission m) throws BusinessException {
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
	public void updateByPrimaryKeySelective(@RequestBody(required = false) SysRolePermission m) {
		mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertSelective(@RequestBody(required = false) SysRolePermission m) {
		mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteByPrimaryKey(@RequestParam("id") Long id) {
		mapper.deleteByPrimaryKey(id);
	}

}
