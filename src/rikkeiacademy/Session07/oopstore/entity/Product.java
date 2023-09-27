package rikkeiacademy.Session07.oopstore.entity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Product {
    private String productId;
    private String productName;
    private String manufacturer;
    private boolean productStatus;

    /**
     * Constructor
     */
    public Product() {
    }

    /**
     * Getter / Setter
     */
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * name: inputData(Scanner scanner).
     *
     * @param: scanner.
     * function: input product information.
     */
    public void inputData(Scanner scanner, Product[] products, int currentIndex) {
        boolean isLoop = true;
        boolean isExist = false;

        /** Input ProductID */
        while (isLoop) {
            isExist = false;

            System.out.println("Enter ProductId:");
            this.productId = scanner.nextLine();

            if (Pattern.matches("^[A-Z]\\w{3}", this.productId)) {
                for (int i = 0; i < currentIndex; i++) {
                    if (products[i].getProductId().equals(this.productId)) {
                        isExist = true;
                        System.err.printf("The ProductID \"%s\" is exist!!\n", this.productId);
                        break;
                    }
                }
            } else {
                isExist = true;
                System.err.print("The ProductID  must be 4 characters with first character capitalized!!\n");
            }

            if (!isExist) {
                break;
            }
        }

        /** Input ProductName */
        while (isLoop) {
            System.out.println("Enter ProductName:");
            this.productName = scanner.nextLine();

            if (this.productName.length() < 1) {
                System.err.print("The ProductName must be at least 1 character!!\n");
            } else {
                break;
            }
        }

        /** Input Manufacturer */
        while (isLoop) {
            System.out.println("Enter Manufacturer:");
            this.manufacturer = scanner.nextLine();
            break;
        }

        /** Input ProductStatus */
        while (isLoop) {
            System.out.println("Enter ProductStatus (0. Active - 1. Non-Active)");
            int status = Integer.parseInt(scanner.nextLine().trim());

            if (status == 0) {
                this.productStatus = true;
                break;
            } else if (status == 1) {
                this.productStatus = false;
                break;
            } else {
                System.err.print("The ProductStatus must be 0 or 1!!\n");
            }
        }
    }

    /**
     * name: updateData(Scanner scanner).
     *
     * @param: scanner.
     * function: update product information.
     * date: 22/09/2023
     */
    public void updateData(Scanner scanner, Product[] products, int currentIndex) {
        boolean isLoop = true;
        boolean isExist = false;

        /** Update ProductID */
//        while (isLoop) {
//            isExist = false;
//
//            System.out.println("Enter updateProductId:");
//            String updateProductId = scanner.nextLine();
//
//            // Case 1: The updateProductId is the same as the currentProductID
//            if(updateProductId.equals(this.productId)) {
//                break;
//            }
//
//            // Case 2: The updateProductId either exists or does not exist
//            for (int i = 0; i < currentIndex; i++) {
//                if(!updateProductId.equals(this.productId)) {
//                    if(products[i].equals(updateProductId)) {
//                        isExist = true;
//                        System.err.printf("The updateProductId \"%s\" is exist!!\n", updateProductId);
//                        break;
//                    }
//                }
//            }
//
//            if(!isExist) {
//                this.productId = updateProductId;
//                break;
//            }
//        }

        /** Input ProductName */
        while (isLoop) {
            System.out.println("Enter updateProductName:");
            String updateProductName = scanner.nextLine().trim();

            if (updateProductName == "" || this.productName.equals(updateProductName)) {
                break;
            } else if (updateProductName.length() >= 1) {
                this.productName = updateProductName;
                break;
            } else {
                System.err.println("The updateProductName is at least 1 character!");
            }
        }

        /** Update Manufacturer */
        while (isLoop) {
            System.out.println("Enter updateManufacturer:");
            String updateManufacturer = scanner.nextLine().trim();

            if (updateManufacturer == "" || this.manufacturer.equals(updateManufacturer)) {
                break;
            } else {
                this.manufacturer = updateManufacturer;
                break;
            }
        }

        /** Update ProductStatus */
        while (isLoop) {
            System.out.println("Enter ProductStatus (0. Active - 1. Non-Active)");
            String updateProductStatus = scanner.nextLine().trim();

            if (updateProductStatus == "") {
                break;
            } else if (updateProductStatus.equals("0")) {
                this.productStatus = true;
                break;
            } else if (updateProductStatus.equals("1")) {
                this.productStatus = false;
                break;
            } else {
                System.err.println("The updateProductStatus must be 0 or 1!");
            }
        }
    }

    /**
     * name: display().
     *
     * @param: none.
     * function: show product information.
     * date: 22/09/2023
     */
    public void display() {
        String status = this.productStatus ? "Active" : "Non active";
        System.out.println("================");
        System.out.printf("ProductID: %s - ProductNam: %s - Manufacturer: %s - ProductStatus: %s\n",
                this.productId, this.productName, this.manufacturer, status);
    }
}
