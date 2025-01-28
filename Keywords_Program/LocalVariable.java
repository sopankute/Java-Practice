package Keywords_Program;

public class LocalVariable {

    static int y;   
    int z;  
    
    public static void main(String[] args) {
        
        int x;      

        // System.out.println(x);       // Local varibles must be initialized before using them.
        System.out.println(y);
        // System.out.println(z);      // Error : non static

        x=11;
        System.out.println(x);

    }
}

