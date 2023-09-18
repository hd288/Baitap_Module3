package rikkeiacademy.Session06.ChuanBi;

import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
        a = 0;
        b = 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setValueInput();

        System.out.println("Tổng: " + calculator.add());
        System.out.println("Hiệu: " + calculator.subtract());
        System.out.println("Tích: " + calculator.multiply());
        System.out.println("Thương: " + calculator.divide());
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setValueInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        b = scanner.nextInt();
    }

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public double divide() {
        if (b == 0) {
            System.out.println("lỗi");
            return 0;
        }
        return (double) a / b;
    }
}
