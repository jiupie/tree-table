package com.wl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 南顾北衫
 */
@MapperScan(basePackages = "com.wl.dao")
@SpringBootApplication
public class TreeInfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TreeInfoApplication.class, args);
    }
}
