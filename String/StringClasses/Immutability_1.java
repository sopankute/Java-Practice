package String.StringClasses;

public class Immutability_1 {

    public static void main(String[] args) {
        
        String name = "Raman";
        System.out.println(name+" | "+name.hashCode()); // Raman | 78726315
        
        name = "Shyam";
        System.out.println(name+" | "+name.hashCode()); // Shyam | 79869904
        
        name = name + " kumar";
        System.out.println(name+" | "+name.hashCode()); // Shyam kumar | -1218226332

    }
}
