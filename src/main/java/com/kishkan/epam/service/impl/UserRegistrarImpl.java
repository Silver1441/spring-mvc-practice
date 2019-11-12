package com.kishkan.epam.service.impl;

import com.kishkan.epam.dto.RegisteredUser;
import com.kishkan.epam.entity.Employee;
import com.kishkan.epam.repository.EmployeeRepository;
import com.kishkan.epam.repository.impl.EmployeeRepositoryImpl;
import com.kishkan.epam.service.UserRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrarImpl implements UserRegistrar {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void registerUser(RegisteredUser registeredUser) {
        Employee employee = new Employee.Builder()
                .name(registeredUser.getName())
                .patronymic(registeredUser.getPatronymic())
                .surname(registeredUser.getSurname())
                .login(registeredUser.getLogin())
                .password(registeredUser.getPassword())
                .appointment(registeredUser.getAppointment())
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
