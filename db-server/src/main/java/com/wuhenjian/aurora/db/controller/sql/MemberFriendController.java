package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.controller.SqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.MemberFriendMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberFriend;
import com.wuhenjian.aurora.utils.entity.dao.MemberFriendCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:31
 */
@RestController
@RequestMapping(SqlBaseController.BASE_PATH + "/member-friend")
public class MemberFriendController extends AbstractSqlBaseController<MemberFriend,MemberFriendCriteria,MemberFriendMapper> {

	@Resource(name = "memberFriendMapper")
	@Override
	public void setMapper(MemberFriendMapper mapper) {
		super.setMapper(mapper);
	}
}
