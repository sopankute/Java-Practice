package OOPS;

import java.lang.reflect.Constructor;

class Base {

    public void show(String str){
        System.out.println("Base.show() | String : "+str);
    } 

    public void show(Object obj){
        System.out.println("Base.show() | Object : "+obj);
    }
}
class Derived extends Base{
    
    public void show(Integer x){
        System.out.println("Derived.show() | Integer : "+x);
    }   
}

public class PolymorphismTest1 {
    public static void main(String[] args) {
              
        // Base b = new Derived();
        // b.show(10);                         // Base.show() | Object : 10

        // Derived d = new Derived(); 
        // d.show(10);                           // Derived.show() | Integer : 10

        
    
    }   
}
