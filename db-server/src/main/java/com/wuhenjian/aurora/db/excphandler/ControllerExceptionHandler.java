package com.wuhenjian.aurora.db.excphandler;

import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 無痕剑
 * @date 2017/12/20 18:19
 */
@RestControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ApiResult handler() {
		return ApiResult.fail(ResultStatus.SYSTEM_EXCEPTION);
	}
}
