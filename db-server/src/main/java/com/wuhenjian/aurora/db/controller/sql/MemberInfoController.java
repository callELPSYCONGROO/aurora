package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.controller.SqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.MemberInfoMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfoCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:31
 */
@RestController
@RequestMapping(SqlBaseController.BASE_PATH + "/member-info")
public class MemberInfoController extends AbstractSqlBaseController<MemberInfo,MemberInfoCriteria,MemberInfoMapper> {

	@Resource(name = "memberInfoMapper")
	@Override
	public void setMapper(MemberInfoMapper mapper) {
		super.setMapper(mapper);
	}
}
