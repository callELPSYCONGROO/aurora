package com.wuhenjian.aurora.db.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 16:25
 */
public interface BaseMapper<M,Q> {
	int deleteByPrimaryKey(Long caId);

	int insert(M record);

	int insertSelective(M record);

	List<M> selectByCriteriaWithBLOBs(Q criteria);

	List<M> selectByCriteria(Q criteria);

	M selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") M record, @Param("criteria") Q criteria);

	int updateByCriteriaWithBLOBs(@Param("record") M record, @Param("criteria") Q criteria);

	int updateByCriteria(@Param("record") M record, @Param("criteria") Q criteria);

	int updateByPrimaryKeySelective(M record);

	int updateByPrimaryKeyWithBLOBs(M record);

	int updateByPrimaryKey(M record);

	int countByModel(M model);

	List<M> selectByModelWithBLOBs(M model);

	List<M> selectByModel(M model);
}
