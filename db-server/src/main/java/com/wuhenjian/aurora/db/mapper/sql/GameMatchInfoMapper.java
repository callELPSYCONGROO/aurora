package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.GameMatchInfo;
import com.wuhenjian.aurora.utils.entity.dao.GameMatchInfoCriteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("gameMatchInfoMapper")
public interface GameMatchInfoMapper {
	int deleteByPrimaryKey(Long caId);

	int insert(GameMatchInfo record);

	int insertSelective(GameMatchInfo record);

	List<GameMatchInfo> selectByCriteria(GameMatchInfoCriteria criteria);

	GameMatchInfo selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") GameMatchInfo record, @Param("criteria") GameMatchInfoCriteria criteria);

	int updateByCriteria(@Param("record") GameMatchInfo record, @Param("criteria") GameMatchInfoCriteria criteria);

	int updateByPrimaryKeySelective(GameMatchInfo record);

	int updateByPrimaryKey(GameMatchInfo record);

	int countByModel(GameMatchInfo model);

	List<GameMatchInfo> selectByModel(GameMatchInfo model);
}