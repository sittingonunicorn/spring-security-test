package com.gmail.sittingonunicorn.springsecuritytest.controller;

import com.gmail.sittingonunicorn.springsecuritytest.config.LocaleConfig;
import com.gmail.sittingonunicorn.springsecuritytest.entity.User;
import com.gmail.sittingonunicorn.springsecuritytest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    private final UserService userService;
    private LocaleConfig localeConfig;

    @Autowired
    public PageController(UserService userService, LocaleConfig localeConfig) {
        this.userService = userService;
        this.localeConfig = localeConfig;
    }

    @GetMapping("/index")
    public /*@ResponseBody
    UsersDTO*/ String indexPage() {
        //return userService.getAllUsers();
//        model.addAttribute(userService.getAllUsers());
        return "index.html";
    }

    @RequestMapping("/main")
    public String mainPage(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();
        model.addAttribute("username", user.getUsername());
       // model.addAttribute("roles", user.getAuthorities().stream().map(Role::getAuthority).collect(joining(",")));
        return "main.html";
    }

    @RequestMapping("/login")
    public String getLogin(@RequestParam(value = "error", required = false) String error,
                           @RequestParam(value = "logout", required = false) String logout,
                           Model model) {
        model.addAttribute("error", error != null);
        model.addAttribute("logout", logout != null);
        return "login.html";
    }


}

