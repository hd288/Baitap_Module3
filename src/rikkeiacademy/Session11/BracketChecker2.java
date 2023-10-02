package rikkeiacademy.Session11;

import java.util.Stack;


public class BracketChecker2 {
    public static boolean isBracketValid(String expression) {
        Stack<Character> bracketStack = new Stack<>();

        for (char symbol : expression.toCharArray()) {
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                bracketStack.push(symbol);
            } else if (symbol == ')' || symbol == ']' || symbol == '}') {
                if (bracketStack.isEmpty()) {
                    return false; // Không có dấu mở tương ứng
                }
                char top = bracketStack.pop();
                if ((symbol == ')' && top != '(') || (symbol == ']' && top != '[') || (symbol == '}' && top != '{')) {
                    return false; // Dấu đóng không khớp với dấu mở
                }
            }
        }

        return bracketStack.isEmpty(); // Kiểm tra nếu còn dấu mở chưa được đóng
    }

    public static void main(String[] args) {
        String expression1 = "s * (s - a) * (s - b) * (s - c)";
        String expression2 = "(– b + (b2 - 4*a*c)^0.5) / 2*a";
        String expression3 = "s * (s - a) * (s - b * (s - c)";
        String expression4 = "s * (s - a) * s - b) * (s - c)";
        String expression5 = "(– b + (b^2 - 4*a*c)^(0.5/ 2*a))";

        System.out.println("Biểu thức 1 có dấu ngoặc đúng: " + isBracketValid(expression1));
        System.out.println("Biểu thức 2 có dấu ngoặc đúng: " + isBracketValid(expression2));
        System.out.println("Biểu thức 3 có dấu ngoặc đúng: " + isBracketValid(expression3));
        System.out.println("Biểu thức 4 có dấu ngoặc đúng: " + isBracketValid(expression4));
        System.out.println("Biểu thức 5 có dấu ngoặc đúng: " + isBracketValid(expression5));
    }
}

