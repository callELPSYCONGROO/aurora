package com.wuhenjian.aurora.memberservice.excphandler;

import com.wuhenjian.aurora.memberservice.service.MemberInfoService;
import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfoCriteria;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
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
	public ApiResult insertSelective(MemberInfo record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByCriteria(MemberInfoCriteria criteria, Page page) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberInfo record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByModel(MemberInfo model, Page page) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByMaid(Long maId) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
