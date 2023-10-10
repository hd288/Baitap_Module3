package rikkeiacademy.Session15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuyenChuoiSangSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        List<Integer> listSoNguyen = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            char charAtI = inputString.charAt(i);
            try {
                int soNguyen = Integer.parseInt(String.valueOf(charAtI));
                listSoNguyen.add(soNguyen);
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Ký tự '" + charAtI + "' không phải số nguyên. Đã thay thế bằng giá trị 0.");
                listSoNguyen.add(0);
            }
        }

        System.out.print("Số nguyên từ chuỗi: ");
        for (Integer soNguyen : listSoNguyen) {
            System.out.print(soNguyen);
        }

        scanner.close();
    }
}

