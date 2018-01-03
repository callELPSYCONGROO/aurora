package com.wuhenjian.aurora.fileservice.service;

import com.wuhenjian.aurora.utils.entity.zimg.ZimgResult;

/**
 * @author 無痕剑
 * @date 2018/1/3 17:40
 */
public interface ZimgService {

	ZimgResult upload(Object img, String type);

	ZimgResult info(String imgMd5);

	ZimgResult delete();
}
