package rikkeiacademy.Session04;

import java.util.Arrays;
import java.util.Scanner;

public class ChuanBi_ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        String array = Arrays.toString(arr);
        String arrayString = Arrays.toString(reverseArray(arr));

        System.out.println("Mảng nhập vào: " + array);
        System.out.println("Mảng sau khi đảo: " + arrayString);
    }

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Hoán đổi giá trị của phần tử arr[left] và arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Di chuyển về phía trước và sau
            left++;
            right--;
        }
        return arr;
    }
}
