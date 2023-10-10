package rikkeiacademy.Session15;

import java.util.Scanner;

public class TinhFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Bước 1: Nhập dữ liệu
        while (true) {
            try {
                System.out.print("Nhập số Fibonacci thứ n: ");
                n = Integer.parseInt(scanner.nextLine());
                break; // Thoát khỏi vòng lặp nếu nhập đúng
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên dương.");
            }
        }

        // Bước 2: Kiểm tra điều kiện n là số nguyên dương
        if (n <= 0) {
            System.out.println("Lỗi: n phải là một số nguyên dương.");
        } else {
            // Bước 3: Tính số Fibonacci thứ n
            long fibonacci = tinhFibonacci(n);

            // Bước 4: Hiển thị kết quả
            System.out.println("Số Fibonacci thứ " + n + " là " + fibonacci);
        }

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }

    // Hàm để tính số Fibonacci thứ n
    public static long tinhFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fib1 = 0, fib2 = 1, fibonacci = 0;
        for (int i = 2; i <= n; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }
}
