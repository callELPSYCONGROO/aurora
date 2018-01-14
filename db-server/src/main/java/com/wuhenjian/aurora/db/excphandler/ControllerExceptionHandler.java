package com.wuhenjian.aurora.db.excphandler;

import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 無痕剑
 * @date 2017/12/20 18:19
 */
@RestControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ApiResult handler(Exception e) {
		if (e instanceof BusinessException) {
			return ApiResult.fail((BusinessException) e);
		}
		return ApiResult.fail(ResultStatus.SYSTEM_EXCEPTION);
	}
}
