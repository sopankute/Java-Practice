package FactoryPattern;

import java.util.Scanner;

public class TestService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Type : ");
        String empType = sc.nextLine();
        
        Employee emp = EmployeeFactory.getEmployee(empType.trim().toLowerCase());
        emp.getSalary();
    }
}
