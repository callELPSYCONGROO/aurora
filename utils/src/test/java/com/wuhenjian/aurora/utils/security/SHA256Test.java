package com.wuhenjian.aurora.utils.security;

import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2017/12/5 11:38
 */
public class SHA256Test {

	@Test
	public void encodeTest() throws BusinessException {
		Map<String,String> map = new HashMap<>();
		long ts = System.currentTimeMillis();
		map.put("ts","" + ts);
		map.put("token","jhd89f2jf9w8jfdwehf8923jf");
		map.put("id","12394593");
		System.out.println(ts);
		System.out.println(SHA256.encode(map));
	}
}
