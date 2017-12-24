package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.exception.BusinessException;
import com.wuhenjian.aurora.utils.security.Base64Util;
import com.wuhenjian.aurora.utils.security.RSAUtil;

/**
 * @author SwordNoTrace
 * @date 2017/12/24 22:22
 */
public class AuthUtil {

    /**
     * 创建加密Token
     * @return 加密token
     * @throws BusinessException 发生异常
     */
    public static String createToken() throws BusinessException {
        String uuid = UUIDUtil.getUuid();//获取uuid
        return RSAUtil.encrypt(uuid);//RSA加密得到Token
    }

    /**
     * 解密Token
     * @param token 加密Token
     * @return 解密Token
     * @throws BusinessException 发生异常
     */
    public static String decodeToken(String token) throws BusinessException {
        String decode2Str = Base64Util.decode2Str(token);
        return RSAUtil.decrypt(decode2Str);
    }
}
