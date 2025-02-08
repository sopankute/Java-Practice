package Java_8.Practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        
        List<Employee> list = Employee.getListOfEmp();

        // Group emp by city name
        Map<String, List<Employee>> groupedData = list.stream().collect(Collectors.groupingBy(e-> e.getCity()));
        
        
        for(Map.Entry<String, List<Employee>> entry : groupedData.entrySet()){ 
            System.out.print(entry.getKey()+" = ");
            List<Employee> emp = entry.getValue();
            for (Employee e : emp) {
                System.out.println(e);
            }
           System.out.println();
        }
    }
}
