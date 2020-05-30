package com.example.spboot.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class controller {
    @RequestMapping(value = "/hello")
     @ResponseBody
    public String getCookies(){
        return "jenkins";
    }
}
