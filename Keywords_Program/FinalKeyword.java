package Keywords_Program;

public class FinalKeyword {
    
    final int i;
    static final int j;

    // {   i=10; }

    // static{ j=13;} 

    public FinalKeyword(){
        i=11;
        // j=14;   // can’t be initialized in constructors
    }

    public FinalKeyword(int x){
        i=12;
    }

    public static void main(String[] args) {

        FinalKeyword obj1 = new FinalKeyword();
    }

}
