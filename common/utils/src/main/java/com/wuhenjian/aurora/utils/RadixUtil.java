package com.wuhenjian.aurora.utils;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * 进制转换工具
 *
 * @author SwordNoTrace
 * @date 2017/12/6 22:00
 */
public class RadixUtil {

    private final static String NAME = RadixUtil.class.getName();

    private final static char[] DIGIT = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z',
    };

    /** 支持的最大进制数 */
    public final static int MAX_RADIX = DIGIT.length;

    /** 支持的最小进制数 */
    public final static int MIN_RADIX = 2;

    /** 最多一次返回32个字符 */
    public final static int SIZE = 32;

    private final static Map<Character, Integer> digitMap = new HashMap<>();

    static {
        for (int i = 0; i < MAX_RADIX; i++) {
            digitMap.put(DIGIT[i], i);
        }
    }

    private RadixUtil() {}

    /**
     * 将大数值转换为指定的进制数（最大支持62进制）
     */
    public static String toString(BigInteger i, int radix) {
        if (radix < MIN_RADIX || radix > MAX_RADIX) {
            radix = 10;
        }
        if (radix == 10) {
            return i.toString();
        }

        StringBuilder sb = new StringBuilder(SIZE);
        boolean negative = (i.compareTo(BigInteger.ZERO) < 0);
        if (negative) {
            i = i.abs();
        }
        BigInteger radixBig = new BigInteger("" + radix);
        while (i.compareTo(radixBig) >= 0) {
            sb.append(DIGIT[Integer.valueOf(i.mod(radixBig).toString())]);
            i = i.divide(radixBig);
        }
        sb.append(DIGIT[Integer.valueOf(i.toString())]);
        if (negative) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }

    /**
     * 将字符串转换为长整型数字
     */
    public static BigInteger toNumber(String s, int radix) {
        if (s == null) {
            throw new NumberFormatException("null");
        }
        if (radix < MIN_RADIX) {
            throw new NumberFormatException("radix " + radix + " less than " + NAME + ".MIN_RADIX");
        }
        if (radix > MAX_RADIX) {
            throw new NumberFormatException("radix " + radix + " greater than " + NAME + ".MAX_RADIX");
        }
        // 返回结果
        BigInteger result = BigInteger.ZERO;
        char[] ss = s.toCharArray();
        // 计算阶乘
        long factorial = 1;
        for (int i = (ss.length - 1); i >= 0; i--) {
            char c = ss[i];
            Integer v = digitMap.get(c);
            if (v != null) {
                result = result.add(BigInteger.valueOf(v * factorial)) ;
                factorial *= radix;
            }
        }
        return result;
    }
}
