

import java.util.ArrayList;
import java.util.List;

public class ComparableClass {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Virat", 8.8));
        list.add(new Student("Rohit", 4.5));
        list.add(new Student("Hardik", 6.5));
        list.add(new Student("Rishabh", 9.5));
        list.add(new Student("Bumrah", 5.5));
    
        list.sort(null);
        System.out.println(list);


        // List<Integer> list = new ArrayList<>();
        // list.add(60);
        // list.add(70);
        // list.add(10);
        // list.add(40);
        // list.add(80);
        // list.add(50);
        // list.add(10);

        // list.sort(null);
        // System.out.println(list);

        // ArrayList<String> list1 = new ArrayList<>();
        // list1.add("Apple");
        // list1.add("Bana");
        // list1.add("Cherryy");
        // list1.add("Apple");

        // list1.sort(null);
        // System.out.println(list1);

    }
}
