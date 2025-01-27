package Java_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateTimeClass {

    public static void main(String[] args) {

        // 1. Local Date
        // System.out.println(LocalDate.now()); // 2025-01-09 | yyyy-MM-dd

        // LocalDate currenLocalDate =LocalDate.of(2025, 1, 9);
        // System.out.println(currenLocalDate.getDayOfMonth()); // 9
        // System.out.println(currenLocalDate.getMonth()); // JANUARY
        // System.out.println(currenLocalDate.getMonthValue()); // 1
        // System.out.println(currenLocalDate.getYear()); // 2025

        // LocalDate todayDate = LocalDate.now(); // 2025-01-09 | Today

        // LocalDate prevDay = todayDate.minusDays(10);
        // System.out.println(prevDay); // 2024-12-30 | 10 days ago

        // LocalDate prevMonth = todayDate.minusMonths(5);
        // System.out.println(prevMonth); // 2024-08-09 | 5 months ago

        // LocalDate prevYear = todayDate.minusYears(4);
        // System.out.println(prevYear); // 2021-01-09 | 4 years ago

        // todayDate.plusDays(0)

        // 2. Local Time

        // LocalTime curLocalTime = LocalTime.now();   // 00:47:11.369991500
        // System.out.println(curLocalTime);

        // 3. LocalDateTime
        // LocalDateTime currLocalDateTime = LocalDateTime.now();
        // System.out.println(currLocalDateTime); 

        // 4. ZonedDateTime
        ZonedDateTime curZonedDateTime = ZonedDateTime.now();   // 2025-01-09T00:53:45.404357400+05:30[Asia/Calcutta]
        System.out.println(curZonedDateTime);
    }
}
