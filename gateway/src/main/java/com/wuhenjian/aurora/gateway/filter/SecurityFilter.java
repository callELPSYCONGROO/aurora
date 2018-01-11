package com.wuhenjian.aurora.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.wuhenjian.aurora.utils.*;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * API接口安全验证
 * @author 無痕剑
 * @date 2017/12/5 10:10
 */
@Component
public class SecurityFilter extends ZuulFilter {

	/**
	 * 返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
	 * <p>pre：可以在请求被路由之前调用</p>
	 * <p>route：在路由请求时候被调用</p>
	 * <p>post：在route和error过滤器之后被调用</p>
	 * <p>error：处理请求时发生错误时被调用</p>
	 * @return 生命周期类型
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * 数字越大越靠后
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 * 登录接口不过滤
	 * @return Boolean
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		Map<String, String[]> parameterMap = request.getParameterMap();
		for (String key : parameterMap.keySet()) {
			String[] values = parameterMap.get(key);
			for (String val : values) {
				if (StringUtil.isBlank(val)) {
					this.response(context, ResultStatus.KEY_PARAM_IS_EMPTY);
					return null;
				}
			}
		}
		return null;
	}

	/**
	 * 设置拦截器响应
	 * @param context 上下文
	 * @param rs 响应值
	 */
	private void response(RequestContext context, ResultStatus rs) {
		context.setSendZuulResponse(false);
		context.setResponseStatusCode(HttpServletResponse.SC_OK);
		ApiResult fail = ApiResult.fail(rs);
		String json = JsonUtil.obj2Json(fail);
        try {
            context.getResponse().getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
