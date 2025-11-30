package SwitchCase;

public class SwitchCase1 {
    
    public static void main(String[] args) {
        // testSwitch();

        // testSwitch1("SUNDAY");
        // testSwitch1("MONDAY");
        // testSwitch1("THURSDAY");
        // testSwitch1("FRIDAY");
        testSwitch1("xyz");
    }

    public static void testSwitch1(String day){
        
        String str = switch(day){
                        case "SUNDAY", "MONDAY", "TUESDAY" -> {
                            if(day.equals("SUNDAY")){
                                throw new RuntimeException("Holiday");
                            }
                            yield "sunday, monday, tuesday";
                        } 

                        case "WEDENSDAY", "THURSDAY" ->{ 
                             yield "wedensday and thursday"; 
                        } 

                        case "FRIDAY" -> "friday";

                        default -> "this is default case";
                    };

        System.out.println("SwitchCase1.testSwitch1() | Count::"+str);
        
    }

    public static void testSwitch(){
         int x = 2;
        int y = 3;

        switch(x+y){
            case 2:
                System.out.println("OldSwitch.main() | Case-2");
                break;

            case 3:
                System.out.println("OldSwitch.main() | Case-3");
                break;
            
            case 5:
                System.out.println("OldSwitch.main() | Case-5");
            
            default:
                System.out.println("OldSwitch.main() | Deafult-Case");
        }      
    } 
}
