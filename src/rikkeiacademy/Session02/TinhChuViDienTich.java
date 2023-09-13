package rikkeiacademy.Session02;

import java.util.Scanner;

public class TinhChuViDienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Chọn một lựa chọn (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tinhChuViDienTichChuNhat(scanner);
                    break;
                case 2:
                    tinhChuViDienTichTamGiac(scanner);
                    break;
                case 3:
                    tinhChuViDienTichHinhTron(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Ứng dụng đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
        scanner.close();
    }

    public static void tinhChuViDienTichChuNhat(Scanner scanner) {
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
    }

    public static void tinhChuViDienTichTamGiac(Scanner scanner) {
        System.out.print("Nhập độ dài cạnh a của tam giác: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh b của tam giác: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh c của tam giác: ");
        double c = scanner.nextDouble();

        if (isTriangle(a, b, c)) {
            double chuVi = a + b + c;
            double p = chuVi / 2; // Nửa chu vi
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Chu vi tam giác: " + chuVi);
            System.out.println("Diện tích tam giác: " + dienTich);
        } else {
            System.out.println("Ba cạnh không thoả mãn điều kiện tạo thành tam giác. Vui lòng nhập lại.");
        }
    }

    public static void tinhChuViDienTichHinhTron(Scanner scanner) {
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = scanner.nextDouble();

        final double PI = 3.14;
        double chuVi = 2 * PI * banKinh;
        double dienTich = PI * (banKinh * banKinh);

        System.out.println("Chu vi hình tròn: " + chuVi);
        System.out.println("Diện tích hình tròn: " + dienTich);
    }

    public static boolean isTriangle(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0) && (a + b > c) && (a + c > b) && (b + c > a);
    }
}
