package Java_8;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceClass {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("sunil", "Vishwajit", "mahavir");
        System.out.println(list+"  ");
        List<Student> studentsList = list.stream().map(x->new Student(x)).collect(Collectors.toList());
        
        // List<Student> studentsList = list.stream().map(Student::new).collect(Collectors.toList());

       
    }

}
