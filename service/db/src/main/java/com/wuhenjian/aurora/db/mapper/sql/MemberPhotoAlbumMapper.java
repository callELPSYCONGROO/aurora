package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbum;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberPhotoAlbumMapper {
	int deleteByCriteria(MemberPhotoAlbumCriteria criteria);

	int deleteByPrimaryKey(Long mpaId);

	int insert(MemberPhotoAlbum record);

	int insertSelective(MemberPhotoAlbum record);

	List<MemberPhotoAlbum> selectByCriteria(MemberPhotoAlbumCriteria criteria);

	MemberPhotoAlbum selectByPrimaryKey(Long mpaId);

	int updateByCriteriaSelective(@Param("record") MemberPhotoAlbum record, @Param("criteria") MemberPhotoAlbumCriteria criteria);

	int updateByCriteria(@Param("record") MemberPhotoAlbum record, @Param("criteria") MemberPhotoAlbumCriteria criteria);

	int updateByPrimaryKeySelective(MemberPhotoAlbum record);

	int updateByPrimaryKey(MemberPhotoAlbum record);

	int countByModel(MemberPhotoAlbum model);

	List<MemberPhotoAlbum> selectByModel(MemberPhotoAlbum model);
}