package SingletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestPattern {
    public static void main(String[] args) throws Exception {

        /*
         * // Lazy Initialization
         * RoseSingleton roseObject1 = RoseSingleton.getRoseApartmentSingleton();
         * RoseSingleton roseObject2 = RoseSingleton.getRoseApartmentSingleton();
         * 
         * if (roseObject1.hashCode() == roseObject2.hashCode()) {
         * System.out.println("The Object is Same | hashcode :"
         * + roseObject1.hashCode()); // The Object is Same | hashcode :918221580
         * }
         * roseObject1.show(); // RoseApartmentSingleton.show() | I'm from Singleton
         * Design Pattern!!
         * 
         * System.out.println(".......................................");
         * 
         * // Eger Initialization
         * EgerRosePattern egerObject1 = EgerRosePattern.getEgerRosePattern();
         * EgerRosePattern egerObject2 = EgerRosePattern.getEgerRosePattern();
         * 
         * System.out.println("EgerObject1 : "+egerObject1.hashCode());
         * System.out.println("EgerObject2 : "+egerObject2.hashCode());
         * 
         */
        
        // Breaking Signleton Pattern
        // 1 Reflection Class
        // RoseSingleton roseObj1 = RoseSingleton.getRoseSingleton();
        // System.out.println(roseObj1.hashCode());

        // Constructor constructor = RoseSingleton.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // RoseSingleton roseObj2 = (RoseSingleton) constructor.newInstance();
        // System.out.println(roseObj2.hashCode());

        // if (!(roseObj1.hashCode()==roseObj2.hashCode())) {
        // System.out.println("Singleton Design Pattern Breaked...");
        // System.out.println(roseObj1.hashCode()+" | "+roseObj2.hashCode());
        // }

        // 2 De-serialization
        // RoseSingleton roseObj1 = RoseSingleton.getRoseSingleton();
        // System.out.println(roseObj1.hashCode()); // 918221580
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        // oos.writeObject(roseObj1);

        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        // RoseSingleton roseobj2 = (RoseSingleton) ois.readObject();
        // System.out.println(roseobj2.hashCode()); // 764308918

        // 3
        RoseSingleton roseObj1 = RoseSingleton.getRoseSingleton();
        System.out.println(roseObj1.hashCode());
        RoseSingleton roseObj2 = (RoseSingleton) roseObj1.clone();
        System.out.println(roseObj2.hashCode());


    }
}
