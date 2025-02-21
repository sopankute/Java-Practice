package Java_8.Practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo13 {

    public static void main(String[] args) {
        
        List<Employee> list = Employee.getListOfEmp();

        // 1. How many Male and Female are there in the company? (Count)
        Map<String, Long>  map = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(map);        // {Male=8, Female=7}

        /*        

        // 2. Print the name of all department in the orgnization
        list.stream().map(e->e.getDeptName()).distinct().forEach(e-> System.out.print(e+", "));     // HR, IT, Finance, Marketing, Sales,

        // 3. What is Average age of Male and Female Employee  
        Map<String, Double> map1 = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(map1);       // {Male=35.875, Female=30.714}
        
        // 4. Get Details of highest paid Employee in Company
        Optional<Employee> optional = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        
        if (optional.isPresent()) {
            System.out.println(optional.get()); // Employee [id=7, name=George, age=45, salary=95000, gender=Male, deptName=Finance, city=Boston]
        }
        // 5. Names of all Employees who have joined after 2015
        
        // 6. Count the no of employes in each Department
        Map<String, Long> map3 = list.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println(map3);       // {Sales=4, Finance=3, HR=2, IT=4, Marketing=2}
        
        // 7. What is the Average salary of each department. 
        Map<String, Double> map4 = list.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map4);       // {Sales=67000.0, Finance=65333.3336, HR=70000.0, IT=53500.0, Marketing=81000.0}
        
        
        // 8. Get the details of Youngest Male Employee from IT Department.
        Optional<Employee> emp1 = list.stream()
        .filter(e->e.getGender().equals("Male") && e.getDeptName().equals("IT"))
        .min(Comparator.comparing(Employee::getAge));
        if (emp1.isPresent()) { System.out.println(emp1.get());}    // Employee [id=11, name=Kevin, age=31, salary=64000, gender=Male, deptName=IT, city=Dallas]
        
        // 9. How many Male and Female are there Sales Department
        Map<String, Long> map5 = list.stream().filter(e-> e.getDeptName().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(map5);       // {Female=2, Male=2}
        
        // 10.What is the average salary male and female employees
        Map<String, Double> map6 = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map6);       // {Male=68500.0, Female=61714.285}
        
        // 11.List down the name of employees in each department
        Map<String, List<Employee>> map7 = list.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        // System.out.println(map7);
        
        for(Map.Entry<String, List<Employee>> emp : map7.entrySet()){
            System.out.println(emp.getKey()+" : ");
            System.out.println(emp.getValue()+"\n");
        }
        
        // 12.what is average salary and total salary of whole orgnization
        Double avg = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);            // 65333.333
        
        Double totalSalary = list.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(totalSalary);    // 980000.0
        
        // 13. Which Employee is having Highest salary 
        Optional<Employee> highSalary = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        // if (highSalary.isPresent()) {System.out.println(highSalary.get()); }

        Optional<Employee> secondHighSalaryEmp = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();

        if(secondHighSalaryEmp.isPresent()){System.out.println(secondHighSalaryEmp.get());}   //90000

        */
    }
}
