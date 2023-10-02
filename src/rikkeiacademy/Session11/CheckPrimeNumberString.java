package rikkeiacademy.Session11;

import java.util.Scanner;
import java.util.Stack;

public class CheckPrimeNumberString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi số:");
        String input = sc.nextLine();

        boolean isPrimeString = checkPrimeNumberString(input);
        if (isPrimeString) {
            System.out.println("Chuỗi là dãy số nguyên tố.");
        } else {
            System.out.println("Chuỗi không phải là dãy số nguyên tố.");
        }
    }

    public static boolean checkPrimeNumberString(String input) {
        Stack<Character> stack = new Stack<>();

        // Đưa các ký tự của chuỗi vào stack
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                stack.push(currentChar);
            }
        }

        // Kiểm tra xem tất cả các số trên stack có phải là số nguyên tố hay không
        while (!stack.isEmpty()) {
            char digitChar = stack.pop();
            int digit = Character.getNumericValue(digitChar);
            if (!isPrime(digit)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

