package GarbageCollector;
import java.lang.*;

public class GarbageClass {


    public static void main(String[] args) {
        
        Runtime r = Runtime.getRuntime();
        r.gc();
        // System.out.println("Total Memory : "r.freeMemory());
        System.out.println("GarbageClass.main()");
        System.gc();
    }
}
