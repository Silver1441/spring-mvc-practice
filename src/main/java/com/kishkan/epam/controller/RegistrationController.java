package com.kishkan.epam.controller;

import com.kishkan.epam.dto.RegisteredUser;
import com.kishkan.epam.entity.Employee;
import com.kishkan.epam.repository.AppointmentRepository;
import com.kishkan.epam.service.UserRegistrar;
import com.kishkan.epam.service.impl.UserRegistrarImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private UserRegistrar userRegistrar;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/registration")
    public String viewRegistration(ModelMap model) {
        model.addAttribute("registrationForm", new RegisteredUser());
        model.addAttribute("appointmentList", appointmentRepository.getAppointments());
        return "registration";
    }

    @PostMapping("/registration")
    public String processRegistration(@ModelAttribute("registrationForm") RegisteredUser registeredUser) {
        userRegistrar.registerUser(registeredUser);
        return "redirect:/registrationSuccess";
    }
}
