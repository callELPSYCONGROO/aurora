package com.wuhenjian.aurora.fileservice.controller;

import com.wuhenjian.aurora.fileservice.service.ZimgService;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.entity.zimg.ZimgResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/5 11:23
 */
@RestController
@RequestMapping("/zimg")
public class ZimgController {

	@Resource(name = "zimgService")
	private ZimgService zimgService;

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
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ApiResult upload(Map<String, Map<String, Object>> params) throws BusinessException {
		List<String> list = zimgService.upload(params);
		return ApiResult.success(list);
	}

	/**
	 * 查询图片信息
	 * @param imgMd5 图片md5
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public ApiResult info(String imgMd5) throws BusinessException {
		ZimgResult info = zimgService.info(imgMd5);
		return ApiResult.success(info);
	}

	/**
	 * 删除图片
	 * @param imgMd5 图片md5
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ApiResult delete(String imgMd5) throws BusinessException {
		ZimgResult delete = zimgService.delete(imgMd5);
		return ApiResult.success(delete);
	}
}
