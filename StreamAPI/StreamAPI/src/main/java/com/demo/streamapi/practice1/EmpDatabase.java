package com.demo.streamapi.practice1;

import java.util.Arrays;
import java.util.List;


public class EmpDatabase {

    public static List<Employee> getAllEmployee(){

        // Project instances
        Project p1 = new Project("P101", "Alpha",    "ClientA", "Sam");
        Project p2 = new Project("P102", "Beta",     "ClientB", "Tom");
        Project p3 = new Project("P103", "Gamma",    "ClientC", "Alice");
        Project p4 = new Project("P104", "Delta",    "ClientD", "Bob");
        Project p5 = new Project("P105", "Epsilon",  "ClientE", "Diana");
        Project p6 = new Project("P106", "Zeta",     "ClientF", "Charlie");
        Project p7 = new Project("P107", "Eta",      "ClientG", "Fiona");
        Project p8 = new Project("P108", "Theta",    "ClientH", "George");
        Project p9 = new Project("P109", "Iota",     "ClientI", "Hannah");
        Project p10 = new Project("P110", "Kappa",   "ClientJ", "Ian");

// Employee instances with 2-5 projects
        Employee e1  = new Employee(1,  "Alice",    30, 60000, "Female", "HR",       "New York",       Arrays.asList(p1, p2, p3));
        Employee e2  = new Employee(2,  "Bob",      35, 35000, "Male",   "IT",       "San Francisco",  Arrays.asList(p2, p4));
        Employee e3  = new Employee(3,  "Charlie",  28, 50000, "Male",   "Finance",  "Chicago",        Arrays.asList(p5, p6, p3));
        Employee e4  = new Employee(4,  "Diana",    40, 90000, "Female", "Marketing","Los Angeles",    Arrays.asList(p4, p7));
        Employee e5  = new Employee(5,  "Ethan",    32, 65000, "Male",   "Sales",    "Boston",         Arrays.asList(p5, p8, p9));
        Employee e6  = new Employee(6,  "Fiona",    29, 55000, "Female", "IT",       "Austin",         Arrays.asList(p6, p2, p7));
        Employee e7  = new Employee(7,  "George",   45, 95000, "Male",   "Finance",  "Boston",         Arrays.asList(p8, p10));
        Employee e8  = new Employee(8,  "Hannah",   27, 48000, "Female", "Sales",    "Denver",         Arrays.asList(p9, p1, p5));
        Employee e9  = new Employee(9,  "Ian",      38, 72000, "Male",   "Marketing","Miami",          Arrays.asList(p10, p3, p4, p2));
        Employee e10 = new Employee(10, "Julia",    33, 68000, "Female", "Sales",    "San Francisco",  Arrays.asList(p1, p6, p7));
        Employee e11 = new Employee(11, "Kevin",    31, 64000, "Male",   "IT",       "Dallas",         Arrays.asList(p2, p8, p9));
        Employee e12 = new Employee(12, "Laura",    26, 51000, "Female", "Finance",  "San Francisco",  Arrays.asList(p3, p10, p5));
        Employee e13 = new Employee(13, "Michael",  37, 80000, "Male",   "HR",       "Boston",         Arrays.asList(p1, p4));
        Employee e14 = new Employee(14, "Nina",     30, 60000, "Female", "IT",       "Dallas",         Arrays.asList(p6, p7, p2));
        Employee e15 = new Employee(15, "Oliver",   41, 87000, "Male",   "Sales",    "Boston",         Arrays.asList(p9, p10, p5));

        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15);
    }


}
