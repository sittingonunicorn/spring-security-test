package com.gmail.sittingonunicorn.springsecuritytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class SpringSecurityTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityTestApplication.class, args);
    }

}
