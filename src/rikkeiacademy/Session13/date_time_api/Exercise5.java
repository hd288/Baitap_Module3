package rikkeiacademy.Session13.date_time_api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise5 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
