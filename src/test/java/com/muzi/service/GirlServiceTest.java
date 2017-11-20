package com.muzi.service;

import com.muzi.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by muzi on 2017/11/20.
 * service测试
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findByIdTest() {
        Girl girl = girlService.findById(3);
        Assert.assertEquals(new Integer(16), girl.getAge());
    }
}
