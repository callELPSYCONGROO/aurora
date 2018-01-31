package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.mapper.sql.CommonCountMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/27 11:19
 */
@RestController
@RequestMapping(CommonContant.SQL + "/commonCount")
public class CommonCountController {

	@Resource(name = "commonCountMapper")
	private CommonCountMapper commonCountMapper;

	@RequestMapping(value = "/getAccountCode", method = RequestMethod.GET)
	public Long getAccountCode() {
		return commonCountMapper.getAccountCode();
	}

	@RequestMapping(value = "/addAccountCode", method = RequestMethod.POST)
	public void addAccountCode() {
		commonCountMapper.addAccountCode();
	}
}
