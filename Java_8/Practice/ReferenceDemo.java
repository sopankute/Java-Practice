package Java_8.Practice;

import java.lang.reflect.Constructor;
import java.util.function.Supplier;

@FunctionalInterface
interface InterfaceDemo {
    public void show1();
}

class InstanceMethodRef {
    public void disp() {
        for (int i = 0; i < 6; i++) {
            System.out.print(i + "  ");
        }
    }
}

class Student{

    public Student(){
        System.out.println("I'm Constructor");
    }
}

public class ReferenceDemo {

    public static void show2() {
        System.out.println("method show2()");
    }

    public static void main(String[] args) {
        // Static Method Reference
        // InterfaceDemo r = ReferenceDemo::show2;
        // r.show1(); 

        // Instance Method Reference
        InstanceMethodRef obj = new InstanceMethodRef();
        Runnable r1 = obj::disp;
        Thread t = new Thread(r1);
        t.start();

        // Constructor Reference
        Supplier<Student> s = Student::new;
        Student object = s.get();
        int code = object.hashCode();
        System.out.println(code);       // sout(s.get().hashcode())
    }

}
