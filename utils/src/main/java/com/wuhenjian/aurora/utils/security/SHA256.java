package com.wuhenjian.aurora.utils.security;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * SHA1加密工具
 * @author 無痕剑
 * @date 2017/12/5 10:54
 */
public class SHA256 {

	/**
	 * 将字符串进行SHA-256加密
	 * @param string 加密字符串
	 * @return 加密结果
	 */
	public static String encode(String string) {
		return DigestUtils.sha256Hex(string);
	}

	/**
	 * 将集合按照key字母顺序排序成字符串后进行SHA-256加密
	 * @param map 加密字符串
	 * @return 加密结果
	 */
	public static String encode(Map<String,String> map) {
		String string = orderMap2String(map);
		return encode(string);
	}

	/**
	 * 将集合按照key的字符串排序顺序进行key=value排序
	 * @param map 集合
	 * @return 排序结果字符串
	 */
	private static String orderMap2String(Map<String,String> map) {
		StringBuilder sb = new StringBuilder();
		SortedMap<String,String> sortedMap = new TreeMap<>(map);
		sortedMap.forEach((key, val) -> sb.append(key).append(val));
		return sb.toString();
	}
}
