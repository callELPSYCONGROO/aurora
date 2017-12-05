package com.wuhenjian.aurora.utils;

import com.alibaba.fastjson.JSON;

/**
 * Json工具
 * @author 無痕剑
 * @date 2017/12/5 12:29
 */
public class JsonUtil {

	private JsonUtil() {}

	/**
	 * 将对象转换为Json字符串
	 * @param obj 对象
	 * @return Json字符串
	 */
	public static String obj2Json(Object obj) {
		return JSON.toJSONString(obj);
	}
}
