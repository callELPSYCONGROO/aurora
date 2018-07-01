package com.wuhenjian.aurora.fileservice.service;

import com.wuhenjian.aurora.utils.entity.zimg.ZimgResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;

import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/3 17:40
 */
public interface ZimgService {

	/**
	 * 上传一张图片
	 * @param params <p>第一级map，key随机即可。</p>
	 * <ul>第二级map，key-value为：
	 * <li>fileName-文件名（String）</li>
	 * <li>fileBytes-文件二进制（bytes）</li>
	 * <li>fileType-文件类型（String）</li>
	 * </ul>
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
	List<String> upload(Map<String, Map<String, Object>> params) throws BusinessException;

	/**
	 * 查询图片信息
	 * @param imgMd5 图片md5
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
	ZimgResult info(String imgMd5) throws BusinessException;

	/**
	 * 删除图片
	 * @param imgMd5 图片md5
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
	ZimgResult delete(String imgMd5) throws BusinessException;
}
