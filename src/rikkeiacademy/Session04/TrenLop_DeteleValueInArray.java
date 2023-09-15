package rikkeiacademy.Session04;

import java.util.Arrays;
import java.util.Scanner;

public class TrenLop_DeteleValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int size = scanner.nextInt();
        int[] arrNum = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị phần tử thứ: " + (i));
            arrNum[i] = scanner.nextInt();
        }
        System.out.println("mảng vừa nhập là: " + Arrays.toString(arrNum));
        System.out.println("Nhập phần tử cần tìm: ");
        int findValue = scanner.nextInt();
        int delIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arrNum[i] == findValue) {
                delIndex = i;
                break;
            }
        }
        if (delIndex != -1) {
            for (int i = delIndex; i < size - 1; i++) {
                arrNum[i] = arrNum[i + 1];
            }
            size--;
            arrNum = Arrays.copyOf(arrNum, size);
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(arrNum));
        } else {
            System.out.println("Không thấy giá trị cần xóa");
        }
    }
}
