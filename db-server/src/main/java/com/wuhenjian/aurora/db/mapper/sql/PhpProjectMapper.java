package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dao.PhpProjectCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PhpProjectMapper {
	int deleteByCriteria(PhpProjectCriteria criteria);

	int deleteByPrimaryKey(Long ppId);

	int insert(PhpProject record);

	int insertSelective(PhpProject record);

	List<PhpProject> selectByCriteria(PhpProjectCriteria criteria);

	PhpProject selectByPrimaryKey(Long ppId);

	int updateByCriteriaSelective(@Param("record") PhpProject record, @Param("criteria") PhpProjectCriteria criteria);

	int updateByCriteria(@Param("record") PhpProject record, @Param("criteria") PhpProjectCriteria criteria);

	int updateByPrimaryKeySelective(PhpProject record);

	int updateByPrimaryKey(PhpProject record);

	int countByModel(PhpProject model);

	List<PhpProject> selectByModel(PhpProject model);

	PhpProject selectByAcctAndRepo(@Param("acct") String acct, @Param("repo") String repo);

	List<PhpProject> selectRepoByAcct(PhpProject record);
}