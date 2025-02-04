package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Lover implements Serializable{
    String name = "Pandu";
    transient String gFriend = "Priydarshini";      
}

public class SerializationDemo {
    private static FileInputStream fis;
    private static FileOutputStream fos;

    public static void main(String[] args) throws Exception {

        Lover obj = new Lover();
        System.out.println();

        System.out.println("Serialization...............");

        fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        System.out.println(obj.name + "  +  " + obj.gFriend);
        System.out.println("De-Serialization...............");

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Lover obj2 = (Lover) ois.readObject();

        System.out.println(obj2.name + "  +  " + obj2.gFriend);

        fos.close();
        oos.close();
        fis.close();
        ois.close();

    }
}
