package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.MemberInfoService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2017/12/21 11:33
 */
@Component("memberInfoServiceExceptionHandler")
public class MemberInfoServiceExceptionHandler implements MemberInfoService {
	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult insertSelective(MemberInfo m) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberInfo m) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByModel(MemberInfo m) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByMaid(Long maId) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult updateMemberInfoByMaId(MemberInfo m) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
