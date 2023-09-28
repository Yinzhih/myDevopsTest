package com.yinzh.mytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author:
 * @date: 2023/9/28 15:05
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String Test(){
        return  "hello Jenkins";
    }
}
