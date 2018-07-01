package com.wuhenjian.aurora.utils.security;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:50
 */
public class Base64Util {

	/**
	 * 对字符串进行base64加密
	 * @param string 字符串
	 * @return 加密结果
	 */
	public static String encode2Str(String string) throws UnsupportedEncodingException {
		return Base64.encodeBase64String(string.getBytes("UTF-8"));
	}

	public static String encode2Str(byte[] bytes) {
		return Base64.encodeBase64String(bytes);
	}

	public static byte[] encode2Bytes(String string) {
		return Base64.decodeBase64(string);
	}

	public static byte[] encode2Bytes(byte[] bytes) {
		return Base64.decodeBase64(bytes);
	}

	/**
	 * 对Base64字符串解密
	 * @param string base64字符串
	 * @return 解密后的字符串
	 */
	public static String decode2Str(String string) {
		byte[] decodeBase64 = Base64.decodeBase64(string);
		return new String(decodeBase64);
	}

	public static String decode2Str(byte[] bytes) {
		return Base64.encodeBase64String(bytes);
	}

	public static byte[] decode2Bytes(String string) {
		return Base64.decodeBase64(string);
	}

	public static byte[] decode2Bytes(byte[] bytes) {
		return Base64.decodeBase64(bytes);
	}
}
