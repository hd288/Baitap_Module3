package rikkeiacademy.Session04;

import java.util.Arrays;
import java.util.Scanner;

public class TrenLop_AddValueToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Nhập giá trị phần tử mới: ");
        int newValue = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int newIndex = scanner.nextInt();

        if (newIndex < 0 || newIndex > size - 1) {
            System.out.println("Không hợp lệ. ");
        } else {
            int[] newArr = new int[size + 1];
            System.arraycopy(arr, 0, newArr, 0, newIndex);
            System.out.println(Arrays.toString(newArr));
            newArr[newIndex] = newValue;
            System.arraycopy(arr, newIndex, newArr, newIndex + 1, arr.length - newIndex);
            System.out.println(Arrays.toString(newArr));
        }

    }
}
