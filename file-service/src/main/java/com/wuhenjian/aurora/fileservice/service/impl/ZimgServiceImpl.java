package com.wuhenjian.aurora.fileservice.service.impl;

import com.wuhenjian.aurora.fileservice.service.ZimgService;
import com.wuhenjian.aurora.utils.HttpClientUtil;
import com.wuhenjian.aurora.utils.JsonUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.zimg.ZimgParam;
import com.wuhenjian.aurora.utils.entity.zimg.ZimgResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/3 17:40
 */
@Service("zimgService")
public class ZimgServiceImpl implements ZimgService {

	@Value("file.zimg.base-path")
	private String basePath;

	private final static String ZIMG_UPLOAD = "upload";

	private final static String ZIMG_ADMIN = "admin";

	private final static String ZIMG_INFO = "info";

	@Override
	public ZimgResult upload(Object img, String type) {
		return null;
	}

	@Override
	public ZimgResult info(String imgMd5) throws BusinessException {
		ZimgParam zimgParam = new ZimgParam();
		zimgParam.setMd5(imgMd5);
		String content;
		try {
			String url = basePath + ZIMG_INFO;
			Map<String, String> params = zimgParam.convert2Map();
			content = HttpClientUtil.getMethod(url, params);
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.HTTPCLIENT_EXCP);
		}
		return JsonUtil.json2Obj(content, ZimgResult.class);
	}

	@Override
	public ZimgResult delete(String imgMd5) throws BusinessException {
		ZimgParam zimgParam = new ZimgParam();
		zimgParam.setMd5(imgMd5);
		zimgParam.setT("1");
		String content;
		try {
			content = HttpClientUtil.getMethod(basePath + ZIMG_ADMIN, zimgParam.convert2Map());
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.HTTPCLIENT_EXCP);
		}
		return JsonUtil.json2Obj(content, ZimgResult.class);
	}
}
