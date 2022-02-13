package com.lp.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 经测试class和resource否可以热部署，但是注解不能
 * @author lp
 * @since 2022/2/13 15:28
 */
@Controller
public class IndexController {

    @GetMapping("index2")
    public String index(){
        return "index.html";
    }

    @GetMapping("hello1")
    public @ResponseBody String hello(){
        return "lp1";
    }
}
