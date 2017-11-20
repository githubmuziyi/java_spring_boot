package com.muzi.exception;

import com.muzi.enums.ResultEnum;

/**
 * Created by muzi on 2017/11/20.
 * 自定义异常
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
