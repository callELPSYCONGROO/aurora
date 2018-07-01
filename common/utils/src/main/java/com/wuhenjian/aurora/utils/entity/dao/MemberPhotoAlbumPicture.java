package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class MemberPhotoAlbumPicture extends Page implements Serializable {
    private Long mpapId;

    private Long maId;

    private Long mpaId;

    private String relativePath;

    private Integer sort;

    private Date updateTime;

    private Date createTime;
}