package Java_8;

// Employee | SoftwareEngineer | Test

public class Test {
    public static void main(String[] args) {
       
        Employee emp = ()-> "Software Engineer";    // Lambda Expression is an Implementation of getName();
        System.out.println(emp.getName());              // Software Engineer
       
        // Employee emp = ()->System.out.println("I'm Implementation of sayHello() | Employee.java");
        // emp.sayHello();

        // SoftwareEngineer obj = new SoftwareEngineer();
        // System.out.println(obj.getName());

        // Employee ref = new SoftwareEngineer();
        // System.out.println(ref.getName());
    }
}
