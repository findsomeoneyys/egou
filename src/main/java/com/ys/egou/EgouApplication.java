package com.ys.egou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ys.egou.mapper")
public class EgouApplication {

    public static void main(String[] args) {
        SpringApplication.run(EgouApplication.class, args);
    }

}
