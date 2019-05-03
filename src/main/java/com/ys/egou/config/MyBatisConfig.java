package com.ys.egou.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ys.egou.mapper")
public class MyBatisConfig {
}
