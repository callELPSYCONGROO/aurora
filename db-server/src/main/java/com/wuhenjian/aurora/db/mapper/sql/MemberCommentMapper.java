package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.MemberComment;
import com.wuhenjian.aurora.utils.entity.dao.MemberCommentCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("memberCommentMapper")
public interface MemberCommentMapper {
	int deleteByPrimaryKey(Long caId);

	int insert(MemberComment record);

	int insertSelective(MemberComment record);

	List<MemberComment> selectByCriteriaWithBLOBs(MemberCommentCriteria criteria);

	List<MemberComment> selectByCriteria(MemberCommentCriteria criteria);

	MemberComment selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") MemberComment record, @Param("criteria") MemberCommentCriteria criteria);

	int updateByCriteriaWithBLOBs(@Param("record") MemberComment record, @Param("criteria") MemberCommentCriteria criteria);

	int updateByCriteria(@Param("record") MemberComment record, @Param("criteria") MemberCommentCriteria criteria);

	int updateByPrimaryKeySelective(MemberComment record);

	int updateByPrimaryKeyWithBLOBs(MemberComment record);

	int updateByPrimaryKey(MemberComment record);

	int countByModel(MemberComment model);

	List<MemberComment> selectByModelWithBLOBs(MemberComment model);

	List<MemberComment> selectByModel(MemberComment model);
}