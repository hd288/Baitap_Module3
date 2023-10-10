package rikkeiacademy.Session15;

import java.util.Scanner;

public class XuLyNgoaiLeChia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập dữ liệu
        System.out.print("Nhập số bị chia: ");
        int soBiChia = scanner.nextInt();
        System.out.print("Nhập số chia: ");
        int soChia = scanner.nextInt();

        // Bước 2: Xử lý ngoại lệ
        try {
            if (soChia == 0) {
                throw new ArithmeticException("Lỗi: Số chia không thể bằng 0.");
            }

            // Bước 3: Thực hiện phép chia
            int ketQua = soBiChia / soChia;

            // Bước 4: Hiển thị kết quả
            System.out.println("Kết quả phép chia: " + ketQua);
        } catch (ArithmeticException e) {
            // Xử lý ngoại lệ và hiển thị thông báo lỗi
            System.out.println(e.getMessage());
        } finally {
            // Bước 5: Kết thúc chương trình
            scanner.close();
        }
    }
}

