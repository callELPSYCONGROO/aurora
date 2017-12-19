package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.db.dao.BaseMapper;
import com.wuhenjian.aurora.utils.entity.dao.CommonPicture;
import com.wuhenjian.aurora.utils.entity.dao.CommonPictureCriteria;

import org.springframework.stereotype.Repository;

@Repository("commonPictureMapper")
public interface CommonPictureMapper extends BaseMapper<CommonPicture, CommonPictureCriteria> {
}