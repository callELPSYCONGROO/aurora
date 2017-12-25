package com.wuhenjian.aurora.utils.security;

import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.exception.BusinessException;

import javax.crypto.Cipher;
import java.security.*;
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

    public static String encrypt(String text) throws BusinessException {
        String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCcfnTGjadvyyO1FXDzffaI/lqn4yrSpfykKFt3VNcEkHNoAu4YlxxRyRtnOjcQnO1dUTlwBq1oapzowvyfjcuEDCNbFKrGiyw6RrgMy+fL84bK8VISoYzInhqoog51i1Ch6ZwaSDLui3FCzZlIdjvdy026zR6Yv2ZIlRbCJ7+j4wIDAQAB";
        return encrypt(text, publicKey);
    }

    /**
     * 使用私匙解密
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

    public static String decrypt(String ciphertext) throws BusinessException {
        String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJx+dMaNp2/LI7UVcPN99oj+WqfjKtKl/KQoW3dU1wSQc2gC7hiXHFHJG2c6NxCc7V1ROXAGrWhqnOjC/J+Ny4QMI1sUqsaLLDpGuAzL58vzhsrxUhKhjMieGqiiDnWLUKHpnBpIMu6LcULNmUh2O93LTbrNHpi/ZkiVFsInv6PjAgMBAAECgYByV99hGC1n/KhpbnIqJzZUYGzC0LQAV/GhzC8QoPe+SQFZ1RI8+2Rgya1xHlMPm2m/zlJGbUqUyZk+ZQIKXqN9AdSpprgJ2HW2Gd6KJAAsyodaKKe9GjnTpiN1QHF6AfNpnzGOHA0nQIKRenozJWJzaIFAfVT/aHNFSA4kJfU/EQJBANcYSRmzIOyg5AQUubyIObIHk3uCmlwBhQfdnjSwTtMTimt1xX6V0ZzLzz5rLgMXo+iaH8ly/iAowXglKyYKKYkCQQC6QTwZvc3UkGbv6ejVrRNQNBKsYQkt1DJd/FsNi4QlhbB2yuDkAZeVz3d/yPC29EGcaDACGJCqRWou78KpqUMLAkA/68Otk4IxUA7y94XK9WDP+1hk2AcvWHRERiQB3HNQXvo/vRwX5kYIprjL/+YInTnkogjYQQgsXnBAWCtefp6hAkB8Zuf6lYCuEkj+w3AFkBVPQ4iZZDKaTpnZlp1GXcJEwZeMsJMnFz0lDa5WRmMo/9n22sv+CmRNphF3CiMt6OTjAkEArMONE7M63KEe9QZL7GCMazwD4Np9wlagA4EOlAWT3vQ+EdFcm9ZaHd0nv3c8+hMzZVn2Bxi20ccGzpjoDPqWlw==";
        return decrypt(ciphertext, privateKey);
    }
}
