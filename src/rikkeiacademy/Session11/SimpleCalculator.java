package rikkeiacademy.Session11;

import java.util.Stack;

public class SimpleCalculator {
    public static void main(String[] args) {
        String expression = "3 + 5 * 2 - 6 / 3";

        // Hàm tính toán biểu thức và trả về kết quả
        double result = evaluateExpression(expression);
        System.out.println("Kết quả: " + result);
    }

    public static double evaluateExpression(String expression) {
        Stack<Double> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Nếu ký tự hiện tại là số, đọc số và đưa vào stack số
                StringBuilder numStr = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    numStr.append(expression.charAt(i));
                    i++;
                }
                i--;

                double num = Double.parseDouble(numStr.toString());
                numberStack.push(num);
            } else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                // Nếu ký tự hiện tại là toán tử, thực hiện phép tính tương ứng
                while (!operatorStack.isEmpty() && hasHigherPrecedence(currentChar, operatorStack.peek())) {
                    double num2 = numberStack.pop();
                    double num1 = numberStack.pop();
                    char operator = operatorStack.pop();
                    double result = performOperation(num1, num2, operator);
                    numberStack.push(result);
                }
                operatorStack.push(currentChar);
            }
        }

        // Thực hiện các phép tính còn lại trong stack
        while (!operatorStack.isEmpty()) {
            double num2 = numberStack.pop();
            double num1 = numberStack.pop();
            char operator = operatorStack.pop();
            double result = performOperation(num1, num2, operator);
            numberStack.push(result);
        }

        return numberStack.pop();
    }

    public static boolean hasHigherPrecedence(char op1, char op2) {
        return (op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-');
    }

    public static double performOperation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Lỗi chia cho 0");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Toán tử không hợp lệ: " + operator);
        }
    }
}

