package com.zy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @学习小结
 */
@RestController
public class invokedController {
//    @Autowired
//    RestTemplate restTemplate;
//
//    @GetMapping("/9001")
//    public String getOtherPortValue9001() {
//        String url = "http://demo-9001/user9001";
//        String url2 = "http://demo-9002/user9002";
//        return restTemplate.getForObject(url, String.class);
//    }
//
//
//    @GetMapping("/9002")
//    public String getOtherPortValue9002() {
//        String url = "http://demo-9002/user9002";
//        return restTemplate.getForObject(url, String.class);
//    }

    @Autowired
    FeignUse9001 feignUse9001;

    @GetMapping("/9001")
    public String getFeign9001() {
        return feignUse9001.get9001();
    }
//===================================================

    @Autowired
    FeignUse9002 feignUse9002;
    @GetMapping("/9002")
    public String getFeign9002() {
        return feignUse9002.get9002();
    }

//小结1需要调用加依赖,2启动类添加@EnableFeignClients,开启
// 3编写接口,每个接口都是一个服务,@FeignClient("服务名")
// 4调用
}
