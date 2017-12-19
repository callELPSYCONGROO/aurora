package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.dao.GameMatchInfo;
import com.wuhenjian.aurora.utils.entity.dao.GameMatchInfoCriteria;

import org.springframework.stereotype.Repository;

@Repository("gameMatchInfoMapper")
public interface GameMatchInfoMapper extends BaseMapper<GameMatchInfo,GameMatchInfoCriteria> {
}