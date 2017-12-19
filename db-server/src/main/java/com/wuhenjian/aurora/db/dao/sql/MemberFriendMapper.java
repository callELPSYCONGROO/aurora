package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.dao.MemberFriend;
import com.wuhenjian.aurora.utils.entity.dao.MemberFriendCriteria;

import org.springframework.stereotype.Repository;

@Repository("memberFriendMapper")
public interface MemberFriendMapper extends BaseMapper<MemberFriend,MemberFriendCriteria> {
}