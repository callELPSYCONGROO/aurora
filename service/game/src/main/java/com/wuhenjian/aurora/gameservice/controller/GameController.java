package com.wuhenjian.aurora.gameservice.controller;

import com.wuhenjian.aurora.consumer.service.CommonCountService;
import com.wuhenjian.aurora.consumer.service.PhpProjectService;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SwordNoTrace
 * @date 2017/12/5 0:02
 */
@RestController
public class GameController {

	@Autowired
	private PhpProjectService phpProjectService;

	@Autowired
	private CommonCountService commonCountService;

	@RequestMapping("/model")
	public ApiResult selectByModel() throws BusinessException {
		PhpProject p = new PhpProject();
//		p.setLang("Cpp");
//		p.setAcctountName("whj");
//		p.setRepoName("opo");
//		p.setUpdateTime(new Date());
		p.setNum(1);
		p.setSize(4);
		List<PhpProject> list = phpProjectService.selectByModel(p);
		return ApiResult.success(list);
	}

	@RequestMapping("/id")
	public ApiResult selectByPrimaryKey(Long id) throws BusinessException {
		return ApiResult.success(phpProjectService.selectByPrimaryKey(id));
	}

	@RequestMapping("/getCount")
	public ApiResult getCount() throws BusinessException {
		return ApiResult.success(commonCountService.getAccountCode());
	}
}
