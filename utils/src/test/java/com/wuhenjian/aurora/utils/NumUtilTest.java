package com.wuhenjian.aurora.utils;

import com.wuhenjian.aurora.utils.entity.bo.TokenModel;
import com.wuhenjian.aurora.utils.security.Base64Util;
import com.wuhenjian.aurora.utils.security.RSAUtil;
import org.junit.Test;

import java.math.BigInteger;
import java.util.UUID;

/**
 * @author SwordNoTrace
 * @date 2017/12/6 21:22
 */
public class NumUtilTest {

    @Test
    public void uuidTest() {
        for (int i = 0; i < 30; i++) {
            System.out.println(i + " ------------>   " + UUIDUtil.getUuid(RadixUtil.MAX_RADIX));
        }
    }

    @Test
    public void charTest() {
        System.out.println('a' - 86);
    }

    @Test
    public void string2Int() {
        String uuid = UUIDUtil.getUuid(RadixUtil.MAX_RADIX);
        System.out.println(uuid);
        System.out.println(uuid.length());
        System.out.println(RadixUtil.toNumber(uuid, 10));
    }

    @Test
    public void bigIntegerTest() {
        BigInteger b = BigInteger.TEN;
        b = b.add(BigInteger.ONE);
        System.out.println(b.toString());
    }

    @Test
    public void int2String(){
        BigInteger b = new BigInteger(UUID.randomUUID().toString().replaceAll("-", ""), 16);
        String x = RadixUtil.toString(b, RadixUtil.MAX_RADIX);
        System.out.println(x);
        System.out.println(x.length());
    }

    @Test
    public void signLengthTest() throws Exception {
        String uuid = UUIDUtil.getUuid(RadixUtil.MAX_RADIX);
        TokenModel tokenModel = new TokenModel();
        tokenModel.setAccountCode(1145485414L);
        tokenModel.setUuid(uuid);
        String accAndUuid = tokenModel.toStringByAccAndUuid();
//        String sign = SHA256.encode(accAndUuid);
//        tokenModel.setSign(sign);
//        String model = tokenModel.toString();
        String base64 = Base64Util.encode2Str(accAndUuid);
        String pri = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIi/XLnyRT1sySW59+lFf/jyDKvdQ0KkKtdC5kpPbOevFj/x6seU0XZLBgU3vwYQNj7Hc8uIehrtwDWW70tFyQFe94CQUdO3Je9sX0j9pr+a6/0vKkHRoh4EIcmZU0nkDKN3TZry6EbZu/Fc8jsB1JrevlAckQWR+ulhAkko2YJvAgMBAAECgYB1XyK8q1iIx2XCzuMdwrx7tW3w2eJQQc5Poyk8oP2NwncrfX4RvgcnLG/HbLi2AJY+vj0Cdmqv0F9I3/sWNZi3G13qyEWCsBvkRGTvkzQ5VjQxhHQRnRMFv8BFtQDFitU4n3/U4xv/YEY9TEGnKGUxVNDV+Vy6XpWFanbFhu6FeQJBAPLQty+V70p5z39Gpw5W1iS55IiOz5oEA46K0Kijtm6o4QBVESY+0PrXl9yvk0dTkXc2yHJA923Lk4VBpOvPYBUCQQCQLDzzTsI+UnC99v78CtRUTmoAiGwsPwh72hNFbIFHa7n1ytbxud+woxb8RrL80MWjuHfXJ8Z5kA71PfHy2TVzAkEA8Ypv/7Utsa9Umu6Edf4pzaTh0noFx9bgVuZ9xJP+gTwbfsIgaiQorK7UUWKSpmxaEvX7FbTMrXrKR8/SKAVFNQJAVkbS9ruUDF2jcFsGPmhwpj8CumzpZxUVi6B2Vd5YAxiZgViwhpm4HmmK0M+yPw7kp1Q2C0CXSpoGCYbXan/HtwJAe5XyZLLfgClxr9EWzyLDK8g/sd2tnV/nbrL2iRaIMj8gn61K5nVA+aAs1wBWI2zszVwFREitVZZtBy0Lqv4HxA==";
        String pub = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCIv1y58kU9bMkluffpRX/48gyr3UNCpCrXQuZKT2znrxY/8erHlNF2SwYFN78GEDY+x3PLiHoa7cA1lu9LRckBXveAkFHTtyXvbF9I/aa/muv9LypB0aIeBCHJmVNJ5Ayjd02a8uhG2bvxXPI7AdSa3r5QHJEFkfrpYQJJKNmCbwIDAQAB";
        String encrypt = RSAUtil.encrypt(base64, pub);
        String decrypt = RSAUtil.decrypt(encrypt, pri);
        String text = Base64Util.decode2Str(decrypt);
        System.out.println(encrypt);
        System.out.println(encrypt.length());
        System.out.println(decrypt);
        System.out.println(decrypt.length());
        System.out.println(text);
    }

}
