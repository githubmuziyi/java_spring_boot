package com.muzi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by muzi on 2017/11/15.
 */

@RestController
@RequestMapping(value = "/boot")
public class HelloRestController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/{id}/hello-rest", "/rest-hello"}, method = RequestMethod.GET)

    //获取url链接参数
    //@PathVariable("id") Integer id
    //@RequestParam(value = "id", required = false, defaultValue = "0") Integer id
    public String say(@PathVariable("id") Integer id) {
        return girlProperties.getCupSize() + id;
    }
}
