package com.kishkan.epam.controller;

import com.kishkan.epam.dto.RegisteredUserDto;
import com.kishkan.epam.repository.AppointmentRepository;
import com.kishkan.epam.service.UserRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @Autowired
    private UserRegistrar userRegistrar;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/registration")
    public String viewRegistration(ModelMap model) {
        model.addAttribute("registrationForm", new RegisteredUserDto());
        model.addAttribute("appointmentList", appointmentRepository.getAppointments());
        return "registration";
    }

    @PostMapping("/registration")
    public String processRegistration(@ModelAttribute("registrationForm") RegisteredUserDto registeredUserDto) {
        userRegistrar.registerUser(registeredUserDto);
        return "redirect:/registrationSuccess";
    }
}
