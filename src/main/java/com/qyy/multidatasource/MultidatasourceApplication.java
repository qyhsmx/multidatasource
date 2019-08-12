package com.qyy.multidatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qyy.multidatasource.dao")
public class MultidatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultidatasourceApplication.class, args);
    }

}
