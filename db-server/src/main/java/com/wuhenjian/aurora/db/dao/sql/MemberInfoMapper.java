package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfoCriteria;

import org.springframework.stereotype.Repository;

@Repository("memberInfoMapper")
public interface MemberInfoMapper extends BaseMapper<MemberInfo,MemberInfoCriteria> {
}