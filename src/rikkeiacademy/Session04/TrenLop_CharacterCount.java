package rikkeiacademy.Session04;

import java.util.Scanner;

public class TrenLop_CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chuỗi: ");
        String input = scanner.nextLine();

        System.out.println("nhập kí tự cần tìm: ");
        char targetChar = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự cần tìm trong chuỗi là: " + count);
    }
}
