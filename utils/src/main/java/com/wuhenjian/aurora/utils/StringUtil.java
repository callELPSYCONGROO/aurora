package com.wuhenjian.aurora.utils;

/**
 * 字符串转换成对象
 * @author 無痕剑
 * @date 2017/12/5 11:45
 */
public class StringUtil {

	private StringUtil() {}

	/**
	 * 判断字符串为空
	 * @param string 字符串
	 * @return 空：true
	 */
	public static boolean isBlank(String string) {
		if (string == null) {
			return true;
		} else if (string.isEmpty()) {
			return true;
		} else if (string.matches("^[ ]+$")) {
			return true;
		}
		return false;
	}

	public static boolean isNotBlank(String string) {
		return isBlank(string);
	}

	/**
	 * 字符串转换成Long
	 * @param s 字符串
	 * @return Long
	 */
	public static Long str2Long(String s) {
		return Long.valueOf(s);
	}
}
