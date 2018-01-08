package com.wuhenjian.aurora.utils.security;

import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;

import java.security.MessageDigest;

/**
 * @author SwordNoTrace
 * @date 2018/1/6 16:36
 */
public class Md5Util {

	private final static int SALT_LENGTH = 8;

	public static String encode(String text) {
		return encode(str2bytes(text));
	}

	public static String encode(String text, String salt) {
		byte[] byteText = str2bytes(text);
		byte[] byteSalt = str2bytes(salt);
		byte[] encode = encode(byteText, byteSalt);
		return new String(encode);
	}

	public static String encode(byte[] text) {
		int saltLength = text.length > SALT_LENGTH ? SALT_LENGTH : text.length;
		byte[] byteSalt = new byte[saltLength];
		System.arraycopy(byteSalt, 0, byteSalt, 0, saltLength);
		byte[] encode = encode(text, byteSalt);
		return new String(encode);
	}

	public static byte[] encode(byte[] text, byte[] salt) {
		MessageDigest md5Digest = DigestUtils.getMd5Digest();
		md5Digest.update(text);
		md5Digest.update(salt);
		return md5Digest.digest();
	}

	private static byte[] str2bytes(String text) {
		return text.getBytes(Charsets.UTF_8);
	}
}
