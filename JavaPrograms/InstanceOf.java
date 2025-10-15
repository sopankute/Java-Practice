package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

interface InnerInstanceOf {

}

class InnerInstanceOf_1 implements InnerInstanceOf {

    public InnerInstanceOf_1() {
    }

}

class Employee {
    int id;
    String name;

    public Employee(){}

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        // InnerInstanceOf_1 obj = new InnerInstanceOf_1();

        // if (obj instanceof InnerInstanceOf) {
        //     System.out.println("InstanceOf.main()");
        // } else {
        //     System.out.println("InstanceOf not");
        // }

        Set<Employee> set = new HashSet<>();

        set.add(new Employee(3,"Chandu"));
        set.add(new Employee(3,"Chandu"));

        System.out.println(set);
    }
}
