package com.wuhenjian.aurora.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/5 13:34
 */
public class StringUtilTest {

	@Test
	public void isBlankTest() {
		System.out.println(StringUtil.isBlank("  d  "));
	}

	@Test
	public void isPhoneTest() {
		String reg = "^1[345678]\\d{9}$";
		String phone = "139888111313";
		System.out.println(phone.matches(reg));
	}

	@Test
	public void isEmailTest() {
		String reg = "^\\w+((-\\w+)|(\\.\\w+))*@[A-Za-z0-9]+(([.\\-])[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
		String phone = "139888111313@qq-s.vc.vccom";
		System.out.println(phone.matches(reg));
	}

	@Test
	public void stringSortTest() {
		List<String> keyList = new ArrayList<>();
		keyList.add("dfs23rfeds");
		keyList.add("423fhu");
		keyList.add("v3f2sa");
		keyList.add("75erfgd");
		keyList.add(" @asj54 ");
		System.out.println(keyList);
		keyList.sort((o1, o2) -> {
			if (o1 == null && o2 == null) {
				return 0;
			} else if (o1 == null) {
				return -1;
			} else if (o2 == null) {
				return 1;
			}
			return o1.compareTo(o2);
		});
		System.out.println(keyList);
	}

	@Test
	public void isUrlTest() {
		String url = "https:///www.cnblogs.com/woaiadu/p/7084250.html?fsdf=3r";
		System.out.println(StringUtil.isUrl(url));
	}

	@Test
	public void substringTest() {
		String s = "asd1";
		System.out.println(s.substring(s.length() - 1));
	}
}
