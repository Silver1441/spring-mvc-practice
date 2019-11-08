package com.kishkan.epam.controller;

import com.kishkan.epam.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value = "/registrationSuccess")
public class RegistrationSuccessController {

    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistrationSuccess(Map<String, Object> model) {
        model.put("employeeForm", new Employee());
        return "registrationSuccess";
    }
}
