package com.wuhenjian.aurora.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.wuhenjian.aurora.utils.DateUtil;
import com.wuhenjian.aurora.utils.JsonUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import com.wuhenjian.aurora.utils.security.SHA256;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
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
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		String requestURI = request.getRequestURI();
		return !"/api/login".equals(requestURI);
	}

	@Override
	public Object run() {
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		String ts = request.getParameter("ts");//时间戳
		String token = request.getParameter("token");//令牌
		String sign = request.getParameter("sign");//签名
		if (StringUtil.isBlank(ts) || StringUtil.isBlank(token) || StringUtil.isBlank(sign)) {//检查关键参数是否为空
			String json = this.setContext(context, ResultStatus.KEY_PARAM_IS_EMPTY);
			try {
				context.getResponse().getWriter().write(json);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Long timestamp = StringUtil.str2Long(ts);
		if (System.currentTimeMillis() - timestamp < DateUtil.oneMinMS) {//请求时间戳与现在的时间差大于一分钟
			String json = this.setContext(context, ResultStatus.OUT_OF_TIME);
			try {
				context.getResponse().getWriter().write(json);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String encode = null;
		try {
			encode = this.requestParam2Map(request);
		} catch (BusinessException e) {
			String json = this.setContext(context, e.getRs());
			try {
				context.getResponse().getWriter().write(json);
			} catch (IOException e1) {
				e.printStackTrace();
			}
		}
		if (!sign.equals(encode)) {//验证签名是否正确
			String json = this.setContext(context, ResultStatus.SIGN_ERROR);
			try {
				context.getResponse().getWriter().write(json);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 设置拦截器响应
	 * @param context 上下文
	 * @param rs 响应值
	 * @return 响应值Json字符串
	 */
	private String setContext(RequestContext context, ResultStatus rs) {
		context.setSendZuulResponse(false);
		context.setResponseStatusCode(HttpServletResponse.SC_OK);
		ApiResult fail = ApiResult.fail(rs);
		return JsonUtil.obj2Json(fail);
	}

	/**
	 * 将请求参数进行签名
	 * @param request 请求
	 * @return 签名
	 * @throws BusinessException 签名异常
	 */
	private String requestParam2Map(HttpServletRequest request) throws BusinessException {
		Map<String,String> map = new HashMap<>();
		Enumeration<String> parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			String key = parameterNames.nextElement();
			if ("sign".equals(key)) {//跳过sign参数
				continue;
			}
			String value = request.getParameter(key);
			map.put(key, value);
		}
		return SHA256.encode(map);
	}
}
