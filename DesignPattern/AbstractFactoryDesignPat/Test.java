package AbstractFactoryDesignPat;

public class Test {
    public static void main(String[] args) {
        
        Employee emp1 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalery());

        Employee emp2 = EmployeeFactory.getEmployee((new AndroidDeveloperFactory()));
        System.out.println(emp2.getName());
        System.out.println(emp2.getSalery());
    }
}
