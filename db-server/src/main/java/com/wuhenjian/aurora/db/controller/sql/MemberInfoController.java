package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.MemberInfoMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:31
 */
@RestController
@RequestMapping(CommonContant.SQL + "/memberInfo")
public class MemberInfoController {

	@Resource(name = "memberInfoMapper")
	private MemberInfoMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public MemberInfo selectByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<MemberInfo> selectByModel(@RequestBody(required = false) MemberInfo m) throws BusinessException {
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
	public void updateByPrimaryKeySelective(@RequestBody MemberInfo m) {
		mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertSelective(@RequestBody MemberInfo m) {
		mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteByPrimaryKey(@RequestParam("id") Long id) {
		mapper.deleteByPrimaryKey(id);
	}

	@RequestMapping(value = "selectByMaid", method = RequestMethod.GET)
	public MemberAcctInfo selectByMaid(@RequestParam("maId") Long maId) {
		return mapper.selectByMaid(maId);
	}

	@RequestMapping(value = "/updateMemberInfoByMaId", method = RequestMethod.POST)
	public void updateMemberInfoByMaId(@RequestBody MemberInfo m) {
		mapper.updateMemberInfoByMaId(m);
	}
}
