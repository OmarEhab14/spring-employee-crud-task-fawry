package org.example.employeecrudfawrytask.repositoryimpl;

import org.example.employeecrudfawrytask.models.Employee;
import org.example.employeecrudfawrytask.repository.EmployeeRepo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {
    Map<Integer, Employee> employees;
    private static Integer id = 0;
    public EmployeeRepoImpl() {
        this.employees = new HashMap<>();
    }
    @Override
    public Employee findById(Integer id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> findAll() {
        return employees.values().stream().toList();
    }

    @Override
    public Employee save(Employee employee) {
        employee.setId(++id);
        return employees.put(id, employee);
    }

    @Override
    public Employee update(Integer id, Employee employee) {
        return employees.put(id, employee);
    }

    @Override
    public void delete(Integer id) {
        employees.remove(id);
    }
}
