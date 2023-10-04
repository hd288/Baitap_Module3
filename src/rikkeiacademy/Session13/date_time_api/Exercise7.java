package rikkeiacademy.Session13.date_time_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise7 {
    public static void main(String[] args) {
        String date = "10-04-2023";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);

        System.out.println("Ngày tháng: " + localDate);
    }
}
