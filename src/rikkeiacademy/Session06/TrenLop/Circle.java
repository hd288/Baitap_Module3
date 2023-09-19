package rikkeiacademy.Session06.TrenLop;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 0.0;
        color = "";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData();
        circle.displayData();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double chuVi() {
        return 2 * Math.PI * radius;
    }

    public double dienTich() {
        return Math.PI * radius * radius;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        radius = scanner.nextDouble();
        System.out.print("Nhập màu sắc: ");
        color = scanner.next();
    }

    public void displayData() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.println("Chu vi: " + chuVi());
        System.out.println("Diện tích: " + dienTich());
    }
}