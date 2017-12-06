package com.wuhenjian.aurora.utils;

import java.math.BigInteger;
import java.util.UUID;

/**
 * 获得各种唯一ID
 * @author 無痕剑
 * @date 2017/12/6 17:47
 */
public class UUIDUtil {

    /**
     * 得到22位uuid
     * @return uuid
     */
	public static String getUuid() {
		String uuid = UUID.randomUUID().toString();//得到uuid，实际上为十六进制的一个数字
		String s = uuid.replaceAll("-", "").toLowerCase();//去掉"-"符号，变为小写
        BigInteger b = new BigInteger(s, 16);//将uuid变为大数
		return RadixUtil.toString(b, RadixUtil.MAX_RADIX);
	}
}
