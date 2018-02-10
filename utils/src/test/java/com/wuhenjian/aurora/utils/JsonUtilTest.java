package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.entity.dao.PhpBlog;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.junit.Test;

import java.util.Date;

/**
 * @author 無痕剑
 * @date 2017/12/5 15:27
 */
public class JsonUtilTest {

	@Test
	public void obj2JsonTest() {
		System.out.println(JsonUtil.obj2Json(ApiResult.fail(9998, "失败了")));
	}

	@Test
	public void jsonTest() {
		PhpBlog p = new PhpBlog();
		p.setCsdnId(2132523L);
		p.setPbId(12324L);
		p.setUpdateTime(new Date());
		p.setCreatedAt(new Date());
		String json = JsonUtil.obj2Json(p);
		System.out.println(json);
		PhpBlog blog = JsonUtil.json2Obj(json, PhpBlog.class);
		System.out.println(blog);
	}
}
