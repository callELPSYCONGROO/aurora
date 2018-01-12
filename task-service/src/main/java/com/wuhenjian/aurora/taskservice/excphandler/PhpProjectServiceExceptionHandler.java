package com.wuhenjian.aurora.taskservice.excphandler;

import com.wuhenjian.aurora.taskservice.service.PhpProjectService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dao.PhpProjectCriteria;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2018/1/11 16:35
 */
@Component("phpProjectServiceExceptionHandler")
public class PhpProjectServiceExceptionHandler implements PhpProjectService {
	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult insertSelective(PhpProject record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByCriteria(PhpProjectCriteria criteria, Page page) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(PhpProject record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByModel(PhpProject model, Page page) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByAcctAndRepo(String acct, String repo) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
