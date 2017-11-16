package com.muzi;

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
}
