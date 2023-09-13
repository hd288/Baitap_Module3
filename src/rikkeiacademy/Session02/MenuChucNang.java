package rikkeiacademy.Session02;

import java.util.Scanner;

public class MenuChucNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        boolean exit = false;

        while (!exit) {
            // In menu
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Chọn một lựa chọn (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    kiemTraChanLe();
                    break;
                case 2:
                    kiemTraSoNguyenTo();
                    break;
                case 3:
                    kiemTraChiaHetCho3();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Ứng dụng đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }

        scanner.close();
    }

    public static void kiemTraChanLe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }

    public static void kiemTraSoNguyenTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
    }

    public static void kiemTraChiaHetCho3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println(number + " chia hết cho 3.");
        } else {
            System.out.println(number + " không chia hết cho 3.");
        }
    }
}

