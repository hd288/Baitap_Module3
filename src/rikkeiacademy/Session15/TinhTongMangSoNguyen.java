package rikkeiacademy.Session15;

import java.util.Scanner;

public class TinhTongMangSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] mang = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                mang[i] = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Lỗi: Phần tử không phải số nguyên. Phần tử này sẽ bị bỏ qua.");
                scanner.nextLine(); // Đọc và bỏ qua dòng nhập không hợp lệ
                i--; // Quay lại nhập lại phần tử không hợp lệ
            }
        }

        // Tính tổng các phần tử hợp lệ trong mảng
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += mang[i];
        }

        System.out.println("Tổng các phần tử hợp lệ trong mảng là: " + tong);

        scanner.close();
    }
}

