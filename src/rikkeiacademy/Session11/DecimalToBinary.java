package rikkeiacademy.Session11;

import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber = 111;
        String binary = convertDecimalToBinary(decimalNumber);
        System.out.println("Chuyển đổi từ hệ thập phân sang hệ nhị phân: " + binary);
    }

    public static String convertDecimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}

