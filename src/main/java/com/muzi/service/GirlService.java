package com.muzi.service;

import com.muzi.domain.Girl;
import com.muzi.enums.ResultEnum;
import com.muzi.exception.GirlException;
import com.muzi.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by muzi on 2017/11/16.
 */

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 事务
     */
    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        Girl girlB = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("B");
        girlB.setAge(25);
        girlB.setCupSize("G");
        girlRepository.save(girlB);
        girlRepository.save(girlA);
    }

    /**
     * 获取年级
     * @param id
     */
    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(ResultEnum.PRIMAR_SCHOOL);
        }
        if (age > 10 && age < 16) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Girl findById(Integer id) {
        return girlRepository.findOne(id);
    }
}
