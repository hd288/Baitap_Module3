package rikkeiacademy.Session15;

import java.util.Scanner;

public class TinhTongHaiSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soThuNhat, soThuHai;

        while (true) {
            try {
                System.out.print("Nhập số thứ nhất: ");
                soThuNhat = Integer.parseInt(scanner.nextLine());
                break; // Thoát khỏi vòng lặp nếu nhập đúng
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập số thứ hai: ");
                soThuHai = Integer.parseInt(scanner.nextLine());
                break; // Thoát khỏi vòng lặp nếu nhập đúng
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
            }
        }

        int tong = soThuNhat + soThuHai;
        System.out.println("Tổng hai số là: " + tong);

        scanner.close();
    }
}
