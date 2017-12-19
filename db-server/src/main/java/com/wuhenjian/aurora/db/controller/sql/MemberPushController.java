package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.controller.SqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.MemberPushMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberPush;
import com.wuhenjian.aurora.utils.entity.dao.MemberPushCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:31
 */
@RestController
@RequestMapping(SqlBaseController.BASE_PATH + "/member-push")
public class MemberPushController extends AbstractSqlBaseController<MemberPush,MemberPushCriteria,MemberPushMapper> {

	@Resource(name = "memberPushMapper")
	@Override
	public void setMapper(MemberPushMapper mapper) {
		super.setMapper(mapper);
	}
}
