
package Keywords_Program;

public class StaticVariable {

    static int x = 10;
    int y=12;

    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();

        obj1.x += 10;
        obj2.x +=20;

        System.out.println(obj1.x+" | "+obj2.y);
    }
}
