package rikkeiacademy.Session06.TrenLop.ra.entity;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private float price;
    private String title;
    private String content;
    private boolean status;

    // Constructor mặc định
    public Book() {
    }

    // Constructor khởi tạo tất cả thông tin sách
    public Book(int bookId, String bookName, float price, String title, String content, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.title = title;
        this.content = content;
        this.status = status;
    }

    // Phương thức nhập thông tin sách
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        this.bookId = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống
        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập giá sách: ");
        this.price = scanner.nextFloat();
        scanner.nextLine(); // Đọc dòng trống
        System.out.println("Nhập tiêu đề sách: ");
        this.title = scanner.nextLine();
        System.out.println("Nhập nội dung sách: ");
        this.content = scanner.nextLine();
        System.out.println("Nhập trạng thái sách (true/false): ");
        this.status = scanner.nextBoolean();
    }

    // Phương thức hiển thị thông tin sách
    public void displayData() {
        System.out.println("Thông tin sách:");
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Giá sách: " + price);
        System.out.println("Tiêu đề sách: " + title);
        System.out.println("Nội dung sách: " + content);
        System.out.println("Trạng thái sách: " + (status ? "Còn hàng" : "Hết hàng"));
    }

    // Getter cho giá sách
    public float getPrice() {
        return price;
    }

    // Setter cho trạng thái sách
    public void setStatus(boolean status) {
        this.status = status;
    }
}
