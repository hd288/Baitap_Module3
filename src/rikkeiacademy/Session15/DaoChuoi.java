package rikkeiacademy.Session15;

import java.util.Scanner;

public class DaoChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        try {
            String reversed = reversedString(input);
            System.out.println("Chuỗi đảo là: " + reversed);
        } catch (Exception e) {
            System.out.println("Lỗi: chuỗi không hợp lệ");
        }
    }

    private static String reversedString(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException();
        }

        StringBuilder reverded = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reverded.append(input.charAt(i));
        }
        return reverded.toString();
    }
}
