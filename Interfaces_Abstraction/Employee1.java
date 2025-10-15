
public class Employee1 implements Manager, Director {

    
    public static void main(String[] args) {
        
        Manager manger = new Employee1();
        manger.generateReport();

        Director director = new Employee1();
        director.generateReport();
    }

    @Override
    public void generateReport() {
        
        Manager.super.generateReport();
        Director.super.generateReport();

    }

}
