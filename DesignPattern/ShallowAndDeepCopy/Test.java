package ShallowAndDeepCopy;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        NetworkConnection con = new NetworkConnection();
        con.setIp("192.34.4.4");
        con.loadVeryImpData();
        System.out.println(con);

        try {
            NetworkConnection con1 = (NetworkConnection) con.clone();
            con.getDomains().remove(0);
            System.out.println(con1);
            
            NetworkConnection con2 = (NetworkConnection) con.clone();
            System.out.println(con2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        System.out.println(con);
    }
}
