package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.constant.HttpContentType;
import org.apache.commons.codec.Charsets;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/3 14:09
 */
public class HttpClientUtil {
	/** 编码 */
	private final static String ENCODING = "UTF-8";
	/** 连接超时 */
	private final static int CONNECT_TIMEOUT = 11000;
	/** 编码 */
	private final static int SOCKET_TIMEOUT = 10000;

	/**
	 * 执行get请求
	 * @param url 请求URL
	 * @param params 请求参数
	 * @return 响应字符串
	 * @throws IOException 发生异常
	 */
	public static String getMethod(String url, Map<String, String> params) throws IOException {
		HttpGet get = null;
		String content;
		try {
			url = splicingUrlParams(url, params);
			RequestConfig config = RequestConfig.custom().setConnectTimeout(CONNECT_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).build();
			get = new HttpGet(url);
			get.setConfig(config);
			HttpClient client = HttpClients.createDefault();
			HttpResponse response = client.execute(get);
			content = getStringContent(response);
		} finally {
			if (get != null) {
				get.abort();
			}
		}
		return content;
	}

	/**
	 * 执行post请求
	 * @param url 请求URL
	 * @param params 请求参数
	 * @return 响应字符串
	 * @throws IOException 发生异常
	 */
	public static String postMethod(String url, Map<String, String> params) throws IOException {
		HttpPost post = null;
		String content;
		try {
			RequestConfig config = RequestConfig.custom().setConnectTimeout(CONNECT_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).build();
			HttpEntity entity = params2Entity(params);
			post = new HttpPost(url);
			post.setConfig(config);
			post.setEntity(entity);
			HttpClient client = HttpClients.createDefault();
			HttpResponse response = client.execute(post);
			content = getStringContent(response);
		} finally {
			if (post != null) {
				post.abort();
			}
		}
		return content;
	}

	/**
	 * 上传文件
	 * @param url URL
	 * @param params 文件参数
	 * @return 结果集
	 * @throws Exception 发生异常
	 */
	public static String postMethodWithFileBytes(String url, Map<String, Map<String, Object>> params) throws Exception {
		RequestConfig config = RequestConfig.custom().setConnectTimeout(CONNECT_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).build();
		MultipartEntityBuilder multipartEntityBuilder = map2MultipartEntity(params);
		multipartEntityBuilder.setContentType(ContentType.MULTIPART_FORM_DATA);
		multipartEntityBuilder.setCharset(Charsets.UTF_8);
		HttpEntity entity = multipartEntityBuilder.build();
		HttpResponse response;
		HttpPost post = null;
		try {
			post = new HttpPost(url);
			post.setConfig(config);
			post.setEntity(entity);
			HttpClient client = HttpClients.createDefault();
			response = client.execute(post);
		} finally {
			if (post != null) {
				post.abort();
			}
		}
		return getStringContent(response);
	}

	/**
	 * 拼接Url与参数
	 * @param url URL字符串
	 * @param params 参数
	 * @return get请求完整URL
	 * @throws IOException 发生异常
	 */
	private static String splicingUrlParams(String url, Map<String, String> params) throws IOException {
		if (params == null || params.isEmpty()) {
			return url;
		}
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
	private static HttpEntity params2Entity(Map<String, String> params) throws UnsupportedEncodingException {
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

	/**
	 * 将map对象构建为请求参数对象
	 * @param params 参数map
	 * @return 请求参数对象
	 * @throws Exception 发生异常
	 */
	private static MultipartEntityBuilder map2MultipartEntity(Map<String, Map<String, Object>> params) throws Exception {
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		for (String key : params.keySet()) {
			Map<String, Object> objectMap = params.get(key);
			String fileType = (String) objectMap.get("fileType");
			ContentType contentType = HttpContentType.getContentType(fileType);
			if (contentType == null) {
				throw new Exception("file type is invalid");
			}
			String fileName = (String) objectMap.get("fileName");
			byte[] bytes = (byte[]) objectMap.get("fileBytes");
			builder.addBinaryBody(key, bytes, contentType, fileName);
		}
		return builder;
	}
}
