package rikkeiacademy.Session03;

import java.util.Scanner;

public class ChuanBi_SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int num = scanner.nextInt();
        scanner.close();
        if (kiemTraSoNguyenTo(num)) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " không phải là số nguyên tố.");
        }
    }

    public static boolean kiemTraSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}