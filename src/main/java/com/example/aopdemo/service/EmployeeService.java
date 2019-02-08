package com.example.aopdemo.service;

import com.example.aopdemo.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee get(Long id) {
        System.out.println("Service get method called-----" + id);
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("sagar");
        return employee;
    }

    public Employee get1(Long id) {
        System.out.println("Service get 1 method called-----" + id);
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("sagar");
        return employee;
    }

    public Employee delete(Long id) {
        System.out.println("Service Delete  method called-----" + id);
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("sagar");
        return employee;
    }
}
