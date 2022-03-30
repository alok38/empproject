package com.alok.SpringbootProject.aws.service;
import com.alok.SpringbootProject.aws.entity.Employee;
//Importing required classes
import java.util.List;


public interface EmployeeService {

 
 Employee saveEmployee(Employee employee);


  List<Employee> fetchEmployeeList();

 
 Employee updateEmployee(Employee emplopyee,
                             Long Id);




void deleteEmployeeById(Long Id);




}