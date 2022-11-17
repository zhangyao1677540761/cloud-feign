package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @学习小结
 */
@SpringBootApplication
@EnableEurekaClient
public class user9002Application {
    public static void main(String[] args) {
        SpringApplication.run(user9002Application.class, args);
    }

}
