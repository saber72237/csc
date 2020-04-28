package com.yygq.csc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yygq.csc.mapper")
@SpringBootApplication
public class CscApplication {

    public static void main(String[] args) {
        SpringApplication.run(CscApplication.class, args);
    }

}
