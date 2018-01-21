package com.wuhenjian.aurora.gateway.util;

import com.netflix.zuul.context.RequestContext;
import com.wuhenjian.aurora.utils.JsonUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;

import javax.servlet.http.HttpServletResponse;

/**
 * @author 無痕剑
 * @date 2018/1/19 16:03
 */
public class CommonUtil {
	/**
	 * 设置拦截器响应
	 * @param context 上下文
	 * @param rs 响应值
	 */
	public static void response(RequestContext context, ResultStatus rs) {
		context.setSendZuulResponse(false);
		context.setResponseStatusCode(HttpServletResponse.SC_OK);
		ApiResult fail = ApiResult.fail(rs);
		String json = JsonUtil.obj2Json(fail);
		context.setResponseBody(json);
	}
}
