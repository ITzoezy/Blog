package com.zy.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.zy.blog.dao.mapper")
@SpringBootApplication
public class blogApp {

    public static void main(String[] args) {
        SpringApplication.run(blogApp.class,args);
    }
}
