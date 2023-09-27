package rikkeiacademy.Session07.oopshop.run;

import rikkeiacademy.Session07.oopshop.entity.Categories;
import rikkeiacademy.Session07.oopshop.entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopManagements {

    private final ArrayList<Categories> categoriesList;
    private final ArrayList<Product> productList;
    Scanner scanner = new Scanner(System.in);

    public ShopManagements() {
        categoriesList = new ArrayList<>();
        productList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ShopManagements shop = new ShopManagements();
        shop.start();
    }

    public void start() {
        int choice;
        do {
            System.out.println("******************SHOP MENU*******************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer

            switch (choice) {
                case 1:
                    categoriesMenu();
                    break;
                case 2:
                    productMenu();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 3);
    }

    private void categoriesMenu() {
        int choice;
        do {
            System.out.println("********************CATEGORIES MENU***********");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer

            switch (choice) {
                case 1:
                    inputCategories();
                    break;
                case 2:
                    displayCategories();
                    break;
                case 3:
                    updateCategory();
                    break;
                case 4:
                    deleteCategory();
                    break;
                case 5:
                    updateCategoryStatus();
                    break;
                case 6:
                    System.out.println("Quay lại menu SHOP MANAGEMENT.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 6);
    }

    private void productMenu() {
        int choice;
        do {
            System.out.println("*******************PRODUCT MANAGEMENT*****************");
            System.out.println("1. Nhập thông tin các sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp các sản phẩm theo giá");
            System.out.println("4. Cập nhật thông tin sản phẩm theo mã sản phẩm");
            System.out.println("5. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("6. Tìm kiếm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Tìm kiếm sản phẩm trong khoảng giá a – b");
            System.out.println("8. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer

            switch (choice) {
                case 1:
                    inputProducts();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    sortProductsByPrice();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 6:
                    searchProductsByName();
                    break;
                case 7:
                    searchProductsByPriceRange();
                    break;
                case 8:
                    System.out.println("Quay lại menu SHOP MANAGEMENT.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 8);
    }

    private void inputCategories() {
        System.out.print("Nhập số danh mục: ");
        int numCategories = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCategories; i++) {
            System.out.println("Nhập thông tin danh mục thứ " + (i + 1) + ":");
            Categories category = new Categories();
            category.inputData(scanner, categoriesList);
            categoriesList.add(category);
        }
        System.out.println("Nhập thông tin danh mục thành công.");
    }

    private void displayCategories() {
        if (categoriesList.isEmpty()) {
            System.out.println("Danh sách danh mục rỗng.");
        } else {
            System.out.println("Thông tin các danh mục:");
            for (Categories category : categoriesList) {
                category.displayData();
            }
        }
    }

    private void updateCategory() {
        System.out.print("Nhập mã danh mục cần cập nhật thông tin: ");
        int categoryId = scanner.nextInt();
        scanner.nextLine();

        boolean categoryExists = false;
        for (Categories category : categoriesList) {
            if (category.getCatalogId() == (categoryId)) {
                categoryExists = true;
                System.out.println("Nhập lại thông tin của danh mục:");

                System.out.print("Nhập tên danh mục: ");
                String categoryName = scanner.nextLine();
                category.setCatalogName(categoryName);

                System.out.print("Nhập mô tả danh mục: ");
                String categoryDescription = scanner.nextLine();
                category.setDescriptions(categoryDescription);

                System.out.print("Nhập trạng thái danh mục (true/false): ");
                boolean categoryStatus = scanner.nextBoolean();
                category.setCatalogStatus(categoryStatus);

                System.out.println("Cập nhật thông tin danh mục thành công.");
                break;
            }
        }

        if (!categoryExists) {
            System.out.println("Mã danh mục không tồn tại.");
        }
    }

    private void deleteCategory() {
        System.out.print("Nhập mã danh mục cần xóa: ");
        int categoryId = scanner.nextInt();
        scanner.nextLine();

        boolean categoryExists = false;
        boolean containsProduct = false;
        Categories foundCategory = null;
        for (int i = 0; i < categoriesList.size(); i++) {
            Categories category = categoriesList.get(i);
            if (category.getCatalogId() == categoryId) {
                categoryExists = true;
                foundCategory = category;
                break;
            }
        }

        if (categoryExists) {
            boolean categoryHasProduct = false;
            for (Product product : productList) {
                if (product.getCatalogId() == categoryId) {
                    categoryHasProduct = true;
                    break;
                }
            }

            if (!categoryHasProduct) {
                categoriesList.remove(foundCategory);
                System.out.println("Xóa danh mục thành công.");
            } else {
                containsProduct = true;
                System.out.println("Không thể xóa danh mục vì danh mục chứa sản phẩm.");
            }
        } else {
            System.out.println("Mã danh mục không tồn tại.");
        }
    }

    private void updateCategoryStatus() {
        System.out.print("Nhập mã danh mục cần cập nhật trạng thái: ");
        int categoryId = scanner.nextInt();

        boolean categoryExists = false;
        for (Categories category : categoriesList) {
            if (category.getCatalogId() == (categoryId)) {
                categoryExists = true;
                boolean currentStatus = category.getCatalogStatus();
                category.setCatalogStatus(!currentStatus);
                System.out.println("Cập nhật trạng thái danh mục thành công.");
                break;
            }
        }

        if (!categoryExists) {
            System.out.println("Mã danh mục không tồn tại.");
        }
    }

    private void inputProducts() {
        System.out.print("Nhập số sản phẩm: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            Product product = new Product();
            product.inputData(scanner, productList);
            productList.add(product);
        }
        System.out.println("Nhập thông tin sản phẩm thành công.");
    }

    private void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
        } else {
            System.out.println("Thông tin các sản phẩm:");
            for (Product product : productList) {
                product.displayData();
            }
        }
    }

    private void sortProductsByPrice() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
        } else {
            ArrayList<Product> sortedList = new ArrayList<>(productList);
            sortedList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

            System.out.println("Các sản phẩm sau khi được sắp xếp theo giá:");
            for (Product product : sortedList) {
                product.displayData();
            }
        }
    }

    private void updateProduct() {
        System.out.print("Nhập mã sản phẩm cần cập nhật thông tin: ");
        String productId = scanner.nextLine();

        boolean productExists = false;
        for (Product product : productList) {
            if (product.getProductId().equals(productId)) {
                productExists = true;
                System.out.println("Nhập lại thông tin của sản phẩm:");

                System.out.print("Nhập tên sản phẩm: ");
                String productName = scanner.nextLine();
                product.setProductName(productName);

                System.out.print("Nhập giá sản phẩm: ");
                double productPrice = scanner.nextDouble();
                product.setPrice((float) productPrice);

                System.out.print("Nhập mã danh mục của sản phẩm: ");
                String productCategoryId = scanner.next();
                scanner.nextLine(); // Clear the input buffer
                Categories category = findCategoryById(Integer.parseInt(productCategoryId));
                if (category != null) {
                    product.setProductCategory(category);
                    System.out.println("Cập nhật thông tin sản phẩm thành công.");
                } else {
                    System.out.println("Mã danh mục không tồn tại. Không thể cập nhật thông tin sản phẩm.");
                }
                break;
            }
        }

        if (!productExists) {
            System.out.println("Mã sản phẩm không tồn tại.");
        }
    }

    private void deleteProduct() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String productId = scanner.nextLine();

        boolean productExists = false;
        for (Product product : productList) {
            if (product.getProductId().equals(productId)) {
                productExists = true;
                productList.remove(product);
                System.out.println("Xóa sản phẩm thành công.");
                break;
            }
        }

        if (!productExists) {
            System.out.println("Mã sản phẩm không tồn tại.");
        }
    }

    private void searchProductsByName() {
        System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
        String productName = scanner.nextLine();

        boolean productFound = false;
        for (Product product : productList) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                productFound = true;
                System.out.println("Thông tin sản phẩm:");
                System.out.println(product);
                break;
            }
        }

        if (!productFound) {
            System.out.println("Không tìm thấy sản phẩm có tên \"" + productName + "\".");
        }
    }

    private void searchProductsByPriceRange() {
        System.out.print("Nhập giá a: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Nhập giá b: ");
        double maxPrice = scanner.nextDouble();

        boolean productFound = false;
        for (Product product : productList) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                productFound = true;
                System.out.println(product);
            }
        }

        if (!productFound) {
            System.out.println("Không tìm thấy sản phẩm nào trong khoảng giá từ " + minPrice + " đến " + maxPrice + ".");
        }
    }

    private Categories findCategoryById(int categoryId) {
        for (Categories category : categoriesList) {
            if (category.getCatalogId() == (categoryId)) {
                return category;
            }
        }
        return null;
    }
}