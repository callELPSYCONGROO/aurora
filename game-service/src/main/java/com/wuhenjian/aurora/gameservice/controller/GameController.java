package com.wuhenjian.aurora.gameservice.controller;

import com.wuhenjian.aurora.consumer.service.PhpProjectService;
import com.wuhenjian.aurora.utils.ApiResultUtil;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author SwordNoTrace
 * @date 2017/12/5 0:02
 */
@RestController
public class GameController {

	@Autowired
	private PhpProjectService phpProjectService;

	@RequestMapping("/model")
	public ApiResult selectByModel() throws BusinessException {
		PhpProject p = new PhpProject();
		p.setLang("Cpp");
		p.setAcctountName("liwu");
		p.setRepoName("opo");
		p.setUpdateTime(new Date());
		ApiResult r1 = phpProjectService.selectByModel(p);
		Object object = ApiResultUtil.getObject(r1);
		return ApiResult.success(object);
	}

	@RequestMapping("/{id}")
	public ApiResult selectByPrimaryKey(@PathVariable("id") Long id) {
		return phpProjectService.selectByPrimaryKey(id);
	}

	@RequestMapping("/list")
	public ApiResult list() {
		return ApiResult.success(phpProjectService.getList());
	}
}
