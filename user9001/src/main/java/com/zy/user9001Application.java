package com.zy;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @学习小结
 */
@SpringBootApplication
@EnableEurekaClient
public class user9001Application {
    public static void main(String[] args) {
        SpringApplication.run(user9001Application.class, args);
    }

}
