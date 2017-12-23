package com.wuhenjian.aurora.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.wuhenjian.aurora.gateway.service.RedisService;
import com.wuhenjian.aurora.gateway.service.TokenAuthService;
import com.wuhenjian.aurora.utils.ApiResultUtil;
import com.wuhenjian.aurora.utils.DateUtil;
import com.wuhenjian.aurora.utils.JsonUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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

	@Resource(name = "tokenAuthService")
	private TokenAuthService tokenAuthService;

	@Resource(name = "redisService")
	private RedisService redisService;

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
        //TODO 验证请求
		String token = request.getParameter("token");//令牌
		//解析token
		ApiResult r1 = tokenAuthService.decodeToken(token);
		if (r1.getCode() != 1000) {
			this.response(context, ResultStatus.TOKEN_ISVALID_FILTER);
			return null;
		}
		String uuid = (String) r1.getData();
		//判断token是否过期
		ApiResult r2 = redisService.getToken(uuid);
		if (r2.getCode() != 1000) {
			this.response(context, ResultStatus.REMOTE_SERVICE_EXCEPTION);
			return null;
		}
		Object mai = r2.getData();
		if (mai == null) {
			this.response(context, ResultStatus.TOKEN_OVERDUE);
			return null;
		}
		//将用户账户信息放到请求中去
		request.setAttribute("memberAccountInfo", mai);
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
