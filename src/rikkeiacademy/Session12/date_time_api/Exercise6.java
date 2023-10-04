package rikkeiacademy.Session12.date_time_api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise6 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1996, 9, 4);

        System.out.println("Age: " + (ChronoUnit.YEARS.between(localDate, LocalDate.now())));
    }

}
