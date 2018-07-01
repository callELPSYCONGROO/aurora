package com.wuhenjian.aurora.utils.security;

import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import java.security.*;

/**
 * @author 無痕剑
 * @date 2017/12/6 16:30
 */
public class RSAUtilTest {

	@Test
	public void getPublicAndPrivateKey() throws NoSuchAlgorithmException {
		//为RSA算法创建一个KeyPairGenerator对象
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
		//随机数据源初始化这个KeyPairGenerator对象
		keyPairGenerator.initialize(1024, new SecureRandom());
		//生成密匙对
		KeyPair keyPair = keyPairGenerator.generateKeyPair();
		//得到公匙
		PublicKey publicKey = keyPair.getPublic();
		//得到密匙
		PrivateKey privateKey = keyPair.getPrivate();
		//Base64编码
		String pubKey = Base64.encodeBase64String(publicKey.getEncoded());
		String priKey = Base64.encodeBase64String(privateKey.getEncoded());
		System.out.println(pubKey);
		System.out.println("******************************");
		System.out.println(priKey);
	}

	@Test
	public void endecode() throws Exception {
		String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCcfnTGjadvyyO1FXDzffaI/lqn4yrSpfykKFt3VNcEkHNoAu4YlxxRyRtnOjcQnO1dUTlwBq1oapzowvyfjcuEDCNbFKrGiyw6RrgMy+fL84bK8VISoYzInhqoog51i1Ch6ZwaSDLui3FCzZlIdjvdy026zR6Yv2ZIlRbCJ7+j4wIDAQAB";
		String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJx+dMaNp2/LI7UVcPN99oj+WqfjKtKl/KQoW3dU1wSQc2gC7hiXHFHJG2c6NxCc7V1ROXAGrWhqnOjC/J+Ny4QMI1sUqsaLLDpGuAzL58vzhsrxUhKhjMieGqiiDnWLUKHpnBpIMu6LcULNmUh2O93LTbrNHpi/ZkiVFsInv6PjAgMBAAECgYByV99hGC1n/KhpbnIqJzZUYGzC0LQAV/GhzC8QoPe+SQFZ1RI8+2Rgya1xHlMPm2m/zlJGbUqUyZk+ZQIKXqN9AdSpprgJ2HW2Gd6KJAAsyodaKKe9GjnTpiN1QHF6AfNpnzGOHA0nQIKRenozJWJzaIFAfVT/aHNFSA4kJfU/EQJBANcYSRmzIOyg5AQUubyIObIHk3uCmlwBhQfdnjSwTtMTimt1xX6V0ZzLzz5rLgMXo+iaH8ly/iAowXglKyYKKYkCQQC6QTwZvc3UkGbv6ejVrRNQNBKsYQkt1DJd/FsNi4QlhbB2yuDkAZeVz3d/yPC29EGcaDACGJCqRWou78KpqUMLAkA/68Otk4IxUA7y94XK9WDP+1hk2AcvWHRERiQB3HNQXvo/vRwX5kYIprjL/+YInTnkogjYQQgsXnBAWCtefp6hAkB8Zuf6lYCuEkj+w3AFkBVPQ4iZZDKaTpnZlp1GXcJEwZeMsJMnFz0lDa5WRmMo/9n22sv+CmRNphF3CiMt6OTjAkEArMONE7M63KEe9QZL7GCMazwD4Np9wlagA4EOlAWT3vQ+EdFcm9ZaHd0nv3c8+hMzZVn2Bxi20ccGzpjoDPqWlw==";
		String text = "123";
		String encrypt = RSAUtil.encrypt(text, publicKey);
		System.out.println(encrypt);
		System.out.println(RSAUtil.decrypt(encrypt, privateKey));
	}
}
