package Java_8.Practice;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {


    public static void main(String[] args) {
        

        List<Employee> listOfEmp = Employee.getListOfEmp();

        Collections.sort(listOfEmp, (e1, e2)->(int)(e1.getSalary()-e2.getSalary()));

        System.out.println(listOfEmp);
    }
}

class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
       return (int)(o1.getSalary()-o2.getSalary());
    }    
}