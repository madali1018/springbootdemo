package com.springboot.repository;

import com.springboot.bean.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository<T, ID> 中 T表示表对应的实体类，ID表示表的主键在实体类中的类型
 *
 * @Auther: madali
 * @Date: 2018/8/31 14:25
 */
public interface DeptRepository extends JpaRepository<Dept, Integer> {


}
