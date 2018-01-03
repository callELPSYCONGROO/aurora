package com.wuhenjian.aurora.fileservice.service.impl;

import com.wuhenjian.aurora.fileservice.service.ZimgService;
import com.wuhenjian.aurora.utils.entity.zimg.ZimgResult;
import org.springframework.stereotype.Service;

/**
 * @author 無痕剑
 * @date 2018/1/3 17:40
 */
@Service("zimgService")
public class ZimgServiceImpl implements ZimgService {

	@Override
	public ZimgResult upload(Object img, String type) {
		return null;
	}

	@Override
	public ZimgResult info(String imgMd5) {
		return null;
	}

	@Override
	public ZimgResult delete() {
		return null;
	}
}
