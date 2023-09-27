package rikkeiacademy.Session07.oopstore.business;

import rikkeiacademy.Session07.oopstore.entity.Employee;

import java.util.Scanner;

public class EmployeeBusiness {

    /* EMPLOYEE MANAGEMENT */
    public static void management(Scanner scanner, Employee[] employees, int empCurIndex) {
        boolean isExit = false;
        boolean isExist = false;

        while (!isExit) {
            /* EMPLOYEE MANAGEMENT MENU**/
            System.out.println("*********************EMPLOYEE MANAGEMENT*****************");
            System.out.println(" 1. Input Employee Information");
            System.out.println(" 2. Display Employee Information");
            System.out.println(" 3. Update Employee Information");
            System.out.println(" 4. Find Employee Information By Name");
            System.out.println(" 5. Update Employee Status");
            System.out.println(" 6. Exit");

            /* EMPLOYEE MANAGEMENT FUNCTION */
            try {
                System.out.println("Enter choice");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        try {
                            System.out.println("Enter number of employees:");
                            int number = Integer.parseInt(scanner.nextLine());

                            if (number <= 100) {
                                for (int i = 0; i < number; i++) {
                                    Employee employee = new Employee();
                                    employee.inputData(scanner, employees, empCurIndex);
                                    employees[empCurIndex] = employee;
                                    empCurIndex++;
                                }

                                System.out.println("The employees are added into employee list successfully!");
                            } else {
                                System.out.println("The employee list is full!");
                            }

                        } catch (Exception e) {
                            System.err.println("The number must be integer!");
                        }

                        break;
                    case 2:
                        System.out.println("*****************Result********************");
                        for (int i = 0; i < empCurIndex; i++) {
                            employees[i].display();
                        }

                        break;
                    case 3:
                        isExist = false;

                        System.out.println("Enter EmployeeId");
                        int employeeId = Integer.parseInt(scanner.nextLine());

                        System.out.println("*****************Result********************");
                        for (int i = 0; i < empCurIndex; i++) {
                            if (employees[i].getEmpId() == employeeId) {
                                isExist = true;
                                employees[i].updateData(scanner, employees, empCurIndex);
                                System.out.printf("The %s is updated successfully!\n", employees[i].getEmpName());
                                break;
                            }
                        }

                        if (!isExist) {
                            System.out.printf("The ID %s is no exist in employee list!\n", employeeId);
                        }

                        break;
                    case 4:
                        isExist = false;

                        System.out.println("Enter EmployeeName:");
                        String findEmployeeName = scanner.nextLine();

                        System.out.println("*****************Result********************");
                        for (int i = 0; i < empCurIndex; i++) {
                            if (employees[i].getEmpName().contains(findEmployeeName)) {
                                isExist = true;
                                employees[i].display();
                                break;
                            }
                        }

                        if (!isExist) {
                            System.out.printf("The Employee %s is no exist in employee list!\n", findEmployeeName);
                        }

                        break;
                    case 5:
                        isExist = false;
                        System.out.println("Enter EmployeeId:");
                        int empId = Integer.parseInt(scanner.nextLine());

                        System.out.println("*****************Result********************");
                        for (int i = 0; i < empCurIndex; i++) {
                            if (employees[i].getEmpId() == empId) {
                                isExist = true;
                                employees[i].updateEmpStatus(scanner);
                                break;
                            }
                        }

                        if (!isExist) {
                            System.out.printf("The ID %s is no exist in employee list!\n", empId);
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
