package rikkeiacademy.Session04;

import java.util.Scanner;

public class TrenLop_MinValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int minValue = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}