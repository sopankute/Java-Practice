package Java_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) throws ParseException {
        
        Date d = new Date();
        System.out.println("Current Date and Time : "+d);      // Thu Feb 06 14:03:34 IST 2025

        // different format
        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        String formaString = format1.format(d);
        System.out.println("Current String Date : "+formaString);                // 02/06/2025

        // String to Date
        Date d1 =   format1.parse(formaString);
        System.out.println("Current Date : "+d1);           // Thu Feb 06 00:00:00 IST 2025

        // Local Date
        LocalDate todayDate = LocalDate.now();
        System.out.println("Only Date : "+todayDate);       //  2025-02-07

        // Local Time
        LocalTime currTime = LocalTime.now();
        System.out.println(currTime);                       // 10:14:43.4150

        // LocalDateTime
        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println(currDateTime);                   // 2025-02-07T10:17:2


        ZonedDateTime d3 = ZonedDateTime.now();
        System.out.println(d3);                             // 2025-02-07T10:23:29.437101700+05:30[Asia/Calcutta]

    }
}
