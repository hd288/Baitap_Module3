package rikkeiacademy.Session15;

import java.util.Scanner;

public class TimSoLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            // Nếu mảng rỗng, ném ngoại lệ và hiển thị thông báo lỗi
            try {
                throw new IllegalArgumentException("Mảng không có phần tử nào.");
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        } else {
            // Khai báo mảng và nhập các phần tử từ người dùng
            int[] mang = new int[n];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                mang[i] = scanner.nextInt();
            }

            // Tìm số lớn nhất trong mảng
            int soLonNhat = mang[0];
            for (int i = 1; i < n; i++) {
                if (mang[i] > soLonNhat) {
                    soLonNhat = mang[i];
                }
            }

            // In ra số lớn nhất
            System.out.println("Số lớn nhất trong mảng là: " + soLonNhat);
        }

        scanner.close();
    }
}
