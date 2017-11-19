package com.muzi.repository;

import com.muzi.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    /**
     * 按年龄查询
     */
    public List<Girl> findByAge(Integer age);
}
