package FactoryPattern;

public class PythonDeveloper implements Employee {

    int salary = 40000;
    @Override
    public int getSalary() {
        System.out.println("PythonDeveloper.getSalary() | Salary : "+salary);
        return salary;
    }

}
