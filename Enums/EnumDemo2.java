

public enum EnumDemo2 {
 
    WINTER, SPRING, SUMMER, FALL;  
    
    public static void main(String[] args) {
        EnumDemo2[] values = EnumDemo2.values();
        for (EnumDemo2 e : values) {
            System.out.print(e.ordinal()+"  ");     // 0  1  2  3  
        }
    }

}
