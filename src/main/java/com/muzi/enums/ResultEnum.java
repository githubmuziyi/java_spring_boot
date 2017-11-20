package com.muzi.enums;

/**
 * Created by muzi on 2017/11/20.
 */
public enum  ResultEnum {

    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMAR_SCHOOL(100, "小学"),
    MIDDLE_SCHOOL(101, "中学")
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
