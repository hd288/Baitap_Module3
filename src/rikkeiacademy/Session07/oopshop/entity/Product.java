package rikkeiacademy.Session07.oopshop.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private int catalogId;
    private int catalogStatus;
    private Categories productCategory;

    public void inputData(Scanner scanner, ArrayList<Product> productList) {
        setProductId(inputValidProductId(scanner, productList));
        setProductName(inputValidProductName(scanner, productList));
        setPrice(inputValidPrice(scanner));
        setDescription(inputDescription(scanner));
        setCreated(inputValidCreatedDate(scanner));
        setCatalogId(inputValidCatalogId(scanner));
        setCatalogStatus(inputValidCatalogStatus(scanner));
    }

    private String inputValidProductId(Scanner scanner, ArrayList<Product> productList) {
        String productId;
        while (true) {
            System.out.print("Enter product ID: ");
            productId = scanner.nextLine();
            if (validateProductId(productId, productList)) {
                break;
            } else {
                System.out.println("Invalid product ID. Please try again.");
            }
        }
        return productId;
    }

    private boolean validateProductId(String productId, ArrayList<Product> productList) {
        if (productId.isEmpty() || productId.length() != 4) {
            return false;
        }

        char categoryCode = productId.charAt(0);
        if (!(categoryCode == 'C' || categoryCode == 'S' || categoryCode == 'A')) {
            return false;
        }

        for (Product product : productList) {
            if (productId.equals(product.getProductId())) {
                return false;
            }
        }
        return true;
    }

    private String inputValidProductName(Scanner scanner, ArrayList<Product> productList) {
        String productName;
        while (true) {
            System.out.print("Enter product name: ");
            productName = scanner.nextLine();
            if (validateProductName(productName, productList)) {
                break;
            } else {
                System.out.println("Invalid product name. Please try again.");
            }
        }
        return productName;
    }

    private boolean validateProductName(String productName, ArrayList<Product> productList) {
        if (productName.isEmpty() || productName.length() < 10 || productName.length() > 50) {
            return false;
        }

        for (Product product : productList) {
            if (productName.equals(product.getProductName())) {
                return false;
            }
        }
        return true;
    }

    private float inputValidPrice(Scanner scanner) {
        float price;
        while (true) {
            System.out.print("Enter price: ");
            String priceString = scanner.nextLine();
            try {
                price = Float.parseFloat(priceString);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Please try again.");
            }
        }
        return price;
    }

    private String inputDescription(Scanner scanner) {
        System.out.print("Enter description: ");
        return scanner.nextLine();
    }

    private Date inputValidCreatedDate(Scanner scanner) {
        Date created;
        while (true) {
            System.out.print("Enter created date (dd/mm/yyyy): ");
            String createdString = scanner.nextLine();
            try {
                created = parseDate(createdString);
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter in dd/mm/yyyy format.");
            }
        }
        return created;
    }

    private Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(dateString);
    }

    private int inputValidCatalogId(Scanner scanner) {
        int catalogId;
        while (true) {
            System.out.print("Enter catalog ID: ");
            String catalogIdString = scanner.nextLine();
            try {
                catalogId = Integer.parseInt(catalogIdString);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid catalog ID. Please try again.");
            }
        }
        return catalogId;
    }

    private int inputValidCatalogStatus(Scanner scanner) {
        int catalogStatus;
        while (true) {
            System.out.print("Enter catalog status (0: Đang bán - 1: Hết hàng - 2: Không bán): ");
            String catalogStatusString = scanner.nextLine();
            try {
                catalogStatus = Integer.parseInt(catalogStatusString);
                if (catalogStatus >= 0 && catalogStatus <= 2) {
                    break;
                } else {
                    System.out.println("Invalid catalog status. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid catalog status. Please try again.");
            }
        }
        return catalogStatus;
    }

    // Getters and setters

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(int catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public Categories getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Categories productCategory) {
        this.productCategory = productCategory;
    }

    public void displayData() {
        System.out.println("_______________________________");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Created Date: " + formatDate(created));
        System.out.println("Catalog ID: " + catalogId);
        System.out.println("Catalog Status: " + catalogStatus);
    }

    private String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }
}