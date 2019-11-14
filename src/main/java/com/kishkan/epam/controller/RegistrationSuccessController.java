package com.kishkan.epam.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/registrationSuccess")
public class RegistrationSuccessController {

    @GetMapping
    public String viewRegistrationSuccess() {
        return "registrationSuccess";
    }

    @GetMapping("/proceed")
    public String viewToLogin(Authentication authentication) {
        if (authentication != null) {
            return "redirect:/home";
        } else {
            return "redirect:/login";
        }
    }
}
