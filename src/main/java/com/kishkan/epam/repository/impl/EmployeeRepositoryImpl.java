package com.kishkan.epam.repository.impl;

import com.kishkan.epam.entity.Employee;
import com.kishkan.epam.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private List<Employee> Employees = new ArrayList<>();

    public EmployeeRepositoryImpl() {
        Employee testEmployee = new Employee();
        testEmployee.setId(101);
        testEmployee.setName("test_name");
        testEmployee.setSurname("test_surname");
        testEmployee.setLogin("test_login");
        testEmployee.setPassword("123");
        Employees.add(testEmployee);
    }

    @Override
    public Employee getEmployeeByLogin(String login) {
        return Employees.stream()
                .filter((employee) -> employee.getLogin().equals(login))
                .findFirst().orElse(null);
    }
}
