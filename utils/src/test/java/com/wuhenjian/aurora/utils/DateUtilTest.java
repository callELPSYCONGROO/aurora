package com.wuhenjian.aurora.utils;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static com.wuhenjian.aurora.utils.DateUtil.SKY_BRANCH_CHAR;
import static com.wuhenjian.aurora.utils.DateUtil.EARTH_BRANCH_CHAR;

/**
 * @author 無痕剑
 * @date 2017/12/26 20:32
 */
public class DateUtilTest {

	@Test
	public void skyEarthTest() {
		for (char aEARTH_BRANCH_CHAR : EARTH_BRANCH_CHAR) {
			for (char aSKY_BRANCH_CHAR : SKY_BRANCH_CHAR) {
				System.out.print("\"" + aSKY_BRANCH_CHAR + aEARTH_BRANCH_CHAR + "\", ");
			}
			System.out.println();
		}
	}

	@Test
	public void getYear() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		//获取年的干支
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
	}

	@Test
	public void getMonth() {
		System.out.println(9 % 9);
	}
}
