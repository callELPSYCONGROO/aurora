package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.PhpBlogMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.PhpBlog;
import com.wuhenjian.aurora.utils.entity.vo.PhpBlogVo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/2/7 22:23
 */
@RestController
@RequestMapping(CommonContant.SQL + "/phpBlog")
public class PhpBlogController {

	@Resource(name = "phpBlogMapper")
	private PhpBlogMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public PhpBlog selectByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<PhpBlog> selectByModel(@RequestBody(required = false) PhpBlog m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectByModel(m);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateByPrimaryKeySelective(@RequestBody PhpBlog m) {
		mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertSelective(@RequestBody PhpBlog m) {
		mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteByPrimaryKey(@RequestParam("id") Long id) {
		mapper.deleteByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByTitle", method = RequestMethod.GET)
	public PhpBlog selectByTitle(@RequestParam("title") String title) {
		return mapper.selectByTitle(title);
	}

	@RequestMapping(value = "/selectForVo", method = RequestMethod.POST)
	public List<PhpBlogVo> selectForVo(@RequestBody(required = false) PhpBlog m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectForVo(m);
	}
}
