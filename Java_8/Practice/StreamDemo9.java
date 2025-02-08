package Java_8.Practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo9 {

    public static void main(String[] args) {
        
        List<Employee> list = Employee.getListOfEmp();

        // Get Min, Max and Avg salary from given employees.

        Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getSalary())));
        System.out.println(max.isPresent() ? max.get() :"Not Present");

        Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.getSalary())));
        System.out.println(min.isPresent() ? min.get() : "Not Present");

        Double avg = list.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
        System.out.println(avg);
    }

}
