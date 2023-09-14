package rikkeiacademy.Session04;

import java.util.Scanner;

public class ChuanBi_ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn chức năng:");
        System.out.println("1. Chuyển Celsius thành Fahrenheit.");
        System.out.println("2. Chuyển Fahrenheit thành Celsius.");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập nhiệt độ Celsius: ");
                double cel = scanner.nextDouble();
                double convertedFah = convertCelToFah(cel);
                System.out.println(cel + " độ Celsius tương đương " + convertedFah + " độ Fahrenheit.");
                break;
            case 2:
                System.out.println("Nhập nhiệt độ Fahrenheit");
                double fah = scanner.nextDouble();
                double convertedCel = convertFahToCel(fah);
                System.out.printf("%.2f độ Fahrenheit tương đương %.2f độ Celsius.", fah, convertedCel);
                break;
            default:
                System.out.println("Số nhập không hợp lệ");
        }
    }

    public static double convertCelToFah(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertFahToCel(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
