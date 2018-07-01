package com.wuhenjian.aurora.authservice.controller;

import com.wuhenjian.aurora.utils.AuthUtil;
import com.wuhenjian.aurora.utils.DateUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/11 12:48
 */
@RestController
public class SignAuthController {

	/**
	 * 验证签名
	 * @param paramMap 参数集合（不含paramSign参数）
	 * @param paramSign 签名
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
	@RequestMapping("/sign")
	public ApiResult verifySign(Map<String,String> paramMap, String paramSign) throws BusinessException {
		//验证时间戳
		String timestamp = paramMap.get("timestamp");
		if (DateUtil.isTimestamp(timestamp)) {
			throw new BusinessException(ResultStatus.TIMESTAMP_FORMAT_ERROR);
		}
		long ts = Long.valueOf(timestamp);
		long diffTime = System.currentTimeMillis() - ts;
		if (diffTime > DateUtil.TEN_SECONDS_MS || diffTime < 0) {//与当前时间大于10秒，或在当前时间之后
			throw new BusinessException(ResultStatus.TIMESTAMP_OVERTIME);
		}
		if (AuthUtil.verifySign(paramMap, paramSign)) {
			return ApiResult.success();
		} else {
			throw new BusinessException(ResultStatus.SIGN_ERROR);
		}
	}
}
