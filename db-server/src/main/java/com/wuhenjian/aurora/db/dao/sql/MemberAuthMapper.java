package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuthCriteria;

import org.springframework.stereotype.Repository;

@Repository("memberAuthMapper")
public interface MemberAuthMapper extends BaseMapper<MemberAuth,MemberAuthCriteria> {
}