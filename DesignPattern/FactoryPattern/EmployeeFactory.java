package FactoryPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String empType) {

        switch (empType) {
            case "android":
                return new AndroidDeveloper();
                
            case "web":
                return new WebDeveloper();

            case "python":
                return new PythonDeveloper();

            default:
                System.out.println("Please provide valid input.");
                return null;
        }
    }
}
