
public interface Director {

    // void generateReport();

    default void generateReport(){
        System.out.println("Director.generateReport()");
    }

}
