package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.junit.Test;

/**
 * @author Administrator
 * @date 2018/1/13/013 15:37
 */
public class ObjectTest {

	@Test
	public void pageTest() throws BusinessException {
		Page page = new Page();
		page.setNum(1);
		page.setSize(2);
		page.setOrderBy(null);
		System.out.println(page.isNullPage());
	}
}
