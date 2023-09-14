package rikkeiacademy.Session04;

import java.util.Scanner;

public class ChuanBi_FindName {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm:");
        String inputName = scanner.nextLine();
        boolean found = false; // To check if the name is found
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(inputName)) {
                found = true;
                System.out.println(inputName + " có trong mảng.");
                System.out.println(inputName + " nằm ở vị trí thứ " + (i + 1));
                break;
            }
        }
        if (!found) {
            System.out.println(inputName + " không có trong mảng.");
        }
    }
}
