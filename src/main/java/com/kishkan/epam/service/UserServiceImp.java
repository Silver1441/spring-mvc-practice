package com.kishkan.epam.service;

import com.kishkan.epam.dto.AppUser;
import com.kishkan.epam.entity.Employee;
import com.kishkan.epam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public AppUser getUser(String login) {
        Employee employeeUser = employeeRepository.getEmployeeByLogin(login);

        AppUser appUser = new AppUser();
        appUser.setLogin(employeeUser.getLogin());
        appUser.setPassword(employeeUser.getPassword());
        appUser.setRole(employeeUser.getAppointment());

        return appUser;
    }
}