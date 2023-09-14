package rikkeiacademy.Session03;

import java.util.Scanner;

public class TinhChuViDienTichTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        boolean validTriangle = false;
        System.out.println(!validTriangle);
        while (!validTriangle) {
            System.out.print("Nhập độ dài cạnh a của tam giác: ");
            a = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh b của tam giác: ");
            b = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh c của tam giác: ");
            c = scanner.nextDouble();

            if (isTriangle(a, b, c)) {
                validTriangle = true;
                double chuVi = tinhChuViTamGiac(a, b, c);
                double dienTich = tinhDienTichTamGiac(a, b, c);
                System.out.println("Chu vi tam giác là: " + chuVi);
                System.out.println("Diện tích tam giác là: " + dienTich);
            } else {
                System.out.println("Ba cạnh không thoả mãn điều kiện tạo thành tam giác. Vui lòng nhập lại.");
            }
        }

        scanner.close();
    }

    public static boolean isTriangle(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0) && (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double tinhChuViTamGiac(double a, double b, double c) {
        return a + b + c;
    }

    public static double tinhDienTichTamGiac(double a, double b, double c) {
        double p = (a + b + c) / 2; // Nửa chu vi
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

