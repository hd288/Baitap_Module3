package rikkei.academy;

import java.util.Scanner;

public class TinhTienVeXeBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tuổi của người đi xe: ");
        int tuoi = scanner.nextInt();

        int giaVe = tinhGiaVe(tuoi);
        if (giaVe == 0) {
            System.out.println("Miễn phí vé.");
        } else {
            System.out.println("Tiền vé: " + giaVe + " đồng.");
        }
    }

    public static int tinhGiaVe(int tuoi) {
        if (tuoi < 6 || tuoi >= 60) {
            return 0;
        } else if (tuoi < 18) {
            return 5000;
        } else if (tuoi < 22) {
            return 7000;
        } else {
            return 10000;
        }
    }
}