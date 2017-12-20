package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.utils.entity.dao.CommonAd;
import com.wuhenjian.aurora.utils.entity.dao.CommonAdCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("commonAdMapper")
public interface CommonAdMapper {
	int deleteByPrimaryKey(Long caId);

	int insert(CommonAd record);

	int insertSelective(CommonAd record);

	List<CommonAd> selectByCriteriaWithBLOBs(CommonAdCriteria criteria);

	List<CommonAd> selectByCriteria(CommonAdCriteria criteria);

	CommonAd selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") CommonAd record, @Param("criteria") CommonAdCriteria criteria);

	int updateByCriteriaWithBLOBs(@Param("record") CommonAd record, @Param("criteria") CommonAdCriteria criteria);

	int updateByCriteria(@Param("record") CommonAd record, @Param("criteria") CommonAdCriteria criteria);

	int updateByPrimaryKeySelective(CommonAd record);

	int updateByPrimaryKeyWithBLOBs(CommonAd record);

	int updateByPrimaryKey(CommonAd record);

	int countByModel(CommonAd model);

	List<CommonAd> selectByModelWithBLOBs(CommonAd model);

	List<CommonAd> selectByModel(CommonAd model);
}