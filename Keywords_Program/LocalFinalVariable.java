package Keywords_Program;

public class LocalFinalVariable {

    public static void main(String[] args) {
        
        
        final int x = 67;
        final int y;            

        // x=43;                       // can't re-Initialize(Can't change)
        System.out.println(x);      // 67

        // System.out.println(y);  // Error : without initialization can't use local final variable.
        y = 89;
        System.out.println(y);      // 89

        
        
    }

}
