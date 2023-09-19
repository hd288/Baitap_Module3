package rikkeiacademy.Session06.TrenLop;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(); // Tạo một đối tượng Employee

        employee.inputData(); // Nhập thông tin của nhân viên
        employee.calSalary(); // Tính lương của nhân viên
        employee.displayData(); // Hiển thị thông tin của nhân viên
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        employeeId = scanner.nextLine();

        System.out.print("Enter employee name: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter gender: ");
        gen = scanner.nextLine();

        System.out.print("Enter rate: ");
        rate = scanner.nextDouble();
    }

    public void displayData() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gen);
        System.out.println("Rate: " + rate);
        System.out.println("Salary: " + salary);
    }

    public void calSalary() {
        salary = rate * 1300000;
    }

}
