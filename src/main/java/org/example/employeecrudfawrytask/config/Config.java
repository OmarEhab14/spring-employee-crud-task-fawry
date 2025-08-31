package org.example.employeecrudfawrytask.config;

import org.example.employeecrudfawrytask.repository.EmployeeRepo;
import org.example.employeecrudfawrytask.repositoryimpl.EmployeeRepoImpl;
import org.example.employeecrudfawrytask.service.EmployeeService;
import org.example.employeecrudfawrytask.serviceimpl.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class Config {
    @Bean
    EmployeeRepo getEmployeeRepoImpl() {
        return new EmployeeRepoImpl();
    }
    @Bean
    EmployeeService getEmployeeService() {
        return new EmployeeServiceImpl(getEmployeeRepoImpl());
    }
}
