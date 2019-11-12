package com.kishkan.epam.repository;

import com.kishkan.epam.entity.Employee;

public interface EmployeeRepository {
    Employee getEmployeeByLogin(String login);
    void addEmployee(Employee employee);
}
