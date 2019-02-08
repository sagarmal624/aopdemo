package com.example.aopdemo;

import com.example.aopdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/get/{id}")
    public Employee get(@PathVariable Long id) {
        return employeeService.get(id);
    }

    @GetMapping("/emp/getOne/{id}")
    public Employee get1(@PathVariable Long id) {
        return employeeService.get1(id);
    }

    @GetMapping("/emp/delete/{id}")
    public Employee delete(@PathVariable Long id) {
        return employeeService.delete(id);
    }
}
