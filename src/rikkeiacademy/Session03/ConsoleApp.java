package rikkeiacademy.Session03;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Nhập số nguyên (ấn 0 để thoát): ");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Thoát ứng dụng.");
                System.exit(0);
            }

            System.out.println("*****************MENU******************");
            System.out.println("1. Kiểm tra số chẵn/lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số hoàn hảo");
            System.out.println("4. In demo.ra các số chia hết cho 3 và 5 trong khoảng 1-" + number);
            System.out.println("5. Tính tổng các ước số của " + number);
            System.out.println("6. Tính tổng các số nguyên tố trong khoảng 1-" + number);
            System.out.println("7. Nhập 2 số nguyên (number1, number2), kiểm tra number có trong khoảng (number1,number2)");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng (1-8): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn");
                    } else {
                        System.out.println(number + " là số lẻ");
                    }
                    break;
                case 2:
                    if (isPrime(number)) {
                        System.out.println(number + " là số nguyên tố");
                    } else {
                        System.out.println(number + " không là số nguyên tố");
                    }
                    break;
                case 3:
                    if (isPerfect(number)) {
                        System.out.println(number + " là số hoàn hảo");
                    } else {
                        System.out.println(number + " không là số hoàn hảo");
                    }
                    break;
                case 4:
                    printDivisibleBy3And5(number);
                    break;
                case 5:
                    int sumOfDivisors = sumOfDivisors(number);
                    System.out.println("Tổng các ước số của " + number + " là " + sumOfDivisors);
                    break;
                case 6:
                    int sumOfPrimes = sumOfPrimesInRange(1, number);
                    System.out.println("Tổng các số nguyên tố trong khoảng 1-" + number + " là " + sumOfPrimes);
                    break;
                case 7:
                    System.out.print("Nhập số nguyên 1: ");
                    int number1 = scanner.nextInt();
                    System.out.print("Nhập số nguyên 2: ");
                    int number2 = scanner.nextInt();
                    if (isInRange(number, number1, number2)) {
                        System.out.println(number + " nằm trong khoảng (" + number1 + "," + number2 + ")");
                    } else {
                        System.out.println(number + " không nằm trong khoảng (" + number1 + "," + number2 + ")");
                    }
                    break;
                case 8:
                    System.out.println("Thoát ứng dụng.");
                    System.exit(0);
                default:
                    System.out.println("Chọn chức năng không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm kiểm tra số hoàn hảo
    public static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    // Hàm in demo.ra các số chia hết cho 3 và 5 trong khoảng 1-number
    public static void printDivisibleBy3And5(int number) {
        System.out.println("Các số chia hết cho 3 và 5 trong khoảng 1-" + number + ":");
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Hàm tính tổng các ước số của number
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Hàm tính tổng các số nguyên tố trong khoảng từ start đến end
    public static int sumOfPrimesInRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Hàm kiểm tra số có trong khoảng (number1, number2)
    public static boolean isInRange(int number, int number1, int number2) {
        return number >= number1 && number <= number2;
    }
}
