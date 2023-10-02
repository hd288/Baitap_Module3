package rikkeiacademy.Session11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Loại bỏ các khoảng trắng và chuyển chuỗi thành chữ thường
        input = input.replaceAll("\\s", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Đưa các ký tự từ chuỗi vào stack và queue
        for (char ch : input.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        // So sánh từng cặp ký tự từ stack và queue
        while (!stack.isEmpty()) {
            char stackChar = stack.pop();
            char queueChar = queue.poll();
            if (stackChar != queueChar) {
                return false; // Không phải là chuỗi Palindrome
            }
        }

        return true; // Là chuỗi Palindrome
    }

    public static void main(String[] args) {
        String input1 = "A man a plan a canal Panama";
        String input2 = "Hello, World!";

        System.out.println("Chuỗi 1 là chuỗi Palindrome: " + isPalindrome(input1));
        System.out.println("Chuỗi 2 là chuỗi Palindrome: " + isPalindrome(input2));
    }
}
