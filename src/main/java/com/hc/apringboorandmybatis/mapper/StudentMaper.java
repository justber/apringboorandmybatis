package com.hc.apringboorandmybatis.mapper;

import com.hc.apringboorandmybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hc
 * @date 2022/5/26 19:46
 */
@Mapper
@Repository
public interface StudentMaper {
    List<Student> selectStudent();

    int addStudent(Student student);
}
