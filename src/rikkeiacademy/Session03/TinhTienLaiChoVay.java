package rikkeiacademy.Session03;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền cho vay
        System.out.print("Nhập số tiền cho vay: ");
        double soTienChoVay = scanner.nextDouble();

        // Nhập tỷ lệ lãi suất hàng năm (dưới dạng phần trăm)
        System.out.print("Nhập tỷ lệ lãi suất hàng năm (%): ");
        double tyLeLaiSuatNam = scanner.nextDouble();

        // Nhập số tháng cho vay
        System.out.print("Nhập số tháng cho vay: ");
        int soThangChoVay = scanner.nextInt();

        double tyLeLaiSuatThang = (tyLeLaiSuatNam / 12) / 100;

        double tienLai = 0;

        for (int thang = 1; thang <= soThangChoVay; thang++) {
            double tienLaiThang = tinhTienLaiThang(soTienChoVay, tyLeLaiSuatThang, thang);
            tienLai += tienLaiThang;
        }

        // Tính tổng số tiền có được khi hết thời hạn cho vay
        double tongSoTien = soTienChoVay + tienLai;

        System.out.println("Tổng số tiền có được khi hết thời hạn cho vay là: " + tongSoTien);

        scanner.close();
    }

    public static double tinhTienLaiThang(double soTienChoVay, double tyLeLaiSuatThang, int thang) {
        double tienLaiThang = soTienChoVay * tyLeLaiSuatThang * thang;
        return tienLaiThang;
    }
}
