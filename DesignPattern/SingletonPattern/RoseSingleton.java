package SingletonPattern;

import java.io.Serializable;

public class RoseSingleton implements Serializable, Cloneable {    
    // Lazy
    private static RoseSingleton roseRoseSingleton;
    // Constructor
    private RoseSingleton() {
        // solution for Reflection breaking pattern
        if (roseRoseSingleton != null) {    // if object created then throw Exception
            throw new RuntimeException("Trying to Break Singleton Pattern...");
        }
    }
    // Method
    public static RoseSingleton getRoseSingleton() {
        if (roseRoseSingleton == null) {
            synchronized (RoseSingleton.class) {
                if (roseRoseSingleton == null) {
                    roseRoseSingleton = new RoseSingleton();
                }
            }
        }
        return roseRoseSingleton;
    }
   
    // solution for De-Serialization
    public Object readResolve(){
        return roseRoseSingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return roseRoseSingleton;
    }


    public void show() {
        System.out.println("RoseRoseSingleton.show() | I'm from Singleton Design Pattern!!");
    }
}
