package rikkeiacademy.Session07.ooptonghop.ra.imp;

import rikkeiacademy.Session07.ooptonghop.ra.entity.Product;

import java.util.Arrays;
import java.util.Scanner;

public class ProductImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[100];
        int productCount = 0;

        while (true) {
            System.out.println("***********************MENU**************************");
            System.out.println("1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo giá");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm");
            System.out.println("10. Thoát");

            System.out.print("Chọn chức năng (1-10): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng thừa

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sản phẩm cần thêm: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        if (productCount < products.length) {
                            Product product = new Product();
                            product.inputData(scanner, products, productCount);
                            products[productCount] = product;
                            productCount++;
                        } else {
                            System.out.println("Danh sách sản phẩm đã đầy. Không thể thêm nữa.");
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < productCount; i++) {
                        products[i].displayData();
                    }
                    break;
                case 3:
                    for (int i = 0; i < productCount; i++) {
                        products[i].calculateProfit();
                    }
                    System.out.println("Đã tính lợi nhuận cho tất cả các sản phẩm.");
                    break;
                case 4:
                    Arrays.sort(products, 0, productCount, (p1, p2) -> {
                        float profit1 = p1.getProfit();
                        float profit2 = p2.getProfit();
                        if (profit1 < profit2) {
                            return 1;
                        } else if (profit1 > profit2) {
                            return -1;
                        } else {
                            return 0;
                        }
                    });
                    System.out.println("Đã sắp xếp các sản phẩm theo lợi nhuận giảm dần.");
                    break;
                case 5:
                    System.out.print("Nhập giá bắt đầu (fromPrice): ");
                    float fromPrice = scanner.nextFloat();
                    System.out.print("Nhập giá kết thúc (toPrice): ");
                    float toPrice = scanner.nextFloat();
                    int count = 0;
                    for (int i = 0; i < productCount; i++) {
                        float exportPrice = products[i].getExportPrice();
                        if (exportPrice >= fromPrice && exportPrice <= toPrice) {
                            count++;
                        }
                    }
                    System.out.println("Số lượng sản phẩm có giá bán từ " + fromPrice + " đến " + toPrice + ": " + count);
                    break;
                case 6:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getProductName().toLowerCase().contains(searchName.toLowerCase())) {
                            products[i].displayData();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sản phẩm có tên '" + searchName + "'.");
                    }
                    break;
                case 7:
                    System.out.print("Nhập mã sản phẩm cần nhập: ");
                    String productIdToInput = scanner.nextLine();
                    System.out.print("Nhập số lượng sản phẩm cần nhập: ");
                    int quantityToInput = scanner.nextInt();
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getProductId().equalsIgnoreCase(productIdToInput)) {
                            int currentQuantity = products[i].getQuantity();
                            products[i].setQuantity(currentQuantity + quantityToInput);
                            System.out.println("Đã nhập thêm " + quantityToInput + " sản phẩm vào mã " + productIdToInput);
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.print("Nhập tên sản phẩm cần bán: ");
                    String productNameToSell = scanner.nextLine();
                    System.out.print("Nhập số lượng sản phẩm cần bán: ");
                    int quantityToSell = scanner.nextInt();
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getProductName().equalsIgnoreCase(productNameToSell)) {
                            int currentQuantity = products[i].getQuantity();
                            if (currentQuantity >= quantityToSell) {
                                products[i].setQuantity(currentQuantity - quantityToSell);
                                System.out.println("Đã bán " + quantityToSell + " sản phẩm có tên '" + productNameToSell + "'.");
                                if (products[i].getQuantity() == 0) {
                                    products[i].setStatus(false);
                                }
                            } else {
                                System.out.println("Không đủ sản phẩm để bán.");
                            }
                            break;
                        }
                    }
                    break;
                case 9:
                    System.out.print("Nhập mã sản phẩm cần cập nhật trạng thái: ");
                    String productIdToUpdate = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getProductId().equalsIgnoreCase(productIdToUpdate)) {
                            boolean currentStatus = products[i].isStatus();
                            products[i].setStatus(!currentStatus);

                            if (products[i].isStatus()) {
                                System.out.printf("Đã cập nhật trạng thái sản phẩm có mã %s thành ĐANG BÁN", productIdToUpdate);
                            } else {
                                System.out.printf("Đã cập nhật trạng thái sản phẩm có mã %s thành KHÔNG BÁN", productIdToUpdate);
                            }
                            break;
                        }
                    }
                    break;
                case 10:
                    System.out.println("Ứng dụng đã thoát.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn chức năng không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}