package rikkeiacademy.Session07.oopstore.business;

import rikkeiacademy.Session07.oopstore.entity.Employee;
import rikkeiacademy.Session07.oopstore.entity.Order;
import rikkeiacademy.Session07.oopstore.entity.Product;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BillBusiness {

    public static void management(Scanner scanner, Product[] products, int proCurIndex, Order[] orders, int orderCurIndex, Employee[] employees, int empCurIndex) {
        boolean isExit = false;
        int userId;
        boolean isExist = false;

        while (!isExit) {
            /**BILL MANAGEMENT MENU */
            System.out.println("*********************BILL MANAGEMENT*****************");
            System.out.println(" 1. Input Bill Information");
            System.out.println(" 2. Display Bill Information");
            System.out.println(" 3. Update Bill Information");
            System.out.println(" 4. Find Bill From Date To Date");
            System.out.println(" 5. Find Bill By Created User");
            System.out.println(" 6. Find Bill By Updated User");
            System.out.println(" 7. Exit");

            /**BILL MANAGEMENT FUNCTION */
            try {
                System.out.println("Enter choice");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter number of receipt:");
                        int number = Integer.parseInt(scanner.nextLine());

                        for (int i = 0; i < orderCurIndex; i++) {
                            Order order = new Order();
                            order.inputData(scanner, "PN", products, proCurIndex, employees, empCurIndex);
                            orders[i] = order;
                        }

                        System.out.println("Receipt is created successfully!");
                        break;
                    case 2:
                        int count = 0;
                        for (int i = 0; i < orderCurIndex; i++) {
                            if (Pattern.matches("PN", orders[i].getOrderId())) {
                                orders[i].display();
                                count++;
                            }
                        }

                        if (count == 0) {
                            System.out.println("No receipt!");
                        }
                        break;
                    case 3:
                        isExist = false;
                        System.out.println("Enter ReceiptID:");
                        String receiptID = scanner.nextLine().toUpperCase().trim();

                        for (int i = 0; i < orderCurIndex; i++) {
                            if (orders[i].getProductId().equalsIgnoreCase(receiptID)) {
                                orders[i].updateData(scanner, products, proCurIndex, employees, empCurIndex);
                                isExist = true;
                            }
                        }

                        if (isExist) {
                            System.out.printf("The Receipt %s is updated successfully!\n", receiptID);
                        } else {
                            System.out.printf("The Receipt %s is not exist!\n", receiptID);
                        }

                        break;
                    case 4:

                        break;
                    case 5:
                        isExist = false;
                        System.out.println("Enter UserID:");
                        userId = Integer.parseInt(scanner.nextLine());

                        for (int i = 0; i < orderCurIndex; i++) {
                            if (orders[i].getUserCreateId() == userId) {
                                orders[i].display();
                                isExist = true;
                            }
                        }

                        if (!isExist) {
                            System.out.println("No Receipt");
                        }

                        break;
                    case 6:
                        isExist = false;
                        System.out.println("Enter UserID:");
                        userId = Integer.parseInt(scanner.nextLine());

                        for (int i = 0; i < orderCurIndex; i++) {
                            if (orders[i].getUserUpdateId() == userId) {
                                orders[i].display();
                                isExist = true;
                            }
                        }

                        if (!isExist) {
                            System.out.println("No Receipt");
                        }
                        break;
                    case 7:
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
