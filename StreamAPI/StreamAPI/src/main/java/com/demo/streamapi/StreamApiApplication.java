package com.demo.streamapi;


import com.demo.streamapi.practice1.EmpDatabase;
import com.demo.streamapi.practice1.Employee;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiApplication {

    public static void main(String[] args) {

        List<Employee> emplist = EmpDatabase.getAllEmployee();

        for (Employee e : emplist) {
//			System.out.println(e+"\n");
        }

//		emplist.stream().forEach(System.out::println);
//		emplist.stream().forEach(e-> System.out.println(e.getName()+"-"+e.getSalary()));


        // filter()
        emplist.stream().filter(e -> "Sales".equals(e.getDept()));
//					.forEach(e-> System.out.println(e.getName()+"-"+e.getDept()));

        Set<Employee> employeeList1 = emplist.stream().filter(e -> e.getDept().equalsIgnoreCase("IT") && e.getSalary() > 50000).collect(Collectors.toSet());

//		employeeList1.forEach(System.out::println);

        Map<Integer, String> employeeMap = emplist.stream().filter(e -> e.getDept().equalsIgnoreCase("it") && e.getSalary() > 50000).collect(Collectors.toMap(Employee::getId, Employee::getName));

//		employeeMap.entrySet().stream().forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));

//		for (Map.Entry<Integer, String> e : employeeMap.entrySet()){
//			System.out.println(e.getKey()+" : "+e.getValue());
//		}

        // map()
        Set<String> deptList = emplist.stream().map(Employee::getDept).collect(Collectors.toSet());
//		deptList.forEach(System.out::println);

        Map<String, List<Employee>> emplByDept = emplist.stream().collect(Collectors.groupingBy(Employee::getDept));

//		emplByDept.forEach((e, d)-> System.out.println(e+" : "+d));

        List<String> projectName = emplist.stream().flatMap(e -> e.getProjects().stream()).map(p -> p.getName()).distinct().collect(Collectors.toList());

//		projectName.forEach(System.out::println);


        // Sorted()

        List<Employee> ascendEmployeeList2 = emplist.stream().sorted(Comparator.comparing(e -> e.getSalary())).collect(Collectors.toList());
//		ascendEmployeeList2.forEach(System.out::println);

        List<Employee> descendEmployeeList3 = emplist.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).collect(Collectors.toList());
//		descendEmployeeList3.forEach(System.out::println);


        // Min and Max
        Optional<Employee> minSalaryEmp = emplist.stream().min(Comparator.comparingDouble(Employee::getSalary));
//		System.out.println(minSalaryEmp.get());

        // Gender vise listEmpName
        Map<String, List<String>> listByGender = emplist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())    // List of Name
        ));
//		System.out.println(listByGender);

        Map<String, Long> empCount = emplist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(empCount);

        // count emp by Dept

        Map<String, Long> empCountByDept = emplist.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
//		System.out.println(empCountByDept);


        // findFirst
        Optional<Employee> emp = emplist.stream().filter(e -> e.getDept().equalsIgnoreCase("it")).findFirst();

//		emp.ifPresent(System.out::println);

//        Optional<Employee> empByAge = emplist.stream().filter(e -> e.getAge() > 30).findFirst();
//        if(empByAge.isPresent()){
//            System.out.println(empByAge);
//        }
//        empByAge.ifPresent(e-> System.out.println(e.getName()));

        Employee empByAge = emplist.stream().filter(e -> e.getAge() > 30).findFirst().orElseThrow(()-> new IllegalArgumentException("Emp not found"));
//        System.out.println(empByAge);

         List<Employee> employeeList3 = emplist.stream().filter(e-> e.getDept().equalsIgnoreCase("it")).limit(2)
                 .toList();
        employeeList3.forEach(System.out::println);

        List<Employee> employeeList4 = emplist.stream().sorted(Collections.reverseOrder(Comparator.comparingDouble(Employee::getSalary))).skip(3).collect(Collectors.toList());
        employeeList4.forEach(e-> System.out.println(e.getName()+":"+e.getSalary()));

    }

}
