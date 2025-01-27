package FactoryPattern;

public class WebDeveloper implements Employee{

    int salary = 35000; 
    @Override
    public int getSalary() {
       System.out.println("WebDeveloper.getSalary() | Salary : "+salary);
        return salary;
    }

}
