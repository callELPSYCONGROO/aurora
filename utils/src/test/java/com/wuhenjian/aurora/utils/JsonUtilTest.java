package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.junit.Test;

/**
 * @author 無痕剑
 * @date 2017/12/5 15:27
 */
public class JsonUtilTest {

	@Test
	public void obj2JsonTest() {
		System.out.println(JsonUtil.obj2Json(ApiResult.fail(9998, "失败了")));
	}
}
