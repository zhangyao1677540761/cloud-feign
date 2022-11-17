package com.zy.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @学习小结
 */
@FeignClient("demo-9001")
public interface FeignUse9001 {

    @GetMapping("/user9001")
    String get9001();

}
