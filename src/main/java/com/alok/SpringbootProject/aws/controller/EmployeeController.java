package com.alok.SpringbootProject.aws.controller;

import com.alok.SpringbootProject.aws.Exception.EmployeeAlreadyExistsInDatabaseException;
import com.alok.SpringbootProject.aws.entity.Employee;
import com.alok.SpringbootProject.aws.service.ComparatorSort;
import com.alok.SpringbootProject.aws.service.EmployeeService;

import lombok.SneakyThrows;

import java.util.Collections;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 

@RestController
 

public class EmployeeController {
 
    
    @Autowired private EmployeeService employeeService;
        @SneakyThrows
        @PostMapping("/employees")
    public Employee saveEmployee (
         @RequestBody Employee employee) throws Exception
    {
        List<Employee> employeelist = employeeService.fetchEmployeeList();
        for (Employee x : employeelist) {
        	if(employee.getId() == x.getId()) {
        		throw new EmployeeAlreadyExistsInDatabaseException("This id already exists in the database use a different id!");
        	}
        }
        return employeeService.saveEmployee(employee);
    }
 
    
    @GetMapping("/employees")
    public List<Employee> fetchEmployeeList()
    {
    	List<Employee> employeelist = employeeService.fetchEmployeeList();
    	Collections.sort(employeelist,new ComparatorSort());
        return employeelist;
    }
 
    
    @PutMapping("/employees/{id}")
    public Employee
    updateEmployee(@RequestBody Employee employee,
                     @PathVariable("id") Long Id)
    {
        return employeeService.updateEmployee(
            employee, Id);
    }
    
    
    
    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable("id")
                                       Long Id)
    {
        employeeService.deleteEmployeeById(
            Id);
        return "Deleted Successfully";
    }
}