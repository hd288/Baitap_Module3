package rikkeiacademy.Session13.date_time_api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise8 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 5, 5);
        LocalDate localDate1 = LocalDate.of(2023, 5, 25);

        long dayBetween = ChronoUnit.DAYS.between(localDate, localDate1);

        System.out.println(dayBetween);
    }
}
