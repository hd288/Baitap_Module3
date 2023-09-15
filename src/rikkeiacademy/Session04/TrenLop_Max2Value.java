package rikkeiacademy.Session04;

import java.util.Arrays;
import java.util.Scanner;

public class TrenLop_Max2Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] arrIntergers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arrIntergers[i] = scanner.nextInt();
        }
        System.out.println("mảng vừa nhập là: " + Arrays.toString(arrIntergers));
        int maxValue = arrIntergers[0];
        int maxValue2 = arrIntergers[1];  // hoặc Integer.MIN_VALUE;

        for (int i = 1; i < arrIntergers.length; i++) {
            if (arrIntergers[i] > maxValue) {
                maxValue2 = maxValue;
                maxValue = arrIntergers[i];
            } else if (arrIntergers[i] > maxValue2 && arrIntergers[i] != maxValue) {
                maxValue2 = arrIntergers[i];
            }
        }

        System.out.println("Phần tử lớn thứ hai trong mảng là: " + maxValue2);
    }
}
