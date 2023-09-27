package rikkeiacademy.Session08;

import rikkeiacademy.Session08.shape.Circle;
import rikkeiacademy.Session08.shape.Rectangle;
import rikkeiacademy.Session08.shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 6);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Diện tích Hình Tròn, Hình Chữ Nhật & Hình Tam Giác");
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
        System.out.println("Chu vi Hình Tròn, Hình Chữ Nhật & Hình Tam Giác");
        System.out.println(circle.calculatePerimeter());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(triangle.calculatePerimeter());
    }
}
