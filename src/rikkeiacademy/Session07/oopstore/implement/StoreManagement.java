package rikkeiacademy.Session07.oopstore.implement;

import rikkeiacademy.Session07.oopstore.business.*;
import rikkeiacademy.Session07.oopstore.entity.Employee;
import rikkeiacademy.Session07.oopstore.entity.Order;
import rikkeiacademy.Session07.oopstore.entity.Product;

import java.util.Scanner;

public class StoreManagement {
    private static final Product[] products = new Product[100];
    private static final Employee[] employees = new Employee[100];
    private static final Order[] orders = new Order[100];
    private static final int proCurIndex = 0;
    private static final int empCurIndex = 0;
    private static final int orderCurIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            /**STORE MANAGEMENT MENU**/
            System.out.println("*********************STORE MANAGEMENT*****************");
            System.out.println(" 1. Product Management");
            System.out.println(" 2. Employee Management");
            System.out.println(" 3. Receipt Management");
            System.out.println(" 4. Bill Management");
            System.out.println(" 5. Report Management");
            System.out.println(" 6. Exit");

            /**STORE MANAGEMENT FUNCTION**/
            try {
                System.out.println("Enter choice:");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        ProductBusiness.management(scanner, products, proCurIndex);
                        break;
                    case 2:
                        EmployeeBusiness.management(scanner, employees, empCurIndex);
                        break;
                    case 3:
                        ReceiptBusiness.management(scanner, products, proCurIndex, orders, orderCurIndex, employees, empCurIndex);
                        break;
                    case 4:
                        BillBusiness.management(scanner, products, proCurIndex, orders, orderCurIndex, employees, empCurIndex);
                        break;
                    case 5:
                        ReportBusiness.management(scanner);
                        break;
                    case 6:
                        scanner.close();
                        System.exit(0);
                    default:
                        System.err.println("No choice");
                }

            } catch (Exception e) {
                System.err.println("The choice must be integer!");
            }
        }
    }


    /**********************RECEIPT  MANAGEMENT****************/
//    void receiptManagement(Scanner scanner) {
//        isExit = false;
//
//        while (!isExit) {
//            /**RECEIPT MANAGEMENT MENU**/
//            menuService.receiptManagement();
//
//             /**RECEIPT MANAGEMENT FUNCTION */
//            try {
//                System.out.println("Enter choice:");
//                choice = scanner.nextInt();
//                scanner.nextLine();
//
//                switch (choice) {
//                    case 1:
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
//                    case 5:
//                        break;
//                    case 6:
//                        break;
//                    case 7:
//                        isExit = true;
//                        break;
//                    default:
//                        System.err.println("No choice");
//                }
//
//            }catch (Exception e) {
//
//            }
//        }
//    }

    /**********************BILL  MANAGEMENT****************/
//    void billManagement(Scanner scanner) {
//        isExit = false;
//
//        while (!isExit) {
//            /**BILL MANAGEMENT MENU**/
//            menuService.billManagement();
//
//            /**BILL MANAGEMENT FUNCTION**/
//            try {
//                System.out.println("Enter choice:");
//                choice = scanner.nextInt();
//                scanner.nextLine();
//
//                switch (choice) {
//                    case 1:
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
//                    case 5:
//                        break;
//                    case 6:
//                        break;
//                    case 7:
//                        isExit = true;
//                        break;
//                    default:
//                        System.err.println("No choice!");
//                }
//            }catch (Exception e) {
//                System.err.println("The choice must be integer!");
//            }
//        }
//    }

    /**********************REPORT  MANAGEMENT****************/
//    void reportManagement(Scanner scanner) {
//        isExit = false;
//
//        while (true) {
//            /**REPORT MANAGEMENT MENU**/
//            menuService.reportManagement();
//
//            /**REPORT MANAGEMENT FUNCTION**/
//            try {
//                System.out.println("Enter choice");
//                choice = scanner.nextInt();
//                scanner.nextLine();
//
//                switch (choice) {
//                    case 1:
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
//                    case 5:
//                        break;
//                    case 6:
//                        break;
//                    case 7:
//                        isExit = true;
//                        break;
//                    default:
//                        System.err.println("No choice!");
//                }
//            }catch (Exception e) {
//                System.err.println("No choice!");
//            }
//        }
//    }
}
