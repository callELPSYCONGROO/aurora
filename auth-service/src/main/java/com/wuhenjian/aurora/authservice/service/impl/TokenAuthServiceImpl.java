package com.wuhenjian.aurora.authservice.service.impl;

import com.wuhenjian.aurora.authservice.service.TokenAuthService;
import com.wuhenjian.aurora.utils.UUIDUtil;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.entity.TokenModel;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import com.wuhenjian.aurora.utils.security.Base64Util;
import com.wuhenjian.aurora.utils.security.RSAUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:23
 */
@Service("tokenAuthService")
public class TokenAuthServiceImpl implements TokenAuthService {
    /** 公匙 */
    @Value("${rsa.key.private}")
    private String privateKey;
    /** 私匙 */
    @Value("${rsa.key.public}")
    private String publicKey;

    /**
     * 创建Token
     * @param accountCode 用户账号
     * @return Token信息
     */
    @Override
    public TokenInfo createToken(Long accountCode) throws BusinessException {
        String uuid = UUIDUtil.getUuid();//获取uuid
        TokenModel tokenModel = new TokenModel();
        tokenModel.setAccountCode(accountCode);
        tokenModel.setUuid(uuid);
        String accAndUuid = tokenModel.toStringByAccAndUuid();//拼接uuid和accountCode
        String base64 = Base64Util.encode2Str(accAndUuid);//转码
        String rsaToken = RSAUtil.encrypt(base64, this.publicKey);//RSA加密得到Token
        String token = rsaToken.replaceAll("=", "");
        return null;
    }
}
