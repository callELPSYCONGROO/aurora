package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class MemberPhotoAlbum extends Page implements Serializable {
    private Long mpaId;

    private Long maId;

    private String title;

    private String des;

    private String model;

    private Integer num;

    private Integer isShow;

    private Date updateTime;

    private Date createTime;
}