package OOPS;

abstract class Home{
    abstract void print();

    Home(){
        System.out.println("Abstract Constructor");
    }
}

class Room extends Home{

    Room(){
        super();
        System.out.println("Room Constructor");
    }

    @Override
    void print() {
        System.out.println("...........");
    }
}

public class AbstractionClass {
    public static void main(String[] args) {
        Home obj = new Room();
        obj.print();
    }
}
