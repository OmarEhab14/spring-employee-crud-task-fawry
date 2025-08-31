package org.example.employeecrudfawrytask.repository;


import org.example.employeecrudfawrytask.models.Employee;

import java.util.List;

public interface EmployeeRepo {
    Employee findById(Integer id);
    List<Employee> findAll();
    Employee save(Employee employee);
    Employee update(Integer id, Employee employee);
    void delete(Integer id);
}
