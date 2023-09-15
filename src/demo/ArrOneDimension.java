package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrOneDimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài mảng: ");
        int length = scanner.nextInt();
        if (length <= 0 || length > 5) {
            System.out.println("Số lượng phần tử không hợp lệ.");
            return;
        }
        int[] array = new int[length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            int element = (int) (Math.random() * 1000);

//            System.out.println("Nhập phần tử thứ " + (i + 1));
//            int element = scanner.nextInt();

            array[i] = element;
            sum += array[i];

        }

        String arrayString = Arrays.toString(array);
        System.out.println("Mảng của chúng ta là: " + arrayString);
        for (int loop = 1; loop <= 2; loop++) {
            for (int i = 0; i < array.length; i++) {
                if (loop == 1) {
                    // First loop: Check for even values in the array
                    if (array[i] % 2 == 0) {
                        System.out.println("Phần tử thứ " + (i + 1) + " có giá trị là chẵn: " + array[i]);
                    }
                } else {
                    // Second loop: Check for even indices in the array
                    if (i % 2 == 0) {
                        System.out.println("Phần tử có giá trị " + array[i] + " có chỉ số là chẵn: " + i);
                    }
                }
            }
        }
        System.out.println("Tổng giá trị các phần tử là: " + sum);
    }
}
