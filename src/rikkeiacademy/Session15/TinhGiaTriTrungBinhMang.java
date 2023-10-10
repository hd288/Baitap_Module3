package rikkeiacademy.Session15;

import java.util.Scanner;

public class TinhGiaTriTrungBinhMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập số lượng phần tử của mảng: ");
            int size = scanner.nextInt();
            if (size <= 0) {
                throw new IllegalArgumentException();
            }
            int[] arr = new int[size];
            System.out.println("Nhập giá trị cho mảng: ");
            for (int i = 0; i < size; i++) {
                System.out.println("arr[" + i + "] = ");
                arr[i] = scanner.nextInt();
            }
            double average = calculateAverage(arr);
            System.out.println("Giá trị tb của mảng là: " + average);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: mảng không có phần tử.");
        }
    }

    private static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
