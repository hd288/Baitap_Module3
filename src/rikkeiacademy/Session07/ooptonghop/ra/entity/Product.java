package rikkeiacademy.Session07.ooptonghop.ra.entity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Product {
    private static final Set<String> usedProductNames = new HashSet<>();
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, int quantity, String descriptions, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
        this.calculateProfit();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void calculateProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }

    public void inputData(Scanner scanner, Product[] products, int productCount) {
        boolean isExist;


        /** Product ID */
        do {
            isExist = false;

            System.out.println("Nhập mã sản phẩm:");
            this.productId = scanner.nextLine().toUpperCase();

            if (this.productId.charAt(0) == 'P' && this.productId.length() == 4) {
                for (int i = 0; i < productCount; i++) {
                    if (products[i].productId.equalsIgnoreCase(productId)) {
                        System.out.println("Mã sản phẩm đã tồn tại");
                        isExist = true;
                        break;
                    }
                }
            } else {
                isExist = true;
                System.out.println("Mã sp có 4 kí tự và bắt đầu bằng chữ P (Ví dụ: PD01)");
            }

        } while (isExist);




        /* Product name
         * Kiểm tra và yêu cầu nhập tên sản phẩm mới nếu trùng lặp
         * */
        boolean isNameUnique = false;
        while (!isNameUnique) {
            System.out.print("Nhập tên sản phẩm (6-50 ký tự): ");
            String productName = scanner.nextLine();
            if (productName.length() < 6 || productName.length() > 50) {
                System.out.println("Tên sản phẩm phải từ 6 đến 50 ký tự. Vui lòng nhập lại.");
            } else if (usedProductNames.contains(productName)) {
                System.out.println("Tên sản phẩm đã tồn tại. Vui lòng nhập tên sản phẩm khác.");
            } else {
                this.productName = productName;
                usedProductNames.add(productName); // Thêm tên sản phẩm vào danh sách đã sử dụng
                isNameUnique = true;
            }
        }

        /* import price */
        System.out.print("Nhập giá nhập: ");
        float importPrice = Float.parseFloat(scanner.nextLine());
        while (importPrice <= 0) {
            System.out.print("Giá nhập phải lớn hơn 0. Vui lòng nhập lại: ");
            importPrice = Float.parseFloat(scanner.nextLine());
        }
        this.importPrice = importPrice;

        /* export price */
        System.out.print("Nhập giá xuất (>= 20% giá nhập): ");
        float exportPrice = Float.parseFloat(scanner.nextLine());
        while (exportPrice < 1.2 * importPrice) {
            System.out.print("Giá xuất phải lớn hơn hoặc bằng 120% giá nhập. Vui lòng nhập lại: ");
            exportPrice = Float.parseFloat(scanner.nextLine());
        }
        this.exportPrice = exportPrice;

        /* quantity */
        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        while (quantity <= 0) {
            System.out.print("Số lượng sản phẩm phải lớn hơn 0. Vui lòng nhập lại: ");
            quantity = Integer.parseInt(scanner.nextLine());
        }
        this.quantity = quantity;

        /* descriptions & status */
        System.out.print("Nhập mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();

        System.out.print("Nhập trạng thái sản phẩm (true - Đang bán, false - Không bán): ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }


    public void displayData() {
        System.out.println("*************************************");
        System.out.println("Mã sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Lợi nhuận: " + getProfit());
        System.out.println("Số lượng sản phẩm: " + quantity);
        System.out.println("Mô tả sản phẩm: " + descriptions);
        System.out.println("Trạng thái sản phẩm: " + (status ? "Đang bán" : "Không bán"));
    }
}
