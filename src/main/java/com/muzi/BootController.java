package com.muzi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BootController {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 列表
     * @return [数据列表]
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * 添加数据
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girl")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    /**
     * 按照id查询
     */
    @GetMapping(value = "/girl/{id}")
    public Girl girlFetch(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * 按年龄查询
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlsListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }


    /**
     * 更新
     */
    @PutMapping(value = "/girl/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /**
     * 删除
     */
    @DeleteMapping(value = "/girl/{id}")
    public void girlDelete(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }
}
