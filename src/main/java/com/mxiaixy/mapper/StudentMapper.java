package com.mxiaixy.mapper;

import com.mxiaixy.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 测试注解配置接口
 * Created by Mxia on 2017/1/5.
 */
public interface StudentMapper {

    @Select("select * from t_student")
    List<Student> findAll();

    @Insert("insert into t_student(name ,address) values(#{name},#{address})")
    void insert(Student student);

    @Update("update t_student set name=#{name} ,address=#{address} where id=#{id}")
    void update(Student student);

    @Select("select * from t_student where id=#{id}")
    Student findById(Integer id);


    /**
     * 多对一查询
     */




}
