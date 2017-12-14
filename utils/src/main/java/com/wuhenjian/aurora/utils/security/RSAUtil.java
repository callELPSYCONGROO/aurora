package com.wuhenjian.aurora.utils.security;

import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.exception.BusinessException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:50
 */
public class RSAUtil {

    private final static String RSA = "RSA";

    /**
     * 使用公匙加密
     *
     * @param text      明文
     * @param publicKey 公匙
     * @return 密文
     */
    public static String encrypt(String text, String publicKey) throws BusinessException {
        //公匙解码
        byte[] bytes = Base64Util.decode2Bytes(publicKey);
        byte[] doFinal;
        try {
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(bytes);
            KeyFactory keyFactory = KeyFactory.getInstance(RSA);
            //将公匙转为PublicKey实例
            PublicKey generatePublic = keyFactory.generatePublic(keySpec);
            Cipher cipher = Cipher.getInstance(RSA);
            cipher.init(Cipher.ENCRYPT_MODE, generatePublic);
            //使用公匙加密
            doFinal = cipher.doFinal(text.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResultStatus.RSA_ERROR);
        }
        return Base64Util.encode2Str(doFinal);
    }

    /**
     * 使用私匙解密
     *
     * @param ciphertext 密文
     * @param privateKey 私匙
     * @return 明文
     */
    public static String decrypt(String ciphertext, String privateKey) throws BusinessException {
        //私匙解码
        byte[] bytes = Base64Util.decode2Bytes(privateKey);
        byte[] doFinal;
        try {
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(bytes);
            KeyFactory keyFactory = KeyFactory.getInstance(RSA);
            //将私匙转换成PrivateKey实例
            PrivateKey generatePrivate = keyFactory.generatePrivate(keySpec);
            Cipher cipher = Cipher.getInstance(RSA);
            cipher.init(Cipher.DECRYPT_MODE, generatePrivate);
            //密文解码
            byte[] text = Base64Util.decode2Bytes(ciphertext);
            //使用私匙解密
            doFinal = cipher.doFinal(text);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResultStatus.RSA_ERROR);
        }
        return new String(doFinal);
    }
}
