package Java_8.Practice;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
         
        List<Employee> list = Employee.getListOfEmp();

        // 1. print emp name whose age is greater than 34.
        Predicate<Employee> predicate = e -> e.getAge() >= 34;
        for(Employee emp : list){
            if(predicate.test(emp)){
                System.out.print("  "+emp.getName());
            }
        }
        System.out.println();

        // 2. Print emp name who are working in Boston in Sales Dept.
        Predicate<Employee> p1 = e->e.getCity().equals("Boston");
        Predicate<Employee> p2 = e->e.getDeptName().equals("Sales");

        for(Employee emp : list){
            if(p1.and(p2).test(emp)){
                System.out.print("  "+emp.getName());
            }
        }
        System.out.println();

        // BiPredicate
        BiPredicate<Integer, Integer> p3 = (i,j) -> i+j > 20;
        System.out.println(p3.test(4, 7));
    }   
}
