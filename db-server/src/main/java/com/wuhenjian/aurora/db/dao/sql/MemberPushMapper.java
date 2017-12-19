package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberPush;
import com.wuhenjian.aurora.utils.entity.dao.MemberPushCriteria;

import org.springframework.stereotype.Repository;

@Repository("memberPushMapper")
public interface MemberPushMapper extends BaseMapper<MemberPush,MemberPushCriteria> {
}