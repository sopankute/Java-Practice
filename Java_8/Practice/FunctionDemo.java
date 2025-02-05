package Java_8.Practice;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        
        Function<String, Integer> f = (name) -> name.length();

        System.out.println(f.apply("Mumbai"));      // 6


         // Retrieve emp details based id
        List<Employee> empList = Employee.getListOfEmp();

        Function<Integer, Employee> f1 = (id)-> empList.get(id);
        System.out.println(f1.apply(12));


        // BiFunctional
        BiFunction<Integer, Integer, Integer> f2 = (i,j)-> i+j;
        System.out.println(f2.apply(8, 9));
    }
}
