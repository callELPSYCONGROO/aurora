package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfoCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("memberInfoMapper")
public interface MemberInfoMapper {
	int deleteByPrimaryKey(Long caId);

	int insert(MemberInfo record);

	int insertSelective(MemberInfo record);

	List<MemberInfo> selectByCriteria(MemberInfoCriteria criteria);

	MemberInfo selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") MemberInfo record, @Param("criteria") MemberInfoCriteria criteria);

	int updateByCriteria(@Param("record") MemberInfo record, @Param("criteria") MemberInfoCriteria criteria);

	int updateByPrimaryKeySelective(MemberInfo record);

	int updateByPrimaryKey(MemberInfo record);

	int countByModel(MemberInfo model);

	List<MemberInfo> selectByModel(MemberInfo model);
}