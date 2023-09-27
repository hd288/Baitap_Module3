package rikkeiacademy.Session07.oopstore.business;

import rikkeiacademy.Session07.oopstore.entity.Product;

import java.util.Scanner;

public class ProductBusiness {

    public static void management(Scanner scanner, Product[] products, int proCurIndex) {
        boolean isExit = false;
        boolean isExist = false;

        while (!isExit) {
            /**PRODUCT MANAGEMENT MENU**/
            System.out.println("*********************PRODUCT MANAGEMENT*****************");
            System.out.println(" 1. Input Product Information");
            System.out.println(" 2. Display Product Information");
            System.out.println(" 3. Update Product Information By ProductId");
            System.out.println(" 4. Find Product Information By ProductName");
            System.out.println(" 5. Update Product Status By ProductId.");
            System.out.println(" 6. Exit");

            /**PRODUCT MANAGEMENT FUNCTION */
            try {
                System.out.println("Enter choice:");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        try {
                            System.out.println("Enter number of products:");
                            int number = Integer.parseInt(scanner.nextLine());

                            if (number <= 100) {
                                for (int i = 0; i < number; i++) {
                                    Product product = new Product();
                                    product.inputData(scanner, products, proCurIndex);
                                    products[proCurIndex] = product;
                                    proCurIndex++;
                                }

                                System.out.println("The products are added into product list successfully!");
                            } else {
                                System.out.println("The product list is full!");
                            }

                        } catch (Exception e) {
                            System.err.println("The number must be integer!");
                        }

                        break;
                    case 2:
                        System.out.println("*****************Result********************");
                        for (int i = 0; i < proCurIndex; i++) {
                            products[i].display();
                        }

                        break;
                    case 3:
                        isExist = false;

                        System.out.println("Enter ProductId:");
                        String productID = scanner.nextLine();

                        System.out.println("*****************Result********************");
                        for (int i = 0; i < proCurIndex; i++) {
                            if (products[i].getProductId().equalsIgnoreCase(productID)) {
                                isExist = true;
                                products[i].updateData(scanner, products, proCurIndex);
                                System.out.printf("The %s is updated successfully!\n", products[i].getProductId());
                                break;
                            }
                        }

                        if (!isExist) {
                            System.out.printf("The Product %s is no exist in product list!\n", productID);
                        }

                        break;
                    case 4:
                        isExist = false;

                        System.out.println("Enter ProductName:");
                        String findProductName = scanner.nextLine();

                        System.out.println("*****************Result********************");
                        for (int i = 0; i < proCurIndex; i++) {
                            if (products[i].getProductName().contains(findProductName)) {
                                isExist = true;
                                products[i].display();
                                break;
                            }
                        }

                        if (!isExist) {
                            System.out.printf("The Product %s is no exist in product list!\n", findProductName);
                        }

                        break;
                    case 5:
                        isExist = false;
                        System.out.println("Enter ProductId:");
                        String productId = scanner.nextLine();

                        System.out.println("*****************Result********************");
                        for (int i = 0; i < proCurIndex; i++) {
                            if (products[i].getProductId().equalsIgnoreCase(productId)) {
                                isExist = true;
                                products[i].setProductStatus(!products[i].isProductStatus());
                                break;
                            }
                        }

                        if (!isExist) {
                            System.out.printf("The Product %s is no exist in product list!\n", productId);
                        }

                        break;
                    case 6:
                        isExit = true;
                        break;
                    default:
                        System.err.println("No choice");
                }
            } catch (Exception e) {
                System.err.println("The choice must be integer!");
            }
        }
    }
}
