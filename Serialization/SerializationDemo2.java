package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{

    String username = "user.name123@gmail.com";
    transient String password = "user1241@1243";

    // Bafore writing an object, extracting information  
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        String pwd = "123"+password;
        oos.writeObject(pwd);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
        ois.defaultReadObject();
        String pwd =(String) ois.readObject();
        password = pwd.substring(3);
    }

}


public class SerializationDemo2 {

    
    public static void main(String[] args) throws Exception {
        
        Student objStudent = new Student();

        System.out.println("Serialization : "+objStudent.username+" ... "+objStudent.password);
        
        FileOutputStream fosObject = new FileOutputStream("xyz.txt");
        ObjectOutputStream oosObject = new ObjectOutputStream(fosObject);
        oosObject.writeObject(objStudent);
        
        FileInputStream fisObject = new FileInputStream("xyz.txt");
        ObjectInputStream oisObject = new ObjectInputStream(fisObject);
        Student objStudent2 = (Student) oisObject.readObject();
        
        System.out.println("De-Serialization : "+objStudent2.username+" ... "+objStudent2.password);

        fosObject.close();
        oosObject.close();
        fisObject.close();
        oisObject.close();

    }
}
