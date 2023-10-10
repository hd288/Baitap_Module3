package rikkeiacademy.Session15;

import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class KiemTraTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.print("Nhập cạnh a: ");
            a = scanner.nextDouble();
            System.out.print("Nhập cạnh b: ");
            b = scanner.nextDouble();
            System.out.print("Nhập cạnh c: ");
            c = scanner.nextDouble();

            kiemTraTamGiac(a, b, c);
            System.out.println("Ba cạnh đã nhập tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số thực cho các cạnh tam giác.");
        } finally {
            scanner.close();
        }
    }

    public static void kiemTraTamGiac(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalTriangleException("Ba cạnh không tạo thành một tam giác hợp lệ.");
        }
    }
}
