package com.springboot.service;

import com.springboot.bean.Dept;
import com.springboot.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: madali
 * @Date: 2018/8/31 14:32
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptRepository deptRepository;

    @Override
    public Dept findById(Integer id) {
        return deptRepository.findById(id).get();
    }

    @Override
    public Dept getOne(Integer id) {
        return deptRepository.getOne(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptRepository.findAll();
    }

    @Override
    public long count() {
        return deptRepository.count();
    }

    @Override
    public void save(Dept dept) {
        deptRepository.save(dept);
    }

    @Override
    public void saveAll(Iterable<Dept> iterable) {
        deptRepository.saveAll(iterable);
    }

    @Override
    public void deleteById(Integer id) {
        deptRepository.deleteById(id);
    }

    @Override
    public void delete(Dept dept) {
        deptRepository.delete(dept);
    }

}
