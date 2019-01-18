package com.cq.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenqiang
 * @Date: 2019/1/18 15:48
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Value("${foo}")
    private String foo;

    @RequestMapping("/hello")
    public String hello(){
        return "foo="+foo;
    }
}
