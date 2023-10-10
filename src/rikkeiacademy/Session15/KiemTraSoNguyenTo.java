package rikkeiacademy.Session15;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soCanKiemTra;

        // Bước 1: Nhập dữ liệu
        while (true) {
            try {
                System.out.print("Nhập một số nguyên: ");
                soCanKiemTra = Integer.parseInt(scanner.nextLine());
                break; // Thoát khỏi vòng lặp nếu nhập đúng
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
            }
        }

        // Bước 2: Kiểm tra điều kiện số không phải số nguyên tố
        if (soCanKiemTra < 2) {
            System.out.println("Lỗi: Số không phải là số nguyên tố.");
        } else {
            // Bước 3: Kiểm tra tính số nguyên tố
            boolean laSoNguyenTo = true;
            for (int i = 2; i <= Math.sqrt(soCanKiemTra); i++) {
                if (soCanKiemTra % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }

            // Bước 4: Hiển thị kết quả
            if (laSoNguyenTo) {
                System.out.println(soCanKiemTra + " là số nguyên tố.");
            } else {
                System.out.println(soCanKiemTra + " không phải là số nguyên tố.");
            }
        }

        // Bước 5: Kết thúc chương trình
        scanner.close();
    }
}

