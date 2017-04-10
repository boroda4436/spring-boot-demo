package com.example.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bohdan on 30.03.2017
 */
@Controller
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }
}
