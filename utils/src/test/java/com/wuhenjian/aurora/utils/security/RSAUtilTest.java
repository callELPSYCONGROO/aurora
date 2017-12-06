package com.wuhenjian.aurora.utils.security;

import org.junit.Test;

import java.security.*;

/**
 * @author SwordNoTrace
 * @date 2017/12/6 23:04
 */
public class RSAUtilTest {

    @Test
    public void getPP() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(1024);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        PrivateKey aPrivate = keyPair.getPrivate();
        PublicKey aPublic = keyPair.getPublic();
        String pri = Base64Util.encode2Str(aPrivate.getEncoded());
        String pub = Base64Util.encode2Str(aPublic.getEncoded());
        System.out.println("private key ---->" + pri);
        System.out.println("public key  ---->" + pub);
    }
}
