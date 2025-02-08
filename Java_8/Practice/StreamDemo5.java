package Java_8.Practice;

import java.util.List;

public class StreamDemo5 {
    public static void main(String[] args) {
        
        List<Employee> list = Employee.getListOfEmp();

        // Print emp name with Emp Age whose salary is >=50000 using stream

        list.stream().filter(e-> e.getSalary() >70000).map(e-> e.getName()+" : "+e.getAge()).forEach(e->System.out.println(e));
    }
}
