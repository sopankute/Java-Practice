package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent{

    int x = 12;
    Parent(){
        System.out.println("Parent Constructor.");
    }

}

class Child extends Parent implements Serializable{
    int y = 13;
    Child(){
        System.out.println("Child Constructor.");
    }
}

public class SerializationDemo3 {
    public static void main(String[] args) throws Exception {
        
        Child childObject1 = new Child();
        System.out.println("Serialization : x = "+childObject1.x+" | y = "+childObject1.y);

        FileOutputStream fosObject = new FileOutputStream("qwe.txt");
        ObjectOutputStream oosObject = new ObjectOutputStream(fosObject);
        oosObject.writeObject(childObject1);

        System.out.println("before De-Serialization");
        
        FileInputStream fisObject = new FileInputStream("qwe.txt");
        ObjectInputStream oisObject = new ObjectInputStream(fisObject);
        Child childObject2 = (Child) oisObject.readObject();            // call Parent constructor

        System.out.println("De-Serialization : x = "+childObject2.x+" | y = "+childObject2.y);

        fosObject.close();
        oosObject.close();
        fisObject.close();
        oisObject.close();
    }
}
