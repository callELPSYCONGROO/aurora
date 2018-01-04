package com.wuhenjian.aurora.fileservice.service.impl;

import com.wuhenjian.aurora.fileservice.service.ZimgService;
import com.wuhenjian.aurora.utils.HttpClientUtil;
import com.wuhenjian.aurora.utils.JsonUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.constant.HttpContentType;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.HtmlParserUtil;
import com.wuhenjian.aurora.utils.entity.zimg.ZimgParam;
import com.wuhenjian.aurora.utils.entity.zimg.ZimgResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.apache.http.entity.ContentType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
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

	/**
	 * 上传图片，可以为多张图片
	 * @param params <p>第一级map，key随机即可。</p>
	 * <ul>第二级map，key-value为：
	 * <li>fileName-文件名（String）</li>
	 * <li>fileBytes-文件二进制（bytes）</li>
	 * <li>fileType-文件类型（String）</li>
	 * </ul>
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
	@Override
	public List<String> upload(Map<String, Map<String, Object>> params) throws BusinessException {
		for (String key : params.keySet()) {
			Map<String, Object> map = params.get(key);
			if (map == null) {
				throw new BusinessException(ResultStatus.MAP_EMPTY);
			}
			String fileName = (String) map.get("fileName");
			if (StringUtil.isBlank(fileName)) {
				throw new BusinessException(ResultStatus.FILE_PARAM_IS_EMPTY);
			}
			String fileType = (String) map.get("fileType");
			if (StringUtil.isBlank(fileType)) {
				throw new BusinessException(ResultStatus.FILE_PARAM_IS_EMPTY);
			}
			ContentType contentType = HttpContentType.getContentType(fileType);
			if (contentType == null) {
				throw new BusinessException(ResultStatus.FILE_TYPE_INVALID);
			}
			map.put("fileType", contentType);
			byte[] fileBytes = (byte[]) map.get("fileBytes");
			if (fileBytes == null || fileBytes.length == 0) {
				throw new BusinessException(ResultStatus.FILE_PARAM_IS_EMPTY);
			}
		}
		String content;
		try {
			content = HttpClientUtil.postMethodWithFileBytes(basePath + ZIMG_UPLOAD, params);
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.SYSTEM_EXCEPTION);
		}
		return HtmlParserUtil.getZimgMd5(content);
	}

	/**
	 * 查询图片信息
	 * @param imgMd5 图片md5
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
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

	/**
	 * 删除图片
	 * @param imgMd5 图片md5
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
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
