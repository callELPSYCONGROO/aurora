package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.controller.SqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.MemberAuthMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuthCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:30
 */
@RestController
@RequestMapping(SqlBaseController.BASE_PATH + "/member-auth")
public class MemberAuthController extends AbstractSqlBaseController<MemberAuth,MemberAuthCriteria,MemberAuthMapper> {

	@Resource(name = "memberAuthMapper")
	@Override
	public void setMapper(MemberAuthMapper mapper) {
		super.setMapper(mapper);
	}
}
