package Generics;

enum Day{



}

public class GenericDemo1 {

    public static void main(String[] args) {
        
        Box1 obj = new Box1();

        obj.setX(new Integer(113)); 

        Integer y = (Integer)obj.getX();

        System.out.println(y);      // 113

        // --------------------------------

        Demo1<String> obj1 = new Demo1<>();     // Class is type safe now

        obj1.setX("Pune");

        String x = obj1.getX();                 // Type Casting isn't required
        
        System.out.println(x);      // Pune

        // --------------------------------

        Demo1<Byte> obj3 = new Demo1<>();
        Demo1<Short> obj4 = new Demo1<>();
        Demo1<Long> obj5 = new Demo1<>();
        Demo1<Character> obj6 = new Demo1<>();
        Demo1<Boolean> obj7 = new Demo1<>();
        

        // --------------------------------

        Demo2<String, Integer> obj2 = new Demo2<>("Age", 45);

        String key = obj2.getKey();

        Integer value = obj2.getValue();

        System.out.println(key+"\t"+value);     // Age     45
    }
}
