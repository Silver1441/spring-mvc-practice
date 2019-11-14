package com.kishkan.epam.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/registrationSuccess")
public class RegistrationSuccessController {

    @GetMapping
    public String viewRegistrationSuccess(Authentication authentication, ModelMap model) {
        model.addAttribute("user", authentication.getName());
        return "registrationSuccess";
    }

    @GetMapping("/proceed")
    public String viewToLogin() {
        return "redirect:/login";
    }
}
