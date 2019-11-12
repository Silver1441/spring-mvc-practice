package com.kishkan.epam.service.impl;

import com.kishkan.epam.dto.AuthorizedUser;
import com.kishkan.epam.entity.Employee;
import com.kishkan.epam.repository.EmployeeRepository;
import com.kishkan.epam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public AuthorizedUser getUser(String login) {
        Employee employeeUser = employeeRepository.getEmployeeByLogin(login);

        AuthorizedUser authorizedUser = new AuthorizedUser();
        authorizedUser.setLogin(employeeUser.getLogin());
        authorizedUser.setPassword(employeeUser.getPassword());
        authorizedUser.setRole(employeeUser.getAppointment());

        return authorizedUser;
    }


}