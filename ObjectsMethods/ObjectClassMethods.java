package ObjectsMethods;

public class ObjectClassMethods {

    public static void main(String[] args) {
        
        Object obj1 = new Object();
        Object obj2 = obj1;
        Object obj3 = new Object();
        System.out.print("equals() : ");
        System.out.print(obj1.equals(obj2)+"  |  ");
        System.out.println(obj1.equals(obj3));


        System.out.println("obj1 : "+obj1.hashCode()+" obj2 : "+obj2.hashCode()+" Obj3 : "+obj3.hashCode());
    }
}
