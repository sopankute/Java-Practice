package PrototypeDesignPattern;

public class Test {

    public static void main(String[] args) {

        System.out.println("while creating an object this will take some time to load data");
        NetworkConnection con = new NetworkConnection();
        con.setIp("192.34.4.4");
        con.loadVeryImpData();

        System.out.println(con);
        System.out.println("But now coz of cloning,this will not take much time.\n\n");

        NetworkConnection con1=null;
        try {
            con1 = (NetworkConnection) con.clone();
            // System.out.println("But coz cloning now this will not take much time.\n\n");
            System.out.println(con1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        con1.setIp("191.56.97.1");      // shallow copy changes the original data
        System.out.println(con1);
    }
}
