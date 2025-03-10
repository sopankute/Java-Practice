
enum Color {
    RED,
    GREEN,
    BLUE;
}

public class EnumDemo {

    enum Color {
        RED,
        GREEN,
        BLUE;
    }

    public static void main(String[] args) {

        System.out.println(Color.RED.ordinal());    // 0

        Color c1 = Color.GREEN;
        System.out.println(c1+"\t"+c1.ordinal());   // GREEN   1

        System.out.println(c1.name());              // GREEN 

        System.out.println(Color.valueOf("BLUE"));  // BLUE

    }
}
