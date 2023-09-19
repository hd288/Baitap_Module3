package rikkeiacademy.Session06.TrenLop.ra.imp;

import rikkeiacademy.Session06.TrenLop.ra.entity.Book;

import java.util.Scanner;

public class BookImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        while (true) {
            System.out.println("**MENU**");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Hiển thị thông tin sách");
            System.out.println("3. In thông tin giá sách");
            System.out.println("4. Cập nhật trạng thái sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống

            switch (choice) {
                case 1:
                    book.inputData();
                    break;
                case 2:
                    book.displayData();
                    break;
                case 3:
                    System.out.println("Giá sách: " + book.getPrice());
                    break;
                case 4:
                    System.out.print("Nhập trạng thái sách mới (true/false): ");
                    boolean newStatus = scanner.nextBoolean();
                    book.setStatus(newStatus);
                    System.out.println("Trạng thái sách đã được cập nhật.");
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai chức năng. Vui lòng chọn lại.");
            }
        }
    }
}
