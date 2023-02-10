package com.epam.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 联系项目启动类
 *
 * @author KC Yao
 * @date 2023-02-10
 */
@SpringBootApplication
@EnableScheduling
public class Exercise2023Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercise2023Application.class, args);
    }
}
