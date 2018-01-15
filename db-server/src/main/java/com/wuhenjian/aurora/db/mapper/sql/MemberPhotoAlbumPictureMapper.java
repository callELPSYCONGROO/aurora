package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPicture;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPictureCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberPhotoAlbumPictureMapper {
	int deleteByCriteria(MemberPhotoAlbumPictureCriteria criteria);

	int deleteByPrimaryKey(Long mpapId);

	int insert(MemberPhotoAlbumPicture record);

	int insertSelective(MemberPhotoAlbumPicture record);

	List<MemberPhotoAlbumPicture> selectByCriteria(MemberPhotoAlbumPictureCriteria criteria);

	MemberPhotoAlbumPicture selectByPrimaryKey(Long mpapId);

	int updateByCriteriaSelective(@Param("record") MemberPhotoAlbumPicture record, @Param("criteria") MemberPhotoAlbumPictureCriteria criteria);

	int updateByCriteria(@Param("record") MemberPhotoAlbumPicture record, @Param("criteria") MemberPhotoAlbumPictureCriteria criteria);

	int updateByPrimaryKeySelective(MemberPhotoAlbumPicture record);

	int updateByPrimaryKey(MemberPhotoAlbumPicture record);

	int countByModel(MemberPhotoAlbumPicture model);

	List<MemberPhotoAlbumPicture> selectByModel(MemberPhotoAlbumPicture model);
}