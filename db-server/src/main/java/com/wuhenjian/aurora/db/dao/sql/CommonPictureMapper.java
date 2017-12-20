package com.wuhenjian.aurora.db.dao.sql;

import com.wuhenjian.aurora.utils.entity.dao.CommonPicture;
import com.wuhenjian.aurora.utils.entity.dao.CommonPictureCriteria;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("commonPictureMapper")
public interface CommonPictureMapper {
	int deleteByPrimaryKey(Long caId);

	int insert(CommonPicture record);

	int insertSelective(CommonPicture record);

	List<CommonPicture> selectByCriteria(CommonPictureCriteria criteria);

	CommonPicture selectByPrimaryKey(Long caId);

	int updateByCriteriaSelective(@Param("record") CommonPicture record, @Param("criteria") CommonPictureCriteria criteria);

	int updateByCriteria(@Param("record") CommonPicture record, @Param("criteria") CommonPictureCriteria criteria);

	int updateByPrimaryKeySelective(CommonPicture record);

	int updateByPrimaryKey(CommonPicture record);

	int countByModel(CommonPicture model);

	List<CommonPicture> selectByModel(CommonPicture model);
}