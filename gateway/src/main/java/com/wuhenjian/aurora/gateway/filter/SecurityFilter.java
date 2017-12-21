package com.wuhenjian.aurora.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.wuhenjian.aurora.gateway.service.TokenAuthService;
import com.wuhenjian.aurora.utils.DateUtil;
import com.wuhenjian.aurora.utils.JsonUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * API接口安全验证
 * @author 無痕剑
 * @date 2017/12/5 10:10
 */
@Component
public class SecurityFilter extends ZuulFilter {

	@Autowired
	private TokenAuthService tokenAuthService;

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
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		String requestURI = request.getRequestURI();
		return !"/api/login".equals(requestURI);
	}

	@Override
	public Object run() {
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		//TODO 调试的时候使用debug参数
        String d = request.getParameter("d");
        if (StringUtil.isNotBlank(d) && "1".equals(d)) {
            return null;
        }
        String ts = request.getParameter("ts");//时间戳
		String token = request.getParameter("token");//令牌
		if (StringUtil.isBlank(ts) || StringUtil.isBlank(token)) {//检查关键参数是否为空
			this.response(context, ResultStatus.KEY_PARAM_IS_EMPTY);
			return null;
		}
		Long timestamp = StringUtil.str2Long(ts);
		if (System.currentTimeMillis() - timestamp < DateUtil.oneMinMS) {//请求时间戳与现在的时间差大于一分钟
			this.response(context, ResultStatus.OUT_OF_TIME);
            return null;
		}
		//解析token
		ApiResult apiResult = tokenAuthService.decodeToken(token);
		if (apiResult.getCode() != 1000) {
			this.response(context, ResultStatus.TOKEN_ISVALID_FILTER);
			return null;
		}
		String uuid = (String) apiResult.getData();
		//将uuid放到request上去
		request.setAttribute("uuid", uuid);
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
