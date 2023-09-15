package demo;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng ban đầu: ");
        int size = scanner.nextInt();
        int[] beforeArr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            beforeArr[i] = scanner.nextInt();
        }
        int[] newArray = beforeArr;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm phần tử vào cuối mảng.");
            System.out.println("2. Thêm phần tử vào đầu mảng.");
            System.out.println("3. Thêm phần tử vào vị trí bất kỳ.");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Ứng dụng kết thúc.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị phần tử: ");
                    int element1 = scanner.nextInt();
                    newArray = addToEnd(newArray, element1);
                    break;
                case 2:
                    System.out.print("Nhập giá trị phần tử: ");
                    int element2 = scanner.nextInt();
                    newArray = addToStart(newArray, element2);
                    break;
                case 3:
                    System.out.print("Nhập giá trị phần tử: ");
                    int element3 = scanner.nextInt();
                    System.out.print("Nhập vị trí index: ");
                    int index = scanner.nextInt();
                    newArray = addToIndex(newArray, element3, index);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }

            System.out.println("Mảng hiện tại: " + Arrays.toString(newArray));
        }
    }

    public static int[] addToEnd(int[] arr, int element) {
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[arr.length] = element;
        return newArray;
    }

    public static int[] addToStart(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 1, arr.length);
        newArray[0] = element;
        return newArray;
    }

    public static int[] addToIndex(int[] arr, int element, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Vị trí index không hợp lệ.");
            return arr;
        }

        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(arr, index, newArray, index + 1, arr.length - index);
        return newArray;
    }
}