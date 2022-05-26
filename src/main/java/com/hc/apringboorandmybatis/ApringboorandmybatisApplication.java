package com.hc.apringboorandmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.hc.apringboorandmybatis"})
@SpringBootApplication
public class ApringboorandmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApringboorandmybatisApplication.class, args);
    }

}
