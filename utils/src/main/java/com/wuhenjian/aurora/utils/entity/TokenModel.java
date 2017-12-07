package com.wuhenjian.aurora.utils.entity;

/**
 * Token原型
 * @author 無痕剑
 * @date 2017/12/6 14:58
 */
public class TokenModel {

    private Long accountCode;

    private String uuid;

    private String sign;

    public Long getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(Long accountCode) {
        this.accountCode = accountCode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 账号和uuid按照URL键值对格式组成字符串
     * @return 字符串
     */
    public String toStringByAccAndUuid() {
        return "accountCode=" + this.accountCode + "&uuid=" + this.uuid;
    }

    @Override
    public String toString() {
        return "accountCode=" + this.accountCode + "&sign=" + this.sign + "&uuid=" + this.uuid;
    }
}
