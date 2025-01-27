class Test1 extends RuntimeException {

    public Test1(String s) {
        super(s); // Call the constructor of RuntimeException
    }
}

class Test2 extends RuntimeException {

    public Test2(String s) {
        super(s); // Call the constructor of RuntimeException
    }
}

public class CustomException {

    public static void main(String[] args) {

        int age = 30;

        if (age > 50) {
            throw new Test1("Too Old man only... ");
        } else {
            throw new Test2("Too Young Man...please wait!");
        }
    }
}
