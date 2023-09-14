package rikkeiacademy.Session04;

import java.util.Arrays;
import java.util.Scanner;

public class ChuanBi_FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng: ");
        int length = scanner.nextInt();
        if (length <= 0 || length > 20) {
            System.out.println("Số lượng phần tử không hợp lệ.");
            return;
        }
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        int flag = array[0];
        int flagIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < flag) {
                flag = array[i];
                flagIndex = i + 1;
            }
        }

        String arrayString = Arrays.toString(array);
        System.out.println("Mảng của bạn là:");
        System.out.println(arrayString);
        System.out.printf("Số nhỏ nhất trong mảng là: %d\n Nằm ở vị trí thứ %d trong mảng", flag, flagIndex);
    }
}
