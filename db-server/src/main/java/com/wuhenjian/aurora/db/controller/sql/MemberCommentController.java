package com.wuhenjian.aurora.db.controller.sql;

import com.wuhenjian.aurora.db.controller.AbstractSqlBaseController;
import com.wuhenjian.aurora.db.controller.SqlBaseController;
import com.wuhenjian.aurora.db.dao.sql.MemberCommentMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberComment;
import com.wuhenjian.aurora.utils.entity.dao.MemberCommentCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:30
 */
@RestController
@RequestMapping(SqlBaseController.BASE_PATH + "/member-comment")
public class MemberCommentController extends AbstractSqlBaseController<MemberComment,MemberCommentCriteria,MemberCommentMapper> {

	@Resource(name = "memberCommentMapper")
	@Override
	public void setMapper(MemberCommentMapper mapper) {
		super.setMapper(mapper);
	}
}
