package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.dao.CommonAd;
import com.wuhenjian.aurora.utils.entity.dao.CommonAdCriteria;

import org.springframework.stereotype.Repository;

@Repository("commonAdMapper")
public interface CommonAdMapper extends BaseMapper<CommonAd, CommonAdCriteria> {
}