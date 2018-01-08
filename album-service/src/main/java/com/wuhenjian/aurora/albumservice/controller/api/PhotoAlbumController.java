package com.wuhenjian.aurora.albumservice.controller.api;

import com.wuhenjian.aurora.albumservice.service.PhotoAlbumService;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbum;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.entity.vo.MemberPhotoAlbumInfo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/5 11:22
 */
@RestController
public class PhotoAlbumController {

	@Resource(name = "photoAlbumService")
	private PhotoAlbumService photoAlbumService;

	@RequestMapping(value = "/createAlbum", method = RequestMethod.POST)
	public ApiResult createAlbum(String title, String des, String model, HttpServletRequest request) throws BusinessException {
		if (StringUtil.hasBlank(new String[]{title, des, model})) {
			throw new BusinessException(ResultStatus.PARAM_IS_EMPTY);
		}
		MemberAcctInfo mai = (MemberAcctInfo) request.getAttribute(CommonContant.REQUEST_MEMBER_INFO);
		MemberPhotoAlbum mpa = new MemberPhotoAlbum();
		mpa.setMaId(mai.getMaId());
		mpa.setTitle(title);
		mpa.setDes(des);
		mpa.setModel(model);
		Date time = new Date();
		mpa.setUpdateTime(time);
		mpa.setCreateTime(time);
		photoAlbumService.createAlbum(mpa);
		return ApiResult.success();
	}

	@RequestMapping(value = "/uploadPicture", method = RequestMethod.POST)
	public ApiResult uploadPicture(MultipartFile multipartFile, Long mpaId, HttpServletRequest request) throws IOException, BusinessException {
		MemberAcctInfo mai = (MemberAcctInfo) request.getAttribute(CommonContant.REQUEST_MEMBER_INFO);
		Map<String, Map<String, Object>> params = this.multipartfile2Map(multipartFile);
		photoAlbumService.uploadPicture(mai.getMaId(), mpaId, params);
		return ApiResult.success();
	}

	@RequestMapping(value = "/viewAlbum", method = RequestMethod.GET)
	public ApiResult viewAlbum(Long mpaId, HttpServletRequest request) throws BusinessException {
		MemberAcctInfo mai = (MemberAcctInfo) request.getAttribute(CommonContant.REQUEST_MEMBER_INFO);
		MemberPhotoAlbumInfo memberPhotoAlbumInfo = photoAlbumService.viewAlbum(mai.getMaId(), mpaId);
		return ApiResult.success(memberPhotoAlbumInfo);
	}

	/**
	 * 将MultipartFile数组转换为Map对象
	 * @param multipartFile 文件
	 * @return Map对象
	 */
	private Map<String, Map<String, Object>> multipartfile2Map(MultipartFile multipartFile) throws IOException {
		Map<String, Map<String, Object>> params = new HashMap<>();
		Map<String, Object> fileMap = new HashMap<>();
		byte[] fileBytes = multipartFile.getBytes();
		String fileName = multipartFile.getOriginalFilename();
		String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
		String inputName = multipartFile.getName();
		Integer fileSort = Integer.valueOf(inputName.substring(inputName.length() - 1));
		fileMap.put("fileType", fileType);
		fileMap.put("fileName", fileName);
		fileMap.put("fileBytes", fileBytes);
		fileMap.put("fileSort", fileSort);
		params.put("file", fileMap);
		return params;
	}
}
