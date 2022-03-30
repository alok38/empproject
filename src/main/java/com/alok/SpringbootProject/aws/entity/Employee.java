package com.alok.SpringbootProject.aws.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
import javax.persistence.Entity;

import javax.persistence.Id;
 

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 

public class Employee {
 
    @Id
    private Long Id;
    private String Name;
    private Long Salary;
    private String Designation;
}