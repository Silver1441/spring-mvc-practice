package com.kishkan.epam.controller;

import com.kishkan.epam.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        model.put("employeeForm", new Employee());
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("employeeForm") Employee employee,
                                      Map<String, Object> model) {

        return "redirect:/registrationSuccess";
    }
}
