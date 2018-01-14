package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.entity.bo.TokenInfo;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.zimg.ZimgParam;
import org.junit.Test;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:11
 */
public class BeanUtilTest {

	@Test
	public void b2m() throws IllegalAccessException, IntrospectionException, InvocationTargetException {
//		TokenInfo tokenInfo = new TokenInfo("fdsfsdfdsf", 3200);
		PhpProject p = new PhpProject();
		p.setUpdateTime(new Date());
		p.setRepoName("dsad");
		p.setForksCount(111);
		System.out.println(BeanUtil.bean2Map(p));
	}

	@Test
	public void b2mTest() throws IllegalAccessException, IntrospectionException, InvocationTargetException, InstantiationException {
		PhpProject p = new PhpProject();
		p.setUpdateTime(new Date());
		p.setRepoName("dsad");
		p.setForksCount(111);
		Map<String, Object> objectMap = BeanUtil.bean2Map(p);
		System.out.println(objectMap);
//		ZimgParam param = new ZimgParam();
//		param.setMd5("fdjhsf938fj289ufjweofj");
//		param.setT("1");
//		param.setF("gif");
//		System.out.println(param.convert2Map());
//		PhpProject bean = (PhpProject) BeanUtil.map2Bean(objectMap, PhpProject.class);
//		System.out.println(bean);
	}
}
