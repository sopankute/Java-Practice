

public class EnumDemo1 {

    public enum Season { WINTER, SPRING, SUMMER, FALL }  

    public static void main(String[] args) {
        
        System.out.println(Season.valueOf("SPRING"));

        System.out.println(Season.valueOf("SUMMER").ordinal());
    }
}
