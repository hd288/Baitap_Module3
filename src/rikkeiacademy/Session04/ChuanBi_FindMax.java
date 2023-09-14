package rikkeiacademy.Session04;

import java.util.Scanner;

public class ChuanBi_FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng: ");
        int length = scanner.nextInt();
        if (length <= 0 || length > 20) {
            System.out.println("Số lượng phần tử không hợp lệ.");
            return;
        }
        int[] wealths = new int[length]; // Mảng lưu trữ giá trị tài sản

        // Nhập giá trị tài sản của các tỷ phú
        for (int i = 0; i < wealths.length; i++) {
            System.out.print("Nhập giá trị tài sản của tỷ phú thứ " + (i + 1) + " (tỉ đô): ");
            wealths[i] = scanner.nextInt();
        }

        // Tìm giá trị tài sản lớn nhất và vị trí của nó trong danh sách
        int maxWealth = wealths[0];
        int indexOfMaxWealth = 0;

        for (int i = 1; i < wealths.length; i++) {
            if (wealths[i] > maxWealth) {
                maxWealth = wealths[i];
                indexOfMaxWealth = i;
            }
        }

        // In ra giá trị tài sản lớn nhất và vị trí của nó
        System.out.println("Giá trị tài sản lớn nhất là: " + maxWealth + " tỷ đô");
        System.out.println("Nằm ở vị trí thứ " + (indexOfMaxWealth + 1) + " trong danh sách.");
    }
}