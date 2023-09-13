package rikkei.academy.Session02;

import java.util.Scanner;

public class InCacHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // In menu
            System.out.println("Menu:");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("4. Thoát");
            System.out.print("Chọn một lựa chọn (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inHinhChuNhat();
                    break;
                case 2:
                    inTamGiacVuong();
                    break;
                case 3:
                    inTamGiacCan();
                    break;
                case 4:
                    System.out.println("Ứng dụng đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void inHinhChuNhat() {
        int width, height;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        width = scanner.nextInt();
        System.out.print("Nhập chiều cao của hình chữ nhật: ");
        height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inTamGiacVuong() {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều cao của tam giác vuông: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inTamGiacCan() {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều cao của tam giác cân: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
