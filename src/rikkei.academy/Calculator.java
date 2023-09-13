package rikkei.academy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập phép toán (+, -, *, /, %): ");
        char operator = scanner.nextLine().charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Lỗi: Phép toán không hợp lệ.");
        }

        System.out.println("Kết quả: " + result);
    }
}

