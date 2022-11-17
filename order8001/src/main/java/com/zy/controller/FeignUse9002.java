package com.zy.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @学习小结
 */
@FeignClient("demo-9002")
public interface FeignUse9002 {

    @GetMapping("/user9002")
    String get9002();

}