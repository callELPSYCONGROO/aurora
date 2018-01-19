package com.wuhenjian.aurora.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.wuhenjian.aurora.gateway.util.CommonUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * API接口安全验证
 * @author 無痕剑
 * @date 2017/12/5 10:10
 */
@Component
public class PreSecurityFilter extends ZuulFilter {

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
		return FilterConstants.PRE_TYPE;
	}

	/**
	 * 数字越大越靠后
	 */
	@Override
	public int filterOrder() {
		return FilterConstants.DEBUG_FILTER_ORDER;
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
		//TODO 网关日志
		String ip = this.getIpAddress(request);
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.println("用户" + ip + "请求：" + request.getRequestURL());
		Map<String, String[]> parameterMap = request.getParameterMap();
		for (String key : parameterMap.keySet()) {
			String[] values = parameterMap.get(key);
			for (String val : values) {
				System.out.println("参数：" + key + " = " + val);
				if (StringUtil.isBlank(val)) {
					CommonUtil.response(context, ResultStatus.KEY_PARAM_IS_EMPTY);
					return null;
				}
			}
		}
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		return null;
	}

	/**
	 * 获取真实IP
	 * @param request 请求
	 * @return IP
	 */
	private String getIpAddress(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
//		System.out.println("getIpAddress(HttpServletRequest) - X-Forwarded-For - String ip=" + ip);

		if (StringUtil.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
			if (StringUtil.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("Proxy-Client-IP");
//				System.out.println("getIpAddress(HttpServletRequest) - Proxy-Client-IP - String ip=" + ip);
			}
			if (StringUtil.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
//				System.out.println("getIpAddress(HttpServletRequest) - WL-Proxy-Client-IP - String ip=" + ip);
			}
			if (StringUtil.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("HTTP_CLIENT_IP");
//				System.out.println("getIpAddress(HttpServletRequest) - HTTP_CLIENT_IP - String ip=" + ip);
			}
			if (StringUtil.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("HTTP_X_FORWARDED_FOR");
//				System.out.println("getIpAddress(HttpServletRequest) - HTTP_X_FORWARDED_FOR - String ip=" + ip);
			}
			if (StringUtil.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getRemoteAddr();
//				System.out.println("getIpAddress(HttpServletRequest) - getRemoteAddr - String ip=" + ip);
			}
		} else if (ip.length() > 15) {
			String[] ips = ip.split(",");
			for (String strIp : ips) {
				if (!("unknown".equalsIgnoreCase(strIp))) {
					ip = strIp;
					break;
				}
			}
		}
		return ip;
	}
}
