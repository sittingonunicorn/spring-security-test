package com.gmail.sittingonunicorn.springsecuritytest.controller;

import com.gmail.sittingonunicorn.springsecuritytest.dto.UsersDTO;
import com.gmail.sittingonunicorn.springsecuritytest.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class PageController {
    private final UserService userService;

    public PageController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/hello")
    public String helloWorldPage(){
        return "hello-world.html";
    }

    @RequestMapping("/all_users")
    public @ResponseBody UsersDTO allUsersPage(){
        return userService.getAllUsers();
    }
}
