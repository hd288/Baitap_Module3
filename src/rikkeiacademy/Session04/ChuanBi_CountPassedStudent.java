package rikkeiacademy.Session04;

import java.util.Arrays;
import java.util.Scanner;

public class ChuanBi_CountPassedStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số sinh viên: ");
        int length = scanner.nextInt();
        if (length <= 0 || length > 30) {
            System.out.println("Số lượng phần tử không hợp lệ.");
            return;
        }
        double[] array = new double[length];

//        for (int i = 0; i < array.length; i++) {
//            double score = Math.random() * 10;
//            array[i] = Math.floor(score * 10.0) / 10.0;
//        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập số điểm của sinh viên thứ " + (i + 1));
            double value = scanner.nextDouble();

            // Kiểm tra điều kiện
            while (value >= 10) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại: ");
                value = scanner.nextDouble();
            }

            array[i] = value;
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                count++;
            }
        }

        String arrayString = Arrays.toString(array);
        System.out.println("Mảng số điểm của sinh viên đã nhập:");
        System.out.printf(arrayString + "\n Số sinh viên đã thi đỗ: %d", count);
    }
}
