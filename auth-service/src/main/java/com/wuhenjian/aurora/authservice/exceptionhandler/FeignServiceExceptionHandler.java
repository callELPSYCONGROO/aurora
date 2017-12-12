package com.wuhenjian.aurora.authservice.exceptionhandler;

import com.wuhenjian.aurora.authservice.service.RedisService;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2017/12/12 15:59
 */
@Component("feignServiceExceptionHandler")
public class FeignServiceExceptionHandler implements RedisService {
	@Override
	public ApiResult setToken(String token) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult getToken(String token) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult delToken(String token) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_REDIS);
	}
}
