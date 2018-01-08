package com.wuhenjian.aurora.memberservice.excphandler;

import com.wuhenjian.aurora.memberservice.service.MemberAuthService;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuthCriteria;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2017/12/21 11:33
 */
@Component("memberAuthServiceExceptionHandler")
public class MemberAuthServiceExceptionHandler implements MemberAuthService {
	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult insertSelective(MemberAuth record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByCriteria(MemberAuthCriteria criteria, Page page) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberAuth record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByModel(MemberAuth model, Page page) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByPhone(String phone) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByEmail(String email) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
