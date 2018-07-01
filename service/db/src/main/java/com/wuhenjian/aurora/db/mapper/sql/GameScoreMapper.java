package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.GameScore;
import com.wuhenjian.aurora.utils.entity.dao.GameScoreCriteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("gameScoreMapper")
public interface GameScoreMapper {
	int deleteByPrimaryKey(Long caId);

	int insert(GameScore record);

	int insertSelective(GameScore record);

	List<GameScore> selectByCriteria(GameScoreCriteria criteria);

	GameScore selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") GameScore record, @Param("criteria") GameScoreCriteria criteria);

	int updateByCriteria(@Param("record") GameScore record, @Param("criteria") GameScoreCriteria criteria);

	int updateByPrimaryKeySelective(GameScore record);

	int updateByPrimaryKey(GameScore record);

	int countByModel(GameScore model);

	List<GameScore> selectByModel(GameScore model);
}