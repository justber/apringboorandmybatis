package com.hc.apringboorandmybatis;

import com.hc.apringboorandmybatis.entity.Student;
import com.hc.apringboorandmybatis.mapper.StudentMaper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApringboorandmybatisApplicationTests {

    @Autowired
    StudentMaper studentMaper;
    @Test
    void contextLoads() {

        List<Student> students = studentMaper.selectStudent();
        for (Student student : students) {
            System.out.println(student);
        }

        int i = studentMaper.addStudent(new Student(3, "王五"));
        System.out.println(i);
    }

}
