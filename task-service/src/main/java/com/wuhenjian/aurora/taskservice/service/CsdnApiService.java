package com.wuhenjian.aurora.taskservice.service;

import com.wuhenjian.aurora.utils.entity.dao.PhpBlog;
import com.wuhenjian.aurora.utils.exception.BusinessException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/2/7 21:00
 */
public interface CsdnApiService {

	/**
	 * 客户端的验证授权
	 * @param path 请求路径
	 * @param params 参数集合：
	 * <p>clientId 在开发者中心注册应用时获得的API Key</p>
	 * <p>clientSecret 在开发者中心注册应用时获得的API Secret</p>
	 * <p>grantType 客户端授权，此值为固定值“password”</p>
	 * <p>username 授权用户的用户名</p>
	 * <p>password 授权用户的密码</p>
	 * @return access_token
	 */
	String oauth2Authorize(String path, Map<String, String> params) throws IOException, BusinessException;

	/**
	 * 获取所有博客
	 * @param path 请求路径
	 * @param accessToken access_token
	 */
	void saveAllBlog(String path, String accessToken) throws IOException, BusinessException;
}
