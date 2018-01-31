package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.MemberCommentMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.MemberComment;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:30
 */
@RestController
@RequestMapping(CommonContant.SQL + "/memberComment")
public class MemberCommentController {

	@Resource(name = "memberCommentMapper")
	private MemberCommentMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public MemberComment selectByPrimaryKey(@RequestParam("id")Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<MemberComment> selectByModel(@RequestBody(required = false) MemberComment m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectByModel(m);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateByPrimaryKeySelective(@RequestBody MemberComment m) {
		mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertSelective(@RequestBody MemberComment m) {
		mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteByPrimaryKey(@RequestParam("id") Long id) {
		mapper.deleteByPrimaryKey(id);
	}
}
