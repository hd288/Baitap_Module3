package ra.business;

import java.util.Scanner;

public class Book {
    private static int nextId = 1;

    private final int bookId;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
        this.bookId = nextId++;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        if (descriptions.length() >= 10) {
            this.descriptions = descriptions;
        } else {
            System.out.println("Mô tả phải có ít nhất 10 ký tự.");
        }
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        if (importPrice > 0) {
            this.importPrice = importPrice;
        } else {
            System.out.println("Giá nhập phải lớn hơn 0.");
        }
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        if (exportPrice > 1.2 * importPrice) {
            this.exportPrice = exportPrice;
        } else {
            System.out.println("Giá xuất phải lớn hơn 1.2 lần giá nhập.");
        }
    }

    public float getInterest() {
        return interest;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***********************************");
        System.out.println("Nhập thông tin sách:");
        System.out.print("Tên sách: ");
        String bookNameInput = scanner.nextLine();
        setBookName(bookNameInput);

        System.out.print("Tác giả: ");
        String authorInput = scanner.nextLine();
        setAuthor(authorInput);

        System.out.print("Mô tả sách (ít nhất 10 ký tự): ");
        String descriptionInput;
        while (true) {
            descriptionInput = scanner.nextLine();
            if (descriptionInput.length() >= 10) {
                break;
            } else {
                System.out.println("Mô tả phải có ít nhất 10 ký tự. Vui lòng nhập lại.");
            }
        }
        setDescriptions(descriptionInput);

        System.out.print("Giá nhập: ");
        double importPriceInput;
        while (true) {
            if (scanner.hasNextDouble()) {
                importPriceInput = scanner.nextDouble();
                if (importPriceInput > 0) {
                    break;
                } else {
                    System.out.println("Giá nhập phải lớn hơn 0. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Giá nhập phải là số thập phân. Vui lòng nhập lại.");
                scanner.nextLine();
            }
        }
        setImportPrice(importPriceInput);

        System.out.print("Giá xuất (phải lớn hơn 1.2 lần giá nhập): ");
        double exportPriceInput;
        while (true) {
            if (scanner.hasNextDouble()) {
                exportPriceInput = scanner.nextDouble();
                if (exportPriceInput > 1.2 * importPriceInput) {
                    break;
                } else {
                    System.out.println("Giá xuất phải lớn hơn 1.2 lần giá nhập. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Giá xuất phải là số thập phân. Vui lòng nhập lại.");
                scanner.nextLine();
            }
        }
        setExportPrice(exportPriceInput);

        this.interest = (float) (exportPriceInput - importPriceInput);

        this.bookStatus = true;

        System.out.println("Thông tin sách đã được cập nhật.");
    }


    public void displayData() {
        System.out.println("----------Thông tin sách:----------");
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tác giả: " + author);
        System.out.println("Mô tả sách: " + descriptions);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("Trạng thái: " + (bookStatus ? "Còn hàng" : "Hết hàng"));
        System.out.println("***********************************");
    }
}

