package com.wuhenjian.aurora.utils.security;

import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

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
	 * @throws BusinessException 加密异常
	 */
	public static String encode(String string) throws BusinessException {
		if (string == null) {
			return null;
		}
		MessageDigest sha256;
		byte[] bytes;
		try {
			sha256 = MessageDigest.getInstance("SHA-256");
			bytes = sha256.digest(string.getBytes("UTF-8"));
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			throw new BusinessException(ResultStatus.SHA256_ENCODE);
		}
		return Hex.encodeHexString(bytes);
	}

	/**
	 * 将集合按照key字母顺序排序成字符串后进行SHA-256加密
	 * @param map 加密字符串
	 * @return 加密结果
	 * @throws BusinessException 加密异常
	 */
	public static String encode(Map<String,String> map) throws BusinessException {
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
