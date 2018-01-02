package com.wuhenjian.aurora.utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

import static com.wuhenjian.aurora.utils.DateUtil.SKY_BRANCH_STR;
import static com.wuhenjian.aurora.utils.DateUtil.EARTH_BRANCH_STR;

/**
 * @author 無痕剑
 * @date 2017/12/26 20:32
 */
public class DateUtilTest {

	@Test
	public void skyEarthTest() {
		for (String aEARTH_BRANCH_CHAR : EARTH_BRANCH_STR) {
			for (String aSKY_BRANCH_CHAR : SKY_BRANCH_STR) {
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

	@Test
	public void linkedListTest() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addAll(Arrays.asList(EARTH_BRANCH_STR));
		System.out.println(linkedList.get(12));
	}

	@Test
	public void date2ChineseCalendarStrTest() {
		System.out.println(DateUtil.date2ChineseCalendarStr(new Date()));
	}

	@Test
	public void date2ChineseCalendarIntTest() {
		System.out.println(DateUtil.date2ChineseCalendarInt(new Date()));
	}
}
