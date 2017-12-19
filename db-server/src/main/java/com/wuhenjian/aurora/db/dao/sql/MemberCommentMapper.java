package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberComment;
import com.wuhenjian.aurora.utils.entity.dao.MemberCommentCriteria;

import org.springframework.stereotype.Repository;

@Repository("memberCommentMapper")
public interface MemberCommentMapper extends BaseMapper<MemberComment,MemberCommentCriteria> {
}