package ra.run;

import ra.business.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Book[] library = new Book[100];
        int bookCount = 0;

        do {
            System.out.println("******** JAVA-HACKATHON-05-BASIC-MENU ********");
            System.out.println("1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách");
            System.out.println("2. Hiển thị thông tin tất cả sách trong thư viện");
            System.out.println("3. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả");
            System.out.println("6. Thay đổi thông tin sách theo mã sách");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sách cần thêm: ");
                    int numBooksToAdd = scanner.nextInt();
                    scanner.nextLine();

                    if (bookCount + numBooksToAdd > 100) {
                        System.out.println("Danh sách sách đầy. Không thể thêm nữa.");
                    } else {
                        for (int i = 0; i < numBooksToAdd; i++) {
                            Book newBook = new Book();
                            newBook.inputData();
                            library[bookCount++] = newBook;
                        }
                    }
                    break;

                case 2:
                    if (bookCount < 1) {
                        System.out.println("____________ CHƯA CÓ DỮ LIỆU SÁCH ____________");
                    } else {
                        for (int i = 0; i < bookCount; i++) {
                            System.out.println("Sách thứ " + (i + 1) + ":");
                            library[i].displayData();
                        }
                    }

                    break;

                case 3:
                    if (bookCount < 1) {
                        System.out.println("____________ CHƯA CÓ DỮ LIỆU SÁCH ____________");
                    } else {
                        Arrays.sort(library, 0, bookCount, Comparator.comparingDouble(Book::getInterest));
                        System.out.println("SÁCH ĐÃ ĐƯỢC SẮP XẾP THEO THỨ TỰ LỢI NHUẬN TĂNG DẦN");
                        System.out.println("___________________________________________________");
                        System.out.println("Danh sách mới:");
                        for (int i = 0; i < bookCount; i++) {
                            System.out.println("Sách thứ " + (i + 1) + ":");
                            library[i].displayData();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    int bookIdToDelete = scanner.nextInt();
                    boolean found = false;

                    for (int i = 0; i < bookCount; i++) {
                        if (library[i].getBookId() == bookIdToDelete) {
                            for (int j = i; j < bookCount - 1; j++) {
                                library[j] = library[j + 1];
                            }
                            bookCount--;
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Sách có mã " + bookIdToDelete + " đã được xóa.");
                    } else {
                        System.out.println("Không tìm thấy sách có mã " + bookIdToDelete + ".");
                    }
                    break;

                case 5:
                    System.out.print("Nhập chuỗi tìm kiếm: ");
                    String searchString = scanner.nextLine().toLowerCase();

                    boolean foundBooks = false;

                    for (int i = 0; i < bookCount; i++) {
                        if (library[i].getBookName().toLowerCase().contains(searchString) || library[i].getDescriptions().toLowerCase().contains(searchString)) {
                            System.out.println("Sách thứ " + (i + 1) + ":");
                            library[i].displayData();
                            foundBooks = true;
                        }
                    }

                    if (!foundBooks) {
                        System.out.println("Không tìm thấy sách phù hợp với chuỗi tìm kiếm.");
                    }
                    break;

                case 6:
                    System.out.print("Nhập mã sách cần thay đổi thông tin: ");
                    int bookIdToModify = scanner.nextInt();
                    scanner.nextLine();
                    boolean modified = false;

                    for (int i = 0; i < bookCount; i++) {
                        if (library[i].getBookId() == bookIdToModify) {
                            library[i].inputData();
                            System.out.print("Nhập trạng thái sách (true nếu còn hàng/ false nếu hết hàng): ");
                            boolean status = scanner.nextBoolean();
                            library[i].setBookStatus(status);
                            modified = true;
                            break;
                        }
                    }

                    if (modified) {
                        System.out.println("Thông tin sách đã được cập nhật.");
                    } else {
                        System.out.println("Không tìm thấy sách có mã " + bookIdToModify + ".");
                    }
                    break;

                case 7:
                    System.out.println("Thoát khỏi chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 7);
    }
}
