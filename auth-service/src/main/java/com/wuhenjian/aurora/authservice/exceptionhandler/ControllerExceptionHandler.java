package com.wuhenjian.aurora.authservice.exceptionhandler;

import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 無痕剑
 * @date 2017/12/12 17:10
 */
@RestControllerAdvice(basePackages = "com.wuhenjian.aurora.authservice.controller")
public class ControllerExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ApiResult handler(Exception e) {
		if (e instanceof BusinessException) {
			return ApiResult.fail((BusinessException) e);
		} else {
			return ApiResult.fail(ResultStatus.SYSTEM_EXCEPTION);
		}
	}
}
