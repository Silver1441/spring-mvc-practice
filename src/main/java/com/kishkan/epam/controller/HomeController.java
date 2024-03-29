package com.kishkan.epam.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String defaultPage() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Authentication authentication, ModelMap model) {
        model.addAttribute("user", authentication.getName());
        return "home";
    }
}
