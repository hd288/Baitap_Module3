package rikkeiacademy.Session07.oopstore.business;

import java.util.Scanner;

public class ReportBusiness {

    public static void management(Scanner scanner) {
        boolean isExit = false;

        while (!isExit) {
            /**REPORT MANAGEMENT MENU**/
            System.out.println("*********************REPORT MANAGEMENT*****************");
            System.out.println(" 1. Report Imported Product From Date To Date");
            System.out.println(" 2. Report Exported Product From Date to Date");
            System.out.println(" 3. Report Profit From Date To Date (By Bill) ");
            System.out.println(" 4. Report Profit From Date To Date (By Receipt");
            System.out.println(" 5. Report Bill By Month");
            System.out.println(" 5. Report Receipt By Month");
            System.out.println(" 6. Exit");

            /**REPORT MANAGEMENT FUNCTION */
            try {
                System.out.println("Enter choice");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
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
