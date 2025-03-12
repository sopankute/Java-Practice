package Generics;

public class GenericDemo2 {

    public static <T>  void display(T [] arr){
        for (T e : arr) {
            System.out.print(e+"  ");
        }
    }
    
    public static void main(String[] args) {
        
        Integer [] intArray = new Integer[]{2,3,4,5}; 

        String [] strArray = {"Pune", "Mumbai", "Nagpur"};

        // GenericDemo2 obj = new GenericDemo2();
        
        display(intArray);
        display(strArray);


    }
}
