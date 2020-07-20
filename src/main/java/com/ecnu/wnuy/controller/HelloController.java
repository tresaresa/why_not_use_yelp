package com.ecnu.wnuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 14:09
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
