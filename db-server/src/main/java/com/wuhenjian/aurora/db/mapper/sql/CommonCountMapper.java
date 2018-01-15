package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.CommonCount;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("commonCountMapper")
public interface CommonCountMapper {
    int insert(CommonCount record);

    int insertSelective(CommonCount record);

    CommonCount selectByPrimaryKey(Long ccId);

    int updateByPrimaryKeySelective(CommonCount record);

    int updateByPrimaryKey(CommonCount record);

    int countByModel(CommonCount model);

    List<CommonCount> selectByModel(CommonCount model);

    long getAccountCode();

    int addAccountCode();
}