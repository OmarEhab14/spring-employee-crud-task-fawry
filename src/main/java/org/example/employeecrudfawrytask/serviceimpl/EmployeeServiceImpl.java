package org.example.employeecrudfawrytask.serviceimpl;

import org.example.employeecrudfawrytask.models.Employee;
import org.example.employeecrudfawrytask.repository.EmployeeRepo;
import org.example.employeecrudfawrytask.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepo.findById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee insertEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        return employeeRepo.update(id, employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepo.delete(id);
    }
}
