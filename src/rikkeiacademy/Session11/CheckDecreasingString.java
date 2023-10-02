package rikkeiacademy.Session11;

import java.util.Scanner;
import java.util.Stack;

public class CheckDecreasingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String input = sc.nextLine();

        boolean isDecreasing = checkDecreasingString(input);
        if (isDecreasing) {
            System.out.println("Chuỗi là dãy giảm dần.");
        } else {
            System.out.println("Chuỗi không phải là dãy giảm dần.");
        }
    }

    public static boolean checkDecreasingString(String input) {
        Stack<Character> stack = new Stack<>();
        boolean isDecreasing = true;

        // Đưa các ký tự của chuỗi vào stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // So sánh các ký tự trong chuỗi với ký tự đầu tiên trong stack
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char topChar = stack.peek();

            if (currentChar > topChar) {
                isDecreasing = false;
                break;
            }
        }

        return isDecreasing;
    }
}

