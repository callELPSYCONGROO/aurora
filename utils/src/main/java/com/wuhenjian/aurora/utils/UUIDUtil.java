package com.wuhenjian.aurora.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigInteger;
import java.util.UUID;

/**
 * 获得各种唯一ID
 * @author 無痕剑
 * @date 2017/12/6 17:47
 */
public class UUIDUtil {

    private UUIDUtil() {}

    /**
     * 得到radix位进制的uuid
     * @param radix 进制，最大为62进制，最小为2，输入其他值默认为10进制
     * @return uuid
     */
    public static String getUuid(int radix) {
        String uuid = UUID.randomUUID().toString();//得到uuid，实际上为十六进制的一个数字
        String s = uuid.replaceAll("-", "").toLowerCase();//去掉"-"符号，变为小写
        BigInteger b = new BigInteger(s, 16);//将uuid变为大数
        return RadixUtil.toString(b, radix);
    }

    /**
     * 得到随机字符串，字母数字，小写
     */
    public static String getRandomString(int length) {
	    return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }
}
