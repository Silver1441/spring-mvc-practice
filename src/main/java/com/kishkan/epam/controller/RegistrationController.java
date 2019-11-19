package com.kishkan.epam.controller;

import com.kishkan.epam.dto.RegisteredUserDto;
import com.kishkan.epam.repository.AppointmentRepository;
import com.kishkan.epam.service.UserRegistrar;
import com.kishkan.epam.validator.LoginAvailabilityInputRestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    private LoginAvailabilityInputRestValidator loginAvailabilityInputRestValidator;

    @GetMapping
    public String viewRegistration(ModelMap model) {
        if(!model.containsAttribute("registrationForm")){
            model.addAttribute("registrationForm", new RegisteredUserDto());
        }

        model.addAttribute("appointmentList", appointmentRepository.getAppointments());

        return "registration";
    }

    @PostMapping("/proceed")
    public String processRegistration(@Valid @ModelAttribute("registrationForm") RegisteredUserDto registeredUserDto,
                                      BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        registeredUserValidator.validate(registeredUserDto, bindingResult);
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute
                    ("org.springframework.validation.BindingResult.registrationForm", bindingResult);
            redirectAttributes.addFlashAttribute
                    ("registrationForm", registeredUserDto);
            return "redirect:/registration";
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

}
