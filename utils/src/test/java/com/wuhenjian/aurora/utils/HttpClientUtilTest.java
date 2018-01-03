package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.entity.zimg.ZimgResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.junit.Test;

import java.io.IOException;
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
		ZimgResult x = JsonUtil.json2Obj(content, ZimgResult.class);
		System.out.println(x);
		System.out.println("*****************");
	}
}
