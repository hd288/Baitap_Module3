package rikkeiacademy.Session11;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo stack để lưu trữ từng từ
        Stack<String> wordStack = new Stack<>();

        // Bước 2: Nhập số lượng từ
        System.out.print("Nhập số lượng từ: ");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số lượng từ

        // Bước 3: Nhập từng từ và đẩy vào stack
        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            wordStack.push(word);
        }

        // Bước 4: In ra các từ theo thứ tự đảo ngược
        System.out.println("Các từ theo thứ tự đảo ngược:");
        while (!wordStack.isEmpty()) {
            String word = wordStack.pop();
            System.out.println(word);
        }

        scanner.close();
    }
}

