package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.exception.BusinessException;
import com.wuhenjian.aurora.utils.security.Base64Util;
import com.wuhenjian.aurora.utils.security.RSAUtil;
import com.wuhenjian.aurora.utils.security.SHA256;

import java.util.Map;

/**
 * @author SwordNoTrace
 * @date 2017/12/24 22:22
 */
public class AuthUtil {

    private AuthUtil() {}

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

    /**
     * 验证签名
     * @param params 参数集合
     * @param sign 签名
     * @return 结果
     */
    public static boolean verifySign(Map<String,String> params, String sign) throws BusinessException {
        return SHA256.encode(params).equals(sign);
    }

    /**
     * 密码加盐
     * @param pawword 密码明文
     * @param salt 盐值
     * @return 加盐密码
     */
    public static String passwordEncrypt(String pawword, String salt) throws BusinessException {
        String encode = SHA256.encode(pawword);
        String string = encode + salt;
        return SHA256.encode(string);
    }

    /**
     * 验证密码
     * @param pawword 明文密码
     * @param salt 盐值
     * @param ciphertext 密文密码
     * @return 结果
     */
    public static boolean verifyPassword(String pawword, String salt, String ciphertext) throws BusinessException {
        String passwordEncrypt = passwordEncrypt(pawword, salt);
        return ciphertext.equals(passwordEncrypt);
    }

    /**
     * 将base64、rsa加密的密文转换为明文
     * @param ciphertext 密文
     * @return 明文
     */
    public static String convert2Plaintext(String ciphertext) throws BusinessException {
        String decode2Str = Base64Util.decode2Str(ciphertext);
        return RSAUtil.decrypt(decode2Str);
    }
}
