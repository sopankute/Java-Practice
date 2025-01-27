package AbstractFactoryDesignPat;

public class AndroidDeveloper implements Employee{

    @Override
    public String getName() {
        System.out.println("AndroidDeveloper.getName()");
        return "Android Developer";
    }

    @Override
    public long getSalery() {
       System.out.print("AndroidDeveloper.getSalery() | ");
       return 40000;
    }

}
