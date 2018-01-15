package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.MemberFriendMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.MemberFriend;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:31
 */
@RestController
@RequestMapping(CommonContant.SQL + "/memberFriend")
public class MemberFriendController {

	@Resource(name = "memberFriendMapper")
	private MemberFriendMapper mapper;
	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public MemberFriend selectByPrimaryKey(@RequestParam("id")Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<MemberFriend> selectByModel(@RequestBody(required = false) MemberFriend m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectByModel(m);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public int updateByPrimaryKeySelective(@RequestBody MemberFriend m) {
		return mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public int insertSelective(@RequestBody MemberFriend m) {
		return mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public int deleteByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
