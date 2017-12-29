package com.wuhenjian.aurora.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具
 * @author 無痕剑
 * @date 2017/12/5 11:50
 */
public class DateUtil {

	/** 五分钟秒数 */
	public final static int FIVE_MIN_S = 60 * 5;
	/** 十秒钟毫秒数 */
	public final static long TEN_SECONDS_MS = 1000L * 10;
	/** 一分钟毫秒数 */
	public final static long ONE_MIN_MS = 1000L * 60 * 60;
	/** 天干字 */
	public final static String[] SKY_BRANCH_STR = new String[]{"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
	/** 地支字 */
	public final static String[] EARTH_BRANCH_STR = new String[]{"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
	/** 天干数 */
	public final static Integer[] SKY_BRANCH_INT = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	/** 地支数 */
	public final static Integer[] EARTH_BRANCH_INT = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	/** 天干地支字 */
	public final static String[] SKY_EARTH_STR = new String[]{
			"甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳", "庚午", "辛未", "壬申", "癸酉",
			"甲戌", "乙亥", "丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", "壬午", "癸未",
			"甲申", "乙酉", "丙戌", "丁亥", "戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳",
			"甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", "庚子", "辛丑", "壬寅", "癸卯",
			"甲辰", "乙巳", "丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", "壬子", "癸丑",
			"甲寅", "乙卯", "丙辰", "丁巳", "戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥"};
	/** 天干地支数 */
	public final static Integer[] SKY_EARTH_INT = new Integer[]{
			0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
			10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
			30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
			40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
			50, 51, 52, 53, 54, 55, 56, 57, 58, 59};

	private DateUtil() {}

	/**
	 * 判断字符串是否为时间戳
	 * @param timestamp 时间戳字符串
	 * @return 是-true，否-false
	 */
	public static boolean isTimestamp(String timestamp) {
		return timestamp.matches("^\\d*$");
	}

	/**
	 * 日期转换为农历，格式为：年月日
	 * @param date 日期
	 * @return 农历
	 */
	public static String date2ChineseCalendarStr(Date date) {
		return date2ChineseCalendar(date)[1];
	}

	/**
	 * 日期转换为农历数字
	 * @param date 日期
	 * @return 农历数字
	 */
	public static int date2ChineseCalendarInt(Date date) {
		return Integer.valueOf(date2ChineseCalendar(date)[0]);
	}

	private static String[] date2ChineseCalendar(Date date) {
		String[] result = new String[2];
		String chineseCalendarInt = "";
		String chineseCalendarStr = "";
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		//年
		/*
		先以year除以60得出余数，然后再减去4，最后根据所得结果查表一中相应序数所对应的干支即为该年的干支。
		 */
		int year = calendar.get(Calendar.YEAR);
		int y = year % 60;
		if (y < 4) {
			y = y + 60 - 4;
		}
		chineseCalendarInt += SKY_EARTH_INT[y];
		chineseCalendarStr += SKY_EARTH_STR[y] + "年 ";
		//月
		/*
		若遇甲或己的年份，正月是丙寅；
		遇上乙或庚之年，正月为戊寅；
		遇上丙或辛之年，正月为庚寅；
		遇上丁或壬之年，正月为壬寅；
		遇上戊或癸之年，正月为甲寅。
		依照正月之干支，其余月份按干支推算即可。
		 */
		int mon = y % 10;
		int m = 0;
		switch (mon) {
			case 0:
			case 5:
				m = 2;
				break;
			case 1:
			case 6:
				m = 14;
				break;
			case 2:
			case 7:
				m = 26;
				break;
			case 3:
			case 8:
				m = 38;
				break;
			case 4:
			case 9:
				m = 50;
				break;
		}
		chineseCalendarInt += SKY_EARTH_INT[m];
		chineseCalendarStr += SKY_EARTH_STR[m] + "月 ";
		//日
		/*
		G = 4C + [C / 4] + 5y + [y / 4] + [3 * (M + 1) / 5] + d - 3
		Z = 8C + [C / 4] + 5y + [y / 4] + [3 * (M + 1) / 5] + d + 7 + i
		其中 C 是世纪数减一，y 是年份后两位，M 是月份，d 是日数。
		1月和2月按上一年的13月和14月来算。
		奇数月i=0，偶数月i=6。
		G 除以10的余数是天干，Z 除以12的余数是地支。
		 */
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		int century = year / 100 + 1;//世纪
		int yearLast2 = year % 100;
		int i = month % 2 == 0 ? 6 : 0;
		int g = (4 * century + century / 4 + 5 * yearLast2 + yearLast2 / 4 + 3 * (month + 1) / 5 + day - 3) % 10;
		int z = (8 * century + century / 4 + 5 * yearLast2 + yearLast2 / 4 + 3 * (month + 1) / 5 + day + 7 + i) % 12;
		int daySkyBranch = SKY_BRANCH_INT[g];
		int dayEarchBranch = EARTH_BRANCH_INT[z];
		chineseCalendarInt += "" + daySkyBranch + dayEarchBranch;
		chineseCalendarStr += daySkyBranch + dayEarchBranch + "日 ";
		//时
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int h = (hour + 1) / 2;
		if (h == 12) {
			h = 0;
		}
		chineseCalendarInt += EARTH_BRANCH_INT[h];
		chineseCalendarStr += EARTH_BRANCH_STR[h] + "时";
		result[0] = chineseCalendarInt;
		result[1] = chineseCalendarStr;
		return result;
	}
}
