package com.wuhenjian.aurora.utils;

import org.junit.Test;

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
}
