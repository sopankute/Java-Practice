package OOPS;

abstract class Car{

    int no_of_tyres;

    abstract void startEngine();

    void fuelType(){
        System.out.println("This is hibrid car model ");
        
    } 
}

class Mahendra extends Car{

    public Mahendra(){
        no_of_tyres = 3;
    }

    @Override
    public void startEngine() {
        System.out.println("THis is EV6 model of Mahindra Company ");
    }

}

public class AbstractClass1 {
    public static void main(String[] args) {
        
        // Car obj = new Car();    // Cannot instantiate
        Mahendra objMahendra = new Mahendra();
        objMahendra.startEngine();
        objMahendra.fuelType();

        // objMahendra.no_of_tyres = 5;
        System.out.println(objMahendra.no_of_tyres );
    }
}
