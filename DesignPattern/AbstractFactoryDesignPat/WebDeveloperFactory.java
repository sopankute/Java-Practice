package AbstractFactoryDesignPat;

public class WebDeveloperFactory extends AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        
        return new AndroidDeveloper();
    }

}
