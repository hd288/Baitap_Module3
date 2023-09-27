package rikkeiacademy.Session04;

import java.util.Arrays;
import java.util.Scanner;

public class Weekends_ConsoleApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến mảng và số phần tử
        int[] arr = null;
        int n = 0;

        while (true) {
            System.out.println("**********************MENU************************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In các phần tử giá trị chẵn trong mảng và tính tổng");
            System.out.println("4. In các phần tử có giá trị là số nguyên tố và tính tổng");
            System.out.println("5. In demo.ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng giảm dần");
            System.out.println("7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao nhiêu phần tử có giá trị là m");
            System.out.println("8. Thoát");
            System.out.println("**************************************************");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập giá trị các phần tử mảng
                    System.out.print("Nhập số phần tử của mảng: ");
                    n = scanner.nextInt();
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    // Hiển thị giá trị các phần tử mảng
                    if (arr != null) {
                        System.out.print("Các phần tử của mảng: ");
                        for (int i : arr) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 3:
                    // In các phần tử giá trị chẵn và tính tổng
                    if (arr != null) {
                        int sumEven = 0;
                        System.out.print("Các phần tử giá trị chẵn trong mảng: ");
                        for (int i : arr) {
                            if (i % 2 == 0) {
                                System.out.print(i + " ");
                                sumEven += i;
                            }
                        }
                        System.out.println();
                        System.out.println("Tổng các phần tử giá trị chẵn: " + sumEven);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 4:
                    // In các phần tử là số nguyên tố và tính tổng
                    if (arr != null) {
                        int sumPrime = 0;
                        System.out.print("Các phần tử là số nguyên tố trong mảng: ");
                        for (int i : arr) {
                            if (isPrime(i)) {
                                System.out.print(i + " ");
                                sumPrime += i;
                            }
                        }
                        System.out.println();
                        System.out.println("Tổng các phần tử là số nguyên tố: " + sumPrime);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 5:
                    // In phần tử lớn nhất và nhỏ nhất
                    if (arr != null) {
                        int max = arr[0];
                        int min = arr[0];
                        for (int i : arr) {
                            if (i > max) {
                                max = i;
                            }
                            if (i < min) {
                                min = i;
                            }
                        }
                        System.out.println("Phần tử lớn nhất trong mảng: " + max);
                        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 6:
                    // Sắp xếp mảng giảm dần
                    if (arr != null) {
                        Arrays.sort(arr);
                        reverseArray(arr);
                        System.out.print("Mảng sau khi sắp xếp giảm dần: ");
                        for (int i : arr) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 7:
                    // Thống kê giá trị m
                    if (arr != null) {
                        System.out.print("Nhập giá trị số nguyên (m): ");
                        int m = scanner.nextInt();
                        int count = countOccurrences(arr, m);
                        System.out.println("Trong mảng có " + count + " phần tử có giá trị là " + m);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 8:
                    // Thoát
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    // Kiểm tra số nguyên tố
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Đảo ngược mảng
    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Đếm số lần xuất hiện của m trong mảng
    private static int countOccurrences(int[] arr, int m) {
        int count = 0;
        for (int i : arr) {
            if (i == m) {
                count++;
            }
        }
        return count;
    }
}
