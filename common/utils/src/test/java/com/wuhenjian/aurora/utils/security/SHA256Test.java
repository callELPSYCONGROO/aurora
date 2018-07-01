package com.wuhenjian.aurora.utils.security;

import com.wuhenjian.aurora.utils.AuthUtil;
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

	@Test
	public void orderMap2StringTest() {
		Map<String,String> map = new HashMap<>();
		map.put("gf323", "范德萨");
		map.put("h32", "华国锋的");
		map.put("#rf", "放到耍");
		map.put("dsf2", " 放到");
		map.put("123", "都是");
		map.put("234", " 发");
//		String string = SHA256.orderMap2String(map);
//		System.out.println(string);
	}

	@Test
	public void verifyPasswordTest() throws BusinessException {
		String pwd = "123456";
		String salt = "dsf121";
		System.out.println(AuthUtil.passwordEncrypt(pwd, salt));

		String pwd1 = "123456789asdadasasda012";
		String salt1 = "sdf342";
		System.out.println(AuthUtil.passwordEncrypt(pwd1, salt1));
	}
}
