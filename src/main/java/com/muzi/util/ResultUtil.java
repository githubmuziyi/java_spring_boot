package com.muzi.util;

import com.muzi.domain.Result;

/**
 * Created by muzi on 2017/11/20.
 */
public class ResultUtil {

    /**
     * 成功
     * @param object
     * @return
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    /**
     * 成功
     * @return
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 失败
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
