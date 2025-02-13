package Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapClass {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);

        map.put(Day.MONDAY, "Temple");
        System.out.println(Day.MONDAY.name());  // MONDAY
        System.out.println(Day.MONDAY.ordinal());   // 1
 
    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDENSDAY, THURSEDAY, FRIDAY, SATURDAY
}

