

public class SwitchStatement {

    public static void beforeJava17Switch(int number){
        String day = null;

        switch(number){
            case 1: 
                day = "Monday";
                break;
            case 2: 
                day = "Tuesday";
                break;
            case 3:
                day = "Wedensday";

            default: System.out.println("No Matching...");
        }
        System.out.println("Day of Today : "+day);
    }

    public static void afterJava17Switch(String day){
        String result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Unknown";
        };
        System.out.println("Day of Today : "+result);
    }

    public static void main(String[] args) {

        // SwitchStatement.beforeJava17Switch(2);

        // SwitchStatement.getDayByString("Tuesday");

        Object obj = new Object();
        System.out.println(obj.toString());

        System.out.println(obj.getClass());

        System.out.println(obj.hashCode());
     
    }
}
