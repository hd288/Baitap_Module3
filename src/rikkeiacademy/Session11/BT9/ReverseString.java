package rikkeiacademy.Session11.BT9;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Stack<Character> stack = new Stack<>();

        // Push các ký tự từ chuỗi vào Stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop và in các ký tự từ Stack để đảo ngược chuỗi
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        System.out.println("Chuỗi sau khi đảo ngược: " + reversedString);
    }
}
