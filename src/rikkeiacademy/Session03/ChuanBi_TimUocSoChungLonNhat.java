package rikkeiacademy.Session03;

import java.util.Scanner;

public class ChuanBi_TimUocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int uocChungLonNhat = timUocSoChungLonNhat(a, b);

        System.out.println("ƯCLN của " + a + " và " + b + " là: " + uocChungLonNhat);

        scanner.close();
    }

    public static int timUocSoChungLonNhat(int a, int b) {
        // Sử dụng thuật toán Euclid để tìm ƯCLN
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Trả về giá trị tuyệt đối của ƯCLN
    }
}

