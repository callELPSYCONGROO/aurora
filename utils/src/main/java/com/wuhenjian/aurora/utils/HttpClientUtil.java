package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/3 14:09
 */
public class HttpClientUtil {

	public final static String ZIMG_UPLOAD = "/upload";

	public final static String ZIMG_DOWNLOAD = "/";

	public final static String ZIMG_ADMIN = "/admin";

	public final static String ZIMG_INFO = "/info";

	private final static String ENCODING = "UTF-8";

	/**
	 * 执行get请求
	 * @param url 请求URL
	 * @param params 请求参数
	 * @return 响应字符串
	 * @throws BusinessException 发生异常
	 */
	public static String getMethod(String url, Map<String,String> params) throws BusinessException {
		HttpGet get = null;
		String sb;
		try {
			HttpClient client = HttpClients.createDefault();
			url = splicingUrlParams(url, params);
			get = new HttpGet(url);
			HttpResponse response = client.execute(get);
			sb = getStringContent(response);
		} catch (IOException e) {
			throw new BusinessException(ResultStatus.HTTPCLIENT_EXCP);
		} finally {
			if (get != null) {
				get.abort();
			}
		}
		return sb;
	}

	/**
	 * 执行post请求
	 * @param url 请求URL
	 * @param params 请求参数
	 * @return 响应字符串
	 * @throws BusinessException 发生异常
	 */
	public static String postMethod(String url, Map<String,String> params) throws BusinessException {
		HttpPost post = null;
		String sb;
		try {
			HttpClient client = HttpClients.createDefault();
			post = new HttpPost(url);
			post.setEntity(params2Entity(params));
			HttpResponse response = client.execute(post);
			sb = getStringContent(response);
		} catch (IOException e) {
			throw new BusinessException(ResultStatus.HTTPCLIENT_EXCP);
		} finally {
			if (post != null) {
				post.abort();
			}
		}
		return sb;
	}

	/**
	 * 拼接Url与参数
	 * @param url URL字符串
	 * @param params 参数
	 * @return get请求完整URL
	 * @throws IOException 发生异常
	 */
	private static String splicingUrlParams(String url, Map<String,String> params) throws IOException {
		String urlParams = EntityUtils.toString(params2Entity(params));
		String urlWithParams;
		if (url.endsWith("?")) {
			urlWithParams = url + urlParams;
		} else {
			urlWithParams = url + "?" + urlParams;
		}
		return urlWithParams;
	}

	/**
	 * 参数集合转entity对象
	 * @param params 参数集合
	 * @return entity对象
	 * @throws UnsupportedEncodingException 发生异常
	 */
	private static HttpEntity params2Entity(Map<String,String> params) throws UnsupportedEncodingException {
		List<NameValuePair> list = new ArrayList<>();
		for (String key : params.keySet()) {
			list.add(new BasicNameValuePair(key, params.get(key)));
		}
		return new UrlEncodedFormEntity(list, ENCODING);
	}

	/**
	 * 响应转换为字符串
	 * @param response 响应
	 * @return 字符串
	 * @throws IOException 发生异常
	 */
	private static String getStringContent(HttpResponse response) throws IOException {
		HttpEntity entity = response.getEntity();
		if (entity == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		InputStream content = entity.getContent();
		byte[] bytes = new byte[content.available()];
		while (content.read(bytes) > 0) {
			sb.append(new String(bytes));
		}
		return sb.toString();
	}
}
