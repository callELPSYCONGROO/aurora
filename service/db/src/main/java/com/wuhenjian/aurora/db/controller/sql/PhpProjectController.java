package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.PhpProjectMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.vo.GithubRepo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/11 16:29
 */
@RestController
@RequestMapping(CommonContant.SQL + "/phpProject")
public class PhpProjectController {

	@Resource(name = "phpProjectMapper")
	private PhpProjectMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public PhpProject selectByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<PhpProject> selectByModel(@RequestBody(required = false) PhpProject m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectByModel(m);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateByPrimaryKeySelective(@RequestBody(required = false) PhpProject m) {
		mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertSelective(@RequestBody(required = false) PhpProject m) {
		mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteByPrimaryKey(@RequestParam("id") Long id) {
		mapper.deleteByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByAcctAndRepo", method = RequestMethod.GET)
	public PhpProject selectByAcctAndRepo(@RequestParam("acct") String acct, @RequestParam("repo") String repo) {
		return mapper.selectByAcctAndRepo(acct, repo);
	}

	@RequestMapping(value = "/selectRepoByAcct", method = RequestMethod.POST)
	public List<GithubRepo> selectRepoByAcct(@RequestBody(required = false) PhpProject m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectRepoByAcct(m);
	}
}
