package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;

/**
 * 处理结果集
 * @author Administrator
 * @date 2017/12/23/023 11:36
 */
public class ApiResultUtil {

    /**
     * 判断结果集，获取结果集对象
     * @param apiResult 结果集
     * @return 结果集对象
     * @throws BusinessException 发生异常
     */
    public static Object getObject(ApiResult apiResult) throws BusinessException {
        if (apiResult.getCode() != 1000) {
            throw new BusinessException(apiResult);
        }
        return apiResult.getData();
    }
}
