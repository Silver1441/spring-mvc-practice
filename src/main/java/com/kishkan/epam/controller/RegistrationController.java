package com.kishkan.epam.controller;

import com.kishkan.epam.dto.RegisteredUserDto;
import com.kishkan.epam.repository.AppointmentRepository;
import com.kishkan.epam.repository.EmployeeRepository;
import com.kishkan.epam.service.UserRegistrar;
import com.kishkan.epam.validator.LoginAvailabilityInputRestValidator;
import com.kishkan.epam.validator.PasswordInputRestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private UserRegistrar userRegistrar;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    @Qualifier("registeredUserValidator")
    private Validator registeredUserValidator;

    @Autowired
    PasswordInputRestValidator passwordInputRestValidator;

    @Autowired
    LoginAvailabilityInputRestValidator loginAvailabilityInputRestValidator;

    @GetMapping
    public String viewRegistration(ModelMap model) {
        model.addAttribute("registrationForm", new RegisteredUserDto());
        model.addAttribute("appointmentList", appointmentRepository.getAppointments());
        return "registration";
    }

    @PostMapping
    public String processRegistration(@Valid @ModelAttribute("registrationForm") RegisteredUserDto registeredUserDto,
                                      BindingResult bindingResult, ModelMap model) {

        model.addAttribute("appointmentList", appointmentRepository.getAppointments());
        registeredUserValidator.validate(registeredUserDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userRegistrar.registerUser(registeredUserDto);
        return "redirect:/registrationSuccess";
    }

    @GetMapping(value = "/checkLogin", produces = "application/json")
    @ResponseBody
    public ModelMap checkLogin(@RequestParam String text) {
        ModelMap model = new ModelMap();
        model.addAttribute("input", loginAvailabilityInputRestValidator.isLoginTaken(text));
        return model;
    }

    @GetMapping(value = "/checkPassword", produces = "application/json")
    @ResponseBody
    public ModelMap checkPassword(@RequestParam String text) {
        ModelMap model = new ModelMap();
        model.addAttribute("input", passwordInputRestValidator.validatePassword(text));
        return model;
    }


}
