package rikkeiacademy.Session15;

import java.util.Scanner;

public class KiemTraNgayThangNam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        try {
            validateDate(day, month, year);
            System.out.println("Ngày tháng năm hợp lệ.");
        } catch (Exception e) {
            System.out.println("Lỗi: Ngày tháng năm không hợp lệ.");
        }

        scanner.close();
    }

    public static void validateDate(int day, int month, int year) throws Exception {
        if (year <= 0) {
            throw new Exception("Năm không hợp lệ.");
        }

        if (month < 1 || month > 12) {
            throw new Exception("Tháng không hợp lệ.");
        }

        int maxDaysInMonth;
        if (month == 2) {
            if (isLeapYear(year)) {
                maxDaysInMonth = 29;
            } else {
                maxDaysInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDaysInMonth = 30;
        } else {
            maxDaysInMonth = 31;
        }

        if (day < 1 || day > maxDaysInMonth) {
            throw new Exception("Ngày không hợp lệ.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}