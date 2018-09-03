package com.springboot.service;

import com.springboot.bean.Dept;

import java.util.List;

/**
 * @Auther: madali
 * @Date: 2018/8/31 10:20
 */
public interface IDeptService {

    Dept findById(Integer id);

    Dept getOne(Integer id);

    List<Dept> findAll();

    long count();

    void save(Dept dept);

    void saveAll(Iterable<Dept> iterable);

    void deleteById(Integer id);

    void delete(Dept dept);

}
