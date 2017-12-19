package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.dao.GameScore;
import com.wuhenjian.aurora.utils.entity.dao.GameScoreCriteria;

import org.springframework.stereotype.Repository;

@Repository("gameScoreMapper")
public interface GameScoreMapper extends BaseMapper<GameScore,GameScoreCriteria> {
}