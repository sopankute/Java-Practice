package com.demo.streamapi.practice1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;
    private int age;
    private double salary;
    private String gender;
    private String dept;
    private String city;
    private List<Project> projects;
}
