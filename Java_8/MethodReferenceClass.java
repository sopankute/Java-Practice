package Java_8;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceClass {

    public static void print(String s){
        System.out.print("  "+s);
    }

    public void show(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        
        
        MethodReferenceClass obj = new MethodReferenceClass();
        List<String> list = Arrays.asList("sunil", "Vishwajit", "mahavir");
        
        // list.forEach(x->System.out.print("  "+x));
        
        list.forEach(MethodReferenceClass::print);
        System.out.println();
        list.forEach(obj::show);


    }
}
