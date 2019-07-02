package com.example.createxcel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.example.createxcel.mapper")
@EnableScheduling
public class CreatexcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreatexcelApplication.class, args);
    }

}
