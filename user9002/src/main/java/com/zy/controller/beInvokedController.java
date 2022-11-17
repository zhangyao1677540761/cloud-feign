package com.zy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @学习小结
 */
@RestController
public class beInvokedController {
    @RequestMapping(value = "/user9002",method = RequestMethod.GET)
    public String method(){
        return "我的user9002的方法返回值";
    }


}
