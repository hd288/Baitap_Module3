package rikkeiacademy.Session11;

import java.util.Stack;

public class BracketChecker {
    public static boolean isBracketPair(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Không có dấu mở tương ứng
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false; // Dấu đóng không khớp với dấu mở
                }
            }
        }

        // Nếu stack không còn phần tử và đã duyệt hết chuỗi, thì chuỗi đúng
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "{[(fweqwrwe)]}";
        String input2 = "{[(rewrewrew)]";
        String input3 = "([ewrewrewr)";

        System.out.println("Chuỗi 1 có cặp dấu ngoặc đúng: " + isBracketPair(input1));
        System.out.println("Chuỗi 2 có cặp dấu ngoặc đúng: " + isBracketPair(input2));
        System.out.println("Chuỗi 3 có cặp dấu ngoặc đúng: " + isBracketPair(input3));
    }
}

