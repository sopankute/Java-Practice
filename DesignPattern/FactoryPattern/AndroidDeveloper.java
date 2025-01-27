package FactoryPattern;

public class AndroidDeveloper implements Employee{

    int salary = 55000; 
    @Override
    public int getSalary() {
       System.out.println("AndroidDeveloper.getSalary() | Salary : "+salary);
       return salary;
    }

}
