package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.entity.TokenInfo;
import org.junit.Test;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:11
 */
public class BeanUtilTest {

	@Test
	public void b2m() throws IllegalAccessException, IntrospectionException, InvocationTargetException {
		TokenInfo tokenInfo = new TokenInfo("fdsfsdfdsf", 3200);
		System.out.println(BeanUtil.bean2Map(tokenInfo));
	}
}
