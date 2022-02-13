package com.lp.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * freemarker默认的配置是classpath下的templates
 * @author lp
 * @since 2022/2/13 20:31
 */
@Controller
public class FreemarkerController {

    @GetMapping("/getFm")
    public String getFm(){
        return "fm";
    }
}
