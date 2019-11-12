package com.kishkan.epam.repository.impl;

import com.kishkan.epam.entity.Employee;
import com.kishkan.epam.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();
    AtomicInteger idCounter = new AtomicInteger(100);

    public EmployeeRepositoryImpl() {
        Employee testEmployee = new Employee.Builder()
                .name("test_name")
                .patronymic("test_patronymic")
                .surname("test_surname")
                .login("test_login")
                .password("123")
                .appointment("developer")
                .build();
        testEmployee.setId(idCounter.getAndIncrement());
        employees.add(testEmployee);
    }

    @Override
    public Employee getEmployeeByLogin(String login) {
        return employees.stream()
                .filter((employee) -> employee.getLogin().equals(login))
                .findFirst().orElse(null);
    }

    @Override
    public void addEmployee(Employee employee) {
        employee.setId(idCounter.getAndIncrement());
        employees.add(employee);
    }
}
