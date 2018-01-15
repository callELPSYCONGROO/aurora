package com.wuhenjian.aurora.phpservice.controller;

import com.wuhenjian.aurora.consumer.service.PhpProjectService;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/11 13:48
 */
@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private PhpProjectService phpProjectService;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ApiResult getAll(String accountName) throws BusinessException {
		if (StringUtil.isBlank(accountName)) {
			throw new BusinessException(ResultStatus.PARAM_IS_EMPTY);
		}
		List<PhpProject> list = phpProjectService.selectRepoByAcct(accountName);
		return ApiResult.success(list);
	}

	@RequestMapping(value = "/getDetail", method = RequestMethod.GET)
	public ApiResult getDetail(Long ppId) throws BusinessException {
		if (ppId == null) {
			throw new BusinessException(ResultStatus.PARAM_IS_EMPTY);
		}
		PhpProject phpProject = phpProjectService.selectByPrimaryKey(ppId);
		return ApiResult.success(phpProject);
	}
}
