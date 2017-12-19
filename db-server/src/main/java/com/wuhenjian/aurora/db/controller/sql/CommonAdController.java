package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.controller.SqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.CommonAdMapper;
import com.wuhenjian.aurora.utils.entity.dao.CommonAd;
import com.wuhenjian.aurora.utils.entity.dao.CommonAdCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:28
 */
@RestController
@RequestMapping(SqlBaseController.BASE_PATH + "/common-ad")
public class CommonAdController extends AbstractSqlBaseController<CommonAd, CommonAdCriteria, CommonAdMapper> {

	@Resource(name = "commonAdMapper")
	@Override
	public void setMapper(CommonAdMapper mapper) {
		super.setMapper(mapper);
	}
}
