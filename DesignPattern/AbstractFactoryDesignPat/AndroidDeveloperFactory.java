package AbstractFactoryDesignPat;

public class AndroidDeveloperFactory extends AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        
        return new WebDeveloper();
    }

}
