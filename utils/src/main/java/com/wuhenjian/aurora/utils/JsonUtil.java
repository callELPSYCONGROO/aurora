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

	/**
	 * 将Json字符串转换成对象
	 * @param jsonString json字符串
	 * @param cla 对象类型
	 * @return 对象
	 */
	public static Object json2Obj(String jsonString, Class cla) {
		return JSON.parseObject(jsonString, cla);
	}
}
