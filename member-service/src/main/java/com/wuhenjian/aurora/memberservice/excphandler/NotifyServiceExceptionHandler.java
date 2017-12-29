package com.wuhenjian.aurora.memberservice.excphandler;

import com.wuhenjian.aurora.memberservice.service.NotifyService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2017/12/28 16:43
 */
@Component("notifyServiceExceptionHandler")
public class NotifyServiceExceptionHandler implements NotifyService {
	@Override
	public ApiResult getCaptcha(String to, Integer type) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
