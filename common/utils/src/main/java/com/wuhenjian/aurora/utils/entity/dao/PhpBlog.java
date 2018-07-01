package com.wuhenjian.aurora.utils.entity.dao;

import com.alibaba.fastjson.annotation.JSONField;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class PhpBlog extends Page implements Serializable {
    @JSONField(name = "pb_id")
    private Long pbId;
    @JSONField(name = "title")
    private String title;
    @JSONField(name = "type")
    private String type;
    @JSONField(name = "id")
    private Long csdnId;
    @JSONField(name = "categories")
    private String categories;
    @JSONField(name = "tags")
    private String tags;
    @JSONField(name = "url")
    private String originalUrl;
    @JSONField(name = "description")
    private String description;
    @JSONField(name = "bury")
    private Integer bury;
    @JSONField(name = "digg")
    private Integer digg;
    @JSONField(name = "channel")
    private Integer channel;
    @JSONField(name = "comment_count")
    private Integer commentCount;
    @JSONField(name = "view_count")
    private Integer viewCount;
    @JSONField(name = "php_view_count")
    private Integer phpViewCount;
    @JSONField(name = "create_at")
    private Date createdAt;
    @JSONField(name = "update_time")
    private Date updateTime;

    private String content;
}