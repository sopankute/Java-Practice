package StringClasses;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Mahavir");
        list.add("Vishwajit");

        Student s1 = new Student(234, "Rose", list);
        System.out.println(s1.disp() + " | " + s1.hashCode());

        List<String> list2 = s1.getFrnds();
        list2.clear();
        System.out.println("The size of List2 : "+list2.size());
        System.out.println(s1.disp() + " | " + s1.hashCode()); // Existing object not changed
        
        String str = s1.getName();
        str = "null";
        System.out.println(s1.disp() + " | " + s1.hashCode()); // Existing object not changed


        String str1 = "Home";
        String str2 = "home";

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

    }
}
