package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.junit.Test;

import java.io.*;
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
		String content = HttpClientUtil.getMethod(url, params);
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
}
