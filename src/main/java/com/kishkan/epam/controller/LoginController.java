package com.kishkan.epam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String login(ModelMap model, @RequestParam(required = false) String error) {
        if (error != null) {
            model.addAttribute("error_login_placeholder", "invalid login or password!");
        }
        return "login";
    }
}
