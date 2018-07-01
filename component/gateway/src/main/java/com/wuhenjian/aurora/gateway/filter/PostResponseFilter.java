package com.wuhenjian.aurora.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.wuhenjian.aurora.utils.JsonUtil;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 请求响应过滤，将空字符串去掉
 * @author 無痕剑
 * @date 2018/1/19 16:44
 */
@Component
public class PostResponseFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return FilterConstants.POST_TYPE;
	}

	@Override
	public int filterOrder() {
		return FilterConstants.SEND_RESPONSE_FILTER_ORDER;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext context = new RequestContext();
		Object obj = JsonUtil.json2Obj(context.getResponseBody());
		String responseJson = JsonUtil.obj2Json(obj);
		context.setResponseBody(responseJson);//TODO 网关响应未改变
		return null;
	}
}
