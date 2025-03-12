
enum Day{

    SUNDAY, MONDAY, TUESDAY, WEDENSDAY, THURSEDAY, FIRDAY, SATURDAY;

    protected int lower;
    
    public String disp(){
        return this.name();
    }
}


public class EnumDemo3 {
        public static void main(String[] args) {
            Day monday = Day.MONDAY;                
            System.out.println(monday.disp());      // MONDAY

            Day tuesDay = Day.TUESDAY;                
            System.out.println(tuesDay.disp());      // TUESDAY
        }
}
