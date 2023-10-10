package rikkeiacademy.Session15;

import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        try {
            // Bước 1: Nhập dữ liệu
            System.out.print("Nhập số thứ nhất: ");
            a = scanner.nextInt();
            System.out.print("Nhập số thứ hai: ");
            b = scanner.nextInt();
        } catch (Exception e) {
            // Xử lý ngoại lệ khi người dùng nhập không phải số nguyên
            System.out.println("Lỗi: Vui lòng nhập số nguyên.");
            scanner.close();
            return;
        }

        // Bước 2: Kiểm tra điều kiện cả hai số bằng 0
        if (a == 0 && b == 0) {
            System.out.println("Lỗi: Cả hai số đều bằng 0.");
        } else {
            // Bước 3: Tìm ước chung lớn nhất (UCLN)
            int ucln = timUCLN(a, b);

            // Bước 4: Hiển thị kết quả
            System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là " + ucln);
        }

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }

    // Hàm để tìm UCLN của hai số nguyên
    public static int timUCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return timUCLN(b, a % b);
        }
    }
}
