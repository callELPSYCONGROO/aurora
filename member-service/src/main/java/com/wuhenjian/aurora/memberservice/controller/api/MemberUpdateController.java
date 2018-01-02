package com.wuhenjian.aurora.memberservice.controller.api;

import com.wuhenjian.aurora.memberservice.service.MemberUpdateService;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 無痕剑
 * @date 2017/12/28 9:07
 */
@RestController
@RequestMapping("/update")
public class MemberUpdateController {

	@Resource(name = "memberService")
	private MemberUpdateService memberUpdateService;

	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public ApiResult updatePassword(String memberPassword, String reMemberPassword, String captcha, String captchaKey, HttpServletRequest request) throws BusinessException {
		MemberAcctInfo mai = (MemberAcctInfo) request.getAttribute(CommonContant.REQUEST_MEMBER_INFO);
		if (mai == null) {
			return ApiResult.fail(ResultStatus.TOKEN_OVERDUE);
		}
		if (StringUtil.hasBlank(new String[]{memberPassword, reMemberPassword, captcha, captchaKey})) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		memberUpdateService.updatePassword(mai.getMaId(), memberPassword, reMemberPassword, captcha, captchaKey);
		return ApiResult.success();
	}
}
