package com.kishkan.epam.service.impl;

import com.kishkan.epam.dto.AuthorizedUserDto;
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
    public AuthorizedUserDto getUser(String login) {
        Employee employeeUser = employeeRepository.getEmployeeByLogin(login);

        AuthorizedUserDto authorizedUserDto = new AuthorizedUserDto();
        authorizedUserDto.setLogin(employeeUser.getLogin());
        authorizedUserDto.setPassword(employeeUser.getPassword());
        authorizedUserDto.setRole(employeeUser.getAppointment());

        return authorizedUserDto;
    }


}