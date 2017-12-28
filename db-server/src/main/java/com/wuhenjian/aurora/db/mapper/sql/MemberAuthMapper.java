package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuthCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("memberAuthMapper")
public interface MemberAuthMapper {
	int deleteByPrimaryKey(Long caId);

	int insert(MemberAuth record);

	int insertSelective(MemberAuth record);

	List<MemberAuth> selectByCriteria(MemberAuthCriteria criteria);

	MemberAuth selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") MemberAuth record, @Param("criteria") MemberAuthCriteria criteria);

	int updateByCriteria(@Param("record") MemberAuth record, @Param("criteria") MemberAuthCriteria criteria);

	int updateByPrimaryKeySelective(MemberAuth record);

	int updateByPrimaryKey(MemberAuth record);

	int countByModel(MemberAuth model);

	List<MemberAuth> selectByModel(MemberAuth model);

	MemberAuth selectByPhone(@Param("phone") String phone);

	MemberAuth selectByEmail(@Param("service") String email);
}