
enum Day{

    SUNDAY("sunday"), 
    MONDAY("monday"), 
    TUESDAY("tuesday"), 
    WEDENSDAY("wedensday"), 
    THURSEDAY("thursday"), 
    FIRDAY("friday"), 
    SATURDAY("saturday");

    private String lower;
    
    private Day(String lower){
        this.lower = lower;
    }

    public String getLower() {
        return lower;
    }

}

public class EnumDemo4 {
    public static void main(String[] args) {
        // Day friday = Day.FIRDAY;
        System.out.println(Day.FIRDAY.getLower());
    }
}
