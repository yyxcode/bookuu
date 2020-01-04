package com.bookuu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * springboot启动类
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.bookuu.*"})
public class start {
    public static void main(String[] args) {
        SpringApplication.run(start.class,args);
    }
}
