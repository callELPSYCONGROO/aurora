package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/3 14:29
 */
public class HttpClientUtilTest {

	@Test
	public void getTest() throws BusinessException, IOException {
		String url = "http://demo.buaa.us/info";
		Map<String,String> params = new HashMap<>();
		params.put("md5", "c1e1493f58590178864d6b00caed8289");
		String content = HttpClientUtil.requestGet(url, params);
		System.out.println("*****************");
		System.out.println(content);
		System.out.println("*****************");
	}

	@Test
	public void uploadTest() throws Exception {
		String[] files = {"C:\\Users\\無痕剑\\Desktop\\file1.jpg", "C:\\Users\\無痕剑\\Desktop\\file2.jpg", "C:\\Users\\無痕剑\\Desktop\\file3.jpg"};
		Map<String, Map<String, Object>> params = new HashMap<>();
		for (int i = 1; i < 4; i++) {
			String key = "file" + i;
			Map<String, Object> map = new HashMap<>();
			File file = new File(files[i-1]);
			String fileName = file.getName();
			map.put("fileName", fileName);
			String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
			InputStream inputStream = new FileInputStream(file);
			StringBuilder sb = new StringBuilder();
			byte[] bytes = new byte[inputStream.available()];
			while (inputStream.read(bytes) != -1) {
				sb.append(new String(bytes));
			}
			map.put("fileBytes", sb.toString().getBytes());
			map.put("fileType", fileType);
			params.put(key, map);
		}
		String s = HttpClientUtil.postMethodWithFileBytes("http://demo.buaa.us/upload", params);
		System.out.println(JsonUtil.obj2Json(s));
	}

	@Test
	public void getHtmlTest() throws IOException {
		Map<String, String> params = new HashMap<>();
		params.put("tab", "repositories");
		params.put("page", "8");
		System.out.println(HttpClientUtil.requestGet("https://github.com/alibaba", params));
	}

	@Test
	public void luanma() throws IOException {
		String content = HttpClientUtil.requestGetReturnEntity("https://api.github.com/repos/callELPSYCONGROO/aurora", null);
		System.out.println(content);
	}

	@Test
	public void csdnTest() throws IOException {
//		String url = "http://api.csdn.net/oauth2/access_token";
//		Map<String, String> params = new HashMap<>();
//		params.put("client_id", "123");
//		params.put("client_secret", "123");
//		params.put("grant_type", "password");
//		params.put("username", "123");
//		params.put("password", "123");
//		String entity = HttpClientUtil.requestGetReturnEntity(url, params);
//		System.out.println(entity);//{"access_token":"77685341d6eb4621b8fd2ac432aba7a5","expires_in":86400,"username":"qq_20112609"}

		String url = "http://api.csdn.net/blog/getarticlelist";
		Map<String, String> params = new HashMap<>();
		params.put("access_token", "77685341d6eb4621b8fd2ac432aba7a5");
		params.put("page", "4");
		String entity = HttpClientUtil.requestGetReturnEntity(url, params);
		System.out.println(entity);
	}
}
