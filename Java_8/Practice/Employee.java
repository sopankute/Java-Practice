package Java_8.Practice;

import java.util.Arrays;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    
    
    public Employee() {
    }

    public Employee(int id, String name, int age, long salary, String gender, String deptName, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
       
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
                + ", deptName=" + deptName + ", city=" + city +"]";
    }


    public static java.util.List<Employee>  getListOfEmp(){
        java.util.List<Employee> empList = new java.util.ArrayList<>();
        empList.add(new Employee(1,  "Alice",    30, 60000, "Female", "HR",       "New York"));
        empList.add(new Employee(2,  "Bob",      35, 35000, "Male",   "IT",       "San Francisco"));
        empList.add(new Employee(3,  "Charlie",  28, 50000, "Male",   "Finance",  "Chicago"));
        empList.add(new Employee(4,  "Diana",    40, 90000, "Female", "Marketing","Los Angeles"));
        empList.add(new Employee(5,  "Ethan",    32, 65000, "Male",   "Sales",    "Boston"));
        empList.add(new Employee(6,  "Fiona",    29, 55000, "Female", "IT",       "Austin"));
        empList.add(new Employee(7,  "George",   45, 95000, "Male",   "Finance",  "Boston"));
        empList.add(new Employee(8,  "Hannah",   27, 48000, "Female", "Sales",       "Denver"));
        empList.add(new Employee(9,  "Ian",      38, 72000, "Male",   "Marketing","Miami"));
        empList.add(new Employee(10, "Julia",    33, 68000, "Female", "Sales",    "San Francisco"));
        empList.add(new Employee(11, "Kevin",    31, 64000, "Male",   "IT",       "Dallas"));
        empList.add(new Employee(12, "Laura",    26, 51000, "Female", "Finance",  "San Francisco"));
        empList.add(new Employee(13, "Michael",  37, 80000, "Male",   "HR",       "Boston"));
        empList.add(new Employee(14, "Nina",     30, 60000, "Female", "IT","Dallas"));
        empList.add(new Employee(15, "Oliver",   41, 87000, "Male",   "Sales",    "Boston"));


        return empList;
    }

    public static List<String> getStrings(){
        return Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Ethan","Fiona","George","Hannah","Ian","Julia","Kevin","Laura","Michael","Nina","Oliver");
    }

    public static List<Integer> getInts(){
        return Arrays.asList(30, 55, 21, 49, 72, 19, 45, 73, 34, 67, 92, 73, 92, 66, 46);
    }

}
