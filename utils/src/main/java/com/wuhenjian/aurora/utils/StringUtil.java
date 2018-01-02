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
		}
		return string.matches("^[ ]+$");
	}

	public static boolean isNotBlank(String string) {
		return !isBlank(string);
	}

	public static boolean hasBlank(String[] strings) {
		for (String string : strings) {
			if (isBlank(string)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 字符串转换成Long
	 * @param s 字符串
	 * @return Long
	 */
	public static Long str2Long(String s) {
		return Long.valueOf(s);
	}

	/**
	 * 检查字符串是否为手机号格式
	 * @param string 字符串
	 */
	public static boolean isPhone(String string) {
		String reg = "^1[345678]\\d{9}$";
		return string.matches(reg);
	}

	/**
	 * 检查字符串是否为Email格式
	 * @param string 字符串
	 */
	public static boolean isEmail(String string) {
		String reg = "^\\w+((-\\w+)|(\\.\\w+))*@[A-Za-z0-9]+(([.\\-])[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
		return string.matches(reg);
	}

	/**
	 * 字符串大于某个长度
	 * @param string 字符串
	 * @param length 长度
	 */
	public static boolean moreThanLength(String string, int length) {
		return string.length() > length;
	}

	/**
	 * 字符串小于某个长度
	 * @param string 字符串
	 * @param length 长度
	 */
	public static boolean lessThanLength(String string, int length) {
		return string.length() < length;
	}
}
