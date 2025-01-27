
package SingletonPattern;

public class EgerRosePattern {
    // object created at time of class loading
    private static EgerRosePattern egerRosePattern = new EgerRosePattern(); 
    private EgerRosePattern(){}
    public static EgerRosePattern getEgerRosePattern(){
        return egerRosePattern;
    }
}
