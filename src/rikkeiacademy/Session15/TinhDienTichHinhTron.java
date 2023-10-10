package rikkeiacademy.Session15;

import java.util.Scanner;

public class TinhDienTichHinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double banKinh;

        // Bước 1: Nhập dữ liệu
        while (true) {
            try {
                System.out.print("Nhập bán kính hình tròn: ");
                banKinh = Double.parseDouble(scanner.nextLine());
                break; // Thoát khỏi vòng lặp nếu nhập đúng
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số thực.");
            }
        }

        // Bước 2: Kiểm tra điều kiện giá trị âm
        if (banKinh <= 0) {
            System.out.println("Lỗi: Bán kính không thể nhỏ hơn 0.");
        } else {
            // Bước 3: Tính diện tích hình tròn
            double dienTich = Math.PI * Math.pow(banKinh, 2);

            // Bước 4: Hiển thị kết quả
            System.out.println("Diện tích hình tròn là: " + dienTich);
        }

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }
}

