package com.wuhenjian.aurora.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.wuhenjian.aurora.gateway.util.CommonUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 网关异常处理
 * @author 無痕剑
 * @date 2018/1/19 15:56
 */
@Component
public class ErrorFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return FilterConstants.ERROR_TYPE;
	}

	@Override
	public int filterOrder() {
		return FilterConstants.DEBUG_FILTER_ORDER;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext context = RequestContext.getCurrentContext();
		Throwable throwable = context.getThrowable();
		if (throwable instanceof Error) {
			CommonUtil.response(context, ResultStatus.GATEWAY_SYSTEM_ERROR);
		} else if (throwable instanceof BusinessException) {
			BusinessException businessException = (BusinessException) throwable;
			CommonUtil.response(context, businessException.getRs());
		} else {
			CommonUtil.response(context, ResultStatus.GATEWAY_SYSTEM_EXCEPTION);
		}
		return null;
	}
}
