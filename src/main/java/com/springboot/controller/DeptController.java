package com.springboot.controller;

import com.springboot.bean.Dept;
import com.springboot.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SpringBoot使用JPA快速访问MySQL数据库
 *
 * @Auther: madali
 * @Date: 2018/8/31 10:21
 */
@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    private IDeptService iDeptService;

    // 推荐使用findById方法
    @RequestMapping(value = "/findById/{id}")
    public Dept findById(@PathVariable(value = "id") Integer id) {
        Dept dept = iDeptService.findById(id);
        System.out.println("dept:" + dept);
        return dept;
    }

    @RequestMapping(value = "/getOne/{id}")
    public Dept getOne(@PathVariable(value = "id") Integer id) {
        Dept dept = iDeptService.getOne(id);
        System.out.println("dept:" + dept);

        /**
         * getOne方法返回值比findById方法返回值多了和handler和hibernateLazyInitializer。
         * 如果在Dept类上加了@JsonIgnoreProperties注解，可使返回结果中无这两个参数。
         */

//        {
//            id: 1,
//            name: "部门2",
//            description: "部门1--------",
//            handler: { },
//            hibernateLazyInitializer: { }
//        }

        return dept;
    }

    @RequestMapping(value = "/findAll")
    public List<Dept> findAll() {
        return iDeptService.findAll();
    }

    @RequestMapping(value = "/count")
    public long count() {
        return iDeptService.count();
    }

    //在入参设置@RequestBody注解表示接收整个报文体，这里主要用在接收整个POST请求中的json报文体。
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(@RequestBody Dept dept) {
        iDeptService.save(dept);
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST)
    public void saveAll(@RequestBody Iterable<Dept> iterable) {
        iDeptService.saveAll(iterable);
    }

    @RequestMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id) {
        iDeptService.deleteById(id);
        System.out.println("删除id为" + id + "的dept记录成功.");
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Dept dept) {
        iDeptService.delete(dept);
        System.out.println("dept" + dept + "删除成功.");
    }

}
