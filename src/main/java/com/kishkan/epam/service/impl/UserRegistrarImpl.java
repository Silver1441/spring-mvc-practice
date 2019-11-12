package com.kishkan.epam.service.impl;

import com.kishkan.epam.dto.RegisteredUserDto;
import com.kishkan.epam.entity.Employee;
import com.kishkan.epam.repository.EmployeeRepository;
import com.kishkan.epam.service.UserRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrarImpl implements UserRegistrar {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(RegisteredUserDto registeredUserDto) {
        Employee employee = new Employee.Builder()
                .name(registeredUserDto.getName())
                .patronymic(registeredUserDto.getPatronymic())
                .surname(registeredUserDto.getSurname())
                .login(registeredUserDto.getLogin())
                .password(passwordEncoder.encode(registeredUserDto.getPassword()))
                .appointment(registeredUserDto.getAppointment())
                .build();

        employeeRepository.addEmployee(employee);
    }

//    public static void main(String[] args) {
//        UserRegistrar userRegistrar = new UserRegistrarImpl();
//        RegisteredUser registeredUser = new RegisteredUser();
//        registeredUser.setLogin("TestLog");
//        registeredUser.setPassword("TestPassword");
//        registeredUser.setAppointment("TestAppointment");
//        userRegistrar.registerUser(registeredUser);
//        System.out.println("log");
//    }
}
