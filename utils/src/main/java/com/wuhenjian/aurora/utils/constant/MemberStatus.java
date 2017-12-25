package com.wuhenjian.aurora.utils.constant;

/**
 * @author Administrator
 * @date 2017/12/23/023 11:21
 */
public enum  MemberStatus {

    NORMAL(0, "正常"),
    ERROR_PASSWORD_LOCKED(1, "密码错误过多锁定"),
    ADMIN_LOCKED(2, "管理员锁定");

    private Integer code;

    private String msg;

    MemberStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
