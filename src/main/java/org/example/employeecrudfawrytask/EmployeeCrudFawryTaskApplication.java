package org.example.employeecrudfawrytask;

import org.example.employeecrudfawrytask.config.Config;
import org.example.employeecrudfawrytask.models.Employee;
import org.example.employeecrudfawrytask.repository.EmployeeRepo;
import org.example.employeecrudfawrytask.repositoryimpl.EmployeeRepoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

//@SpringBootApplication
public class EmployeeCrudFawryTaskApplication {

    public static void main(String[] args) {
//        SpringApplication.run(EmployeeCrudFawryTaskApplication.class, args);
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        EmployeeRepo empRepo = ctx.getBean(EmployeeRepoImpl.class);
        empRepo.save(new Employee("Omar", 20000.0));
        empRepo.save(new Employee("Abdallah", 15000.0));
        System.out.println(empRepo.findAll());
    }

}
