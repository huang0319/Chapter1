package com.didiapace.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Byron.Y.Y
 * @date 2016年10月12日
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, SpringBoot123!";
        
        
    }
}