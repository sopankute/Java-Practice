package Java_8.Practice;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo8 {
    public static void main(String[] args) {

        List<Employee> list = Employee.getListOfEmp();

        // Is any working in "Boston"
        Boolean status1 = list.stream().anyMatch(e -> e.getCity().equals("Boston"));
        System.out.println(status1);

        // are all Employees male ?
        Boolean status2 = list.stream().allMatch(e -> e.getGender().equals("Male"));
        System.out.println(status2);

        // No one is form Washington DC
        Boolean status3 = list.stream().noneMatch(e -> e.getCity().equals("Washington"));
        System.out.println(status3);

        // Optional used to avoid Null pointer Exception
        Optional<Employee> emp = list.stream().filter(e -> e.getCity().equals("Boston")).findFirst();
        if (emp.isPresent()) {
            System.out.println(emp.get());
        }

        // Find all Emp working in Bosten
        List<Employee> newList = list.stream().filter(e -> e.getCity().equals("San Francisco")).collect(Collectors.toList());
        // newList.forEach(e->System.out.println(e));

        // Collect names of Emp who are belongs to Dallas and store into collections
        List<String> empNames = list.stream().filter(e->e.getCity().equals("Dallas")).map(e->e.getName()).collect(Collectors.toList());
        empNames.forEach(e->System.out.println(e));


    }
}
