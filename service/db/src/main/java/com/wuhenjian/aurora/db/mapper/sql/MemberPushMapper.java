package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.MemberPush;
import com.wuhenjian.aurora.utils.entity.dao.MemberPushCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("memberPushMapper")
public interface MemberPushMapper {
	int deleteByPrimaryKey(Long caId);

	int insert(MemberPush record);

	int insertSelective(MemberPush record);

	List<MemberPush> selectByCriteria(MemberPushCriteria criteria);

	MemberPush selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") MemberPush record, @Param("criteria") MemberPushCriteria criteria);

	int updateByCriteria(@Param("record") MemberPush record, @Param("criteria") MemberPushCriteria criteria);

	int updateByPrimaryKeySelective(MemberPush record);

	int updateByPrimaryKey(MemberPush record);

	int countByModel(MemberPush model);

	List<MemberPush> selectByModel(MemberPush model);
}