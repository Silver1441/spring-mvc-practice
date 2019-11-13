package com.kishkan.epam.validator;

import com.kishkan.epam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginAvailabilityInputRestValidator {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String isLoginTaken(String login) {
        if (employeeRepository.getEmployeeByLogin(login) != null) {
            return "taken";
        } else if (login.equals("")) {
            return "empty";
        } else {
            return "free";
        }
    }
}
