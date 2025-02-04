package Serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class External implements Externalizable{

    String name;
    int i;
    int j;

    public External(){}

    public External(String name, int i, int j){
        this.name = name;
        this.i = i;
        this.j = j;
    }

    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeObject(name);
        out.writeInt(i);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
        name = (String)in.readObject();
        i = in.readInt();
    }
}

public class ExternalizationDemo1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        External extObject = new External("Ashok", 13, 17);

        System.out.println("Externalization : "+extObject.name+" | "+extObject.i+" | "+extObject.j);

        FileOutputStream fos = new FileOutputStream("zxc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(extObject);

        FileInputStream fis = new FileInputStream("zxc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        External extObject2 = (External) ois.readObject();
        
        System.out.println("Externalization : "+extObject2.name+" | "+extObject2.i+" | "+extObject2.j);

        fos.close();
        oos.close();
        fis.close();
        ois.close();
    }
}
