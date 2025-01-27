package AbstractFactoryDesignPat;

public class WebDeveloper implements Employee {

    @Override
    public String getName() {
        System.out.println("WebDeveloper.getName()");
        return "Web Developer";
    }

    @Override
    public long getSalery() {
        System.out.println("WebDeveloper.getSalery() | ");
        return 50000;
    }

}
