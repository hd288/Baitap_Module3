package rikkeiacademy.Session07.oopstore.entity;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee {
    private static int count = 1;
    private int empId;
    private String empName;
    private String birthYear;
    private String phone;
    private String email;
    private int empStatus;

    /**
     * Contructor
     */
    public Employee() {
    }

    /**
     * Getter / Setter
     */
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(int empStatus) {
        this.empStatus = empStatus;
    }

    /**
     * name: inputData(Scanner scanner)
     *
     * @param: scanner
     * function: input data
     * date: 22/09/2023
     */
    public void inputData(Scanner scanner, Employee[] employees, int empCurIndex) {
        boolean isLoop = true;

        /** Input EmployeeId */
        this.empId = count++;

        /** Input EmployeeName */
        while (isLoop) {
            System.out.println("Enter EmployeeName:");
            this.empName = scanner.nextLine();

            if (this.empName.length() < 10 || this.empName.length() > 50) {
                System.err.println("The EmployeeName must be from 10 to 50 character");
            } else {
                break;
            }
        }

        /** Input BirthYear */
        while (isLoop) {
            int currentYear = LocalDate.now().getYear();
            System.out.println("Enter BirthYear:");
            String birthYear = scanner.nextLine().trim();

            if (Pattern.matches("^[0-9]{4}", birthYear)) {
                if (Integer.parseInt(birthYear) < currentYear) {
                    this.birthYear = birthYear;
                    break;
                } else {
                    System.err.printf("The BirthYear must be less than %s!\n", birthYear);
                }
            } else {
                System.err.printf("The %s is in invalid year format\n!", birthYear);
            }
        }

        /** Input Phone */
        while (isLoop) {
            System.out.println("Enter Phone:");
            this.phone = scanner.nextLine().trim();

            if (!Pattern.matches("^[0]{1}[1-9]{1}[0-9]{8}$", this.phone)) {
                System.err.printf("The %s is in invalid phone number format. The phone number is 10number! Example: 0967888888", this.phone);
            } else {
                break;
            }
        }

        /** Input Email */
        while (isLoop) {
            System.out.println("Enter Email:");
            this.email = scanner.nextLine().trim();

            if (Pattern.matches("^\\w.*@\\w.*\\.\\w.*$", this.email)) {
                break;
            } else {
                System.err.printf("The %s is in invalid email format!\n", this.email);
            }
        }

        /** Input EmployeeStatus */
        while (isLoop) {
            System.out.print("Enter choice employee status:\n" +
                    "0. Active - 1. Resigned - 2. On leave\n");
            String choice = scanner.nextLine();

            if (Pattern.matches("^[012]$", choice)) {
                this.empStatus = Integer.parseInt(choice);
                break;
            } else {
                System.err.printf("The EmployeeStatus \"%s\" is incorrect\n" +
                        "0. Active - 1. Resigned - 2. On leave\n", choice);
            }
        }
    }

    /**
     * name: inputData(Scanner scanner)
     *
     * @param: scanner
     * function: update employee information
     * date: 22/09/2023
     */
    public void updateData(Scanner scanner, Employee[] employees, int currentIndex) {
        boolean isLoop = true;
        boolean isExist = false;


        /** Update EmployeeName */
        while (isLoop) {
            System.out.println("Enter updateEmployeeName:");
            String updateEmployeeName = scanner.nextLine().trim();

            if (updateEmployeeName == "") {
                break;
            }

            if (updateEmployeeName.length() < 10 || updateEmployeeName.length() > 50) {
                System.err.print("The %s must be from 10 to 50 character!\n");
            }
        }

        /** Update BirthYear */
        while (isLoop) {
            int currentYear = LocalDate.now().getYear();

            System.out.println("Enter updateBirthYear:");
            String updateBirthYear = scanner.nextLine().trim();

            if (updateBirthYear == "") {
                break;
            }

            if (Pattern.matches("\\d{4}", updateBirthYear) && Integer.parseInt(updateBirthYear) < currentYear) {
                this.birthYear = updateBirthYear;
                break;
            } else {
                System.err.printf("The %s is in invalid year format!\n", updateBirthYear);
            }
        }

        /** Update Phone */
        while (isLoop) {
            System.out.println("Enter updatePhone:");
            String updatePhone = scanner.nextLine().trim();

            if (updatePhone == "") {
                break;
            }

            if (Pattern.matches("^[0][1-9][0-9]{8}", updatePhone)) {
                this.phone = updatePhone;
                break;
            } else {
                System.err.printf("The %s is in invalid phone number format!\n", updatePhone);
            }
        }

        /** Update Email */
        while (isLoop) {
            System.out.println("Enter updateEmail:");
            String updateEmail = scanner.nextLine().trim();

            if (updateEmail == "") {
                break;
            }

            if (Pattern.matches("^\\w.*@\\w.*\\.\\w.*$", updateEmail)) {
                this.email = updateEmail;
            } else {
                System.err.printf("The %s is in invalid email format!\n", updateEmail);
            }
        }

        /** Update EmployeeStatus */
        while (isLoop) {
            System.out.print("Enter choice EmployeeStatus:\n" +
                    "0. Active - 1. Resigned - 2. On leave\n");
            String updateStatus = scanner.nextLine().trim();

            if (updateStatus == "") {
                break;
            }

            if (Pattern.matches("[012]", updateStatus)) {
                this.empStatus = Integer.parseInt(updateStatus);
            } else {
                System.err.printf("The EmployeeStatus \"%s\" is incorrect", updateStatus);
            }
        }
    }

    public void updateEmpStatus(Scanner scanner) {
        while (true) {
            System.out.print("Enter choice EmployeeStatus:\n" +
                    "0. Active - 1. Resigned - 2. On leave\n");
            String updateStatus = scanner.nextLine().trim();

            if (updateStatus == "") {
                break;
            }

            if (Pattern.matches("[012]", updateStatus)) {
                this.empStatus = Integer.parseInt(updateStatus);
                break;
            } else {
                System.err.printf("The EmployeeStatus \"%s\" is incorrect", updateStatus);
            }
        }
    }

    /**
     * name: display().
     *
     * @param: none.
     * function: show employee information
     * date: 22/09/2023
     */
    public void display() {
        String status = "Active";

        if (empStatus == 1) {
            status = "Resigned";
        } else if (empStatus == 2) {
            status = "On leave";
        }

        System.out.println("=====================");
        System.out.printf("Name: %s - BirthYear: %s\n" +
                        "Phone: %s - Email: %s\n" +
                        "Status: %s\n",
                empName, birthYear, phone, email, status);
    }
}
