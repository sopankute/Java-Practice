package Java_8.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class FilterDemo {


    public static void main(String[] args) {
        

        List<Employee>  list = Employee.getListOfEmp();

        List<Employee> collect = list.stream().filter(emp->emp.getSalary()>70000).collect(Collectors.toList());

        // collect.forEach(e->System.out.println(e));


        Set<String> collect2 = list.stream().map(e->e.getName()).collect(Collectors.toSet());

        // collect2.forEach(e->System.out.println(e));

        String collect3 = list.stream().map(e->e.getName()).collect(Collectors.joining(","));

        // System.out.println(collect3);


        Map<Integer, String> collect4 = list.stream().collect(Collectors.toMap(e->e.getId(), e->e.getName()));

        // collect4.entrySet().stream().forEach(e->System.out.println(e));

        // list.stream().map(e->e.getAge()).collect(Collectors.toList()).forEach(e->System.out.print(e+", "));


        // Sorting

        List<Integer> intList = Employee.getInts();

        Collections.sort(intList);
        System.out.println(intList);

        // intList.stream().sorted().forEach(System.out::println);

    }

}
