package com.muzi.controller;

import com.muzi.enums.ResultEnum;
import com.muzi.exception.GirlException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by muzi on 2017/11/15.
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "index";
    }

    @RequestMapping(value = "/hello_exception", method = RequestMethod.GET)
    public String helloException() throws GirlException {
        throw new GirlException(ResultEnum.UNKONW_ERROR);
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
