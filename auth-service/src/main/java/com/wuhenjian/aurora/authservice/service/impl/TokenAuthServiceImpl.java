package com.wuhenjian.aurora.authservice.service.impl;

import com.wuhenjian.aurora.authservice.service.TokenAuthService;
import com.wuhenjian.aurora.utils.UUIDUtil;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.entity.TokenModel;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import com.wuhenjian.aurora.utils.security.Base64Util;
import com.wuhenjian.aurora.utils.security.RSAUtil;
import org.springframework.stereotype.Service;

/**
 * @author 無痕剑
 * @date 2017/12/6 15:23
 */
@Service("tokenAuthService")
public class TokenAuthServiceImpl implements TokenAuthService {

    /**
     * 创建Token
     *
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
//        String encode = SHA256.encode(accAndUuid);//获取uuid和accountCode的签名
//        tokenModel.setSign(encode);
//        String model = tokenModel.toString();//拼接sign、uuid和accountCode
        String base64 = Base64Util.encode2Str(accAndUuid);//转码
        //TODO 获取公匙
        String token = RSAUtil.encrypt(base64, "");//RSA加密得到Token
        return null;
    }
}
