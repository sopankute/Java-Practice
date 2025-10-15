
public interface Manager {

    // void generateReport();

    default void generateReport(){
        System.out.println("Manager.generateReport()");
    }

}
