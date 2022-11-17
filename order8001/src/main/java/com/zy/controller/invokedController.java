package com.zy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @学习小结
 */
@RestController
public class invokedController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/9001")
    public String getOtherPortValue9001(){
        String url = "http://demo-9001/user9001";
        String url2 = "http://demo-9002/user9002";
        return restTemplate.getForObject(url,String.class);
    }

    @GetMapping("/9002")
    public String getOtherPortValue9002(){
        String url = "http://demo-9002/user9002";
        return restTemplate.getForObject(url,String.class);
    }





}
