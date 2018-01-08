package com.wuhenjian.aurora.albumservice.excphandler;

import com.wuhenjian.aurora.albumservice.service.ZimgService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;

import java.util.Map;

/**
 * @author SwordNoTrace
 * @date 2018/1/6 10:10
 */
public class ZimgServiceExceptionHandler implements ZimgService {
	@Override
	public ApiResult upload(Map<String, Map<String, Object>> params) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult info(String imgMd5) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult delete(String imgMd5) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
