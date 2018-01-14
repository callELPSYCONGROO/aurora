package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.PhpProjectService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/11 16:35
 */
@Component("phpProjectServiceExceptionHandler")
public class PhpProjectServiceExceptionHandler implements PhpProjectService {

	@Override
	public ApiResult insertSelective(PhpProject m) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(PhpProject m) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByModel(PhpProject m) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id)  {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByAcctAndRepo(String acct, String repo) {
		return this.exceptionResult();
	}

	@Override
	public List<PhpProject> getList() {
		return null;
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
