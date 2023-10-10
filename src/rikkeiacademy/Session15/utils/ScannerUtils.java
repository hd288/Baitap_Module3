package rikkeiacademy.Session15.utils;

import java.util.Scanner;

public class ScannerUtils {

    public static Integer inputInteger(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
    }
}
