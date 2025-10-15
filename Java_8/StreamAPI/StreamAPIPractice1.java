package Java_8.StreamAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Java_8.Practice.Employee;

public class StreamAPIPractice1 {
    public static void main(String[] args) {

        // Immutable List/Set
        List<String> immuableList = Stream.of("Red", "Green", "Bule", null, "Yellow").toList();
        // immuableList.add("Orange"); // can't update -> UnsupportedOperationException
        // System.out.println(immuableList); // [Red, Green, Bule, null, Yellow]

        // Mutable List/Set
        List<String> mutableList = Stream.of("Red", "Bule", null, "Yellow").collect(Collectors.toList());
        mutableList.add("Green");
        mutableList.set(1, "Pink"); // updatable
        // System.out.println(mutableList); // [Red, Pink, null, Yellow, Green]

        List<Employee> list = Employee.getListOfEmp();

        // Grouping By Dept
        Map<String, List<Employee>> groupEmpByDept = list.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName));     // getting unique Dept
        for (Entry<String, List<Employee>> employee : groupEmpByDept.entrySet()) { // Set<Entry<String,List<Employee>>>
            // System.out.println(employee.getKey() + "=" + employee.getValue());
        }
        System.out.println("\n");

        // Aggregation: Calculate the total Salary of Employee by Dept
        Map<String, Long> totalSalaryByDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                                    Collectors.summingLong(Employee::getSalary)));
        System.out.println(totalSalaryByDept); // {Sales=268000, Finance=196000, HR=140000, IT=214000, Marketing=162000}

        Map<String, Double> avgSalaryByDept = list.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,  // getting unique Dept
                         Collectors.averagingDouble(Employee::getSalary))   // Avg salary of each Dept 
                );  
        System.out.println(avgSalaryByDept);     // Avg salary of each Dept.

        // System.out.println("/nEmployee with salary geater than 70000/n");

        // Filtering - Employee with salary geater than 70000
        List<Employee> emps = list.stream().filter(emp -> emp.getSalary() > 70000).toList();
        // System.out.println("/n/n/n"+emps);   

        // Mapping: Extracting Employee names
        List<String> empNames = list.stream().map(Employee::getName).collect(Collectors.toList());
        // System.out.println("/n/n/n"+empNames);   // list of Employees Name
        
        // Partitioning: Separate employees into male and female
        Map<Boolean, List<Employee>> employees = list.stream().collect(Collectors.partitioningBy(emp-> "Male".equals(emp.getGender()))); 
        
        System.out.println(employees+"\n\n\n\n\n");     // {false=[Female], true=[Male]}

        
        // using SummaryStatistics (5 matrics: sum, avg, min, max, count) for Employees Salary

        // 1. get count of emp in each dept
        Map<String, LongSummaryStatistics> summaryStatisticByDept = list.stream().collect(
                        Collectors.groupingBy(
                            Employee::getDeptName, Collectors.summarizingLong(Employee::getSalary)
                        ));

        System.out.println(summaryStatisticByDept); // return all -> sum, avg, min, max, count
        
    }
}
