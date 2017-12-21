package com.wuhenjian.aurora.gateway.excphandler;

import com.wuhenjian.aurora.gateway.service.TokenAuthService;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2017/12/21 14:32
 */
@Component("tokenAuthServiceExceptionHandler")
public class TokenAuthServiceExceptionHandler implements TokenAuthService {

	@Override
	public ApiResult decodeToken(String token) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
