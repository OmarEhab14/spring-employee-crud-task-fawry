package org.example.employeecrudfawrytask.service;

import org.example.employeecrudfawrytask.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(Integer id);
    List<Employee> getAllEmployees();
    Employee insertEmployee(Employee employee);
    Employee updateEmployee(Integer id, Employee employee);
    void deleteEmployee(Integer id);
}
