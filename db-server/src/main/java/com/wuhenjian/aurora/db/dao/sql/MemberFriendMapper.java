package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.utils.entity.dao.MemberFriend;
import com.wuhenjian.aurora.utils.entity.dao.MemberFriendCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("memberFriendMapper")
public interface MemberFriendMapper {
	int deleteByPrimaryKey(Long caId);

	int insert(MemberFriend record);

	int insertSelective(MemberFriend record);

	List<MemberFriend> selectByCriteria(MemberFriendCriteria criteria);

	MemberFriend selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") MemberFriend record, @Param("criteria") MemberFriendCriteria criteria);

	int updateByCriteria(@Param("record") MemberFriend record, @Param("criteria") MemberFriendCriteria criteria);

	int updateByPrimaryKeySelective(MemberFriend record);

	int updateByPrimaryKey(MemberFriend record);

	int countByModel(MemberFriend model);

	List<MemberFriend> selectByModel(MemberFriend model);
}