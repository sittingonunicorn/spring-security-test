package com.gmail.sittingonunicorn.springsecuritytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class PageController {
    @RequestMapping("/hello")
    public String helloWorldPage(){
        return "hello-world.html";
    }
}
