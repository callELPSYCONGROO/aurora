package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;

/**
 * 处理结果集
 * @author Administrator
 * @date 2017/12/23/023 11:36
 */
public class ApiResultUtil {

    private ApiResultUtil() {}

    /**
     * 判断结果集，获取结果集对象
     * @param apiResult 结果集
     * @return 结果集对象
     * @throws BusinessException 发生异常
     */
    public static Object getObject(ApiResult apiResult) throws BusinessException {
        isSuccess(apiResult);
        return apiResult.getData();
    }

    /**
     * 判断结果集是否成功
     * @param apiResult 结果集
     * @throws BusinessException 发生异常
     */
    public static void isSuccess(ApiResult apiResult) throws BusinessException {
        if (apiResult.getCode() != ResultStatus.SUCCESS.getCode()) {
            throw new BusinessException(apiResult);
        }
    }
}
