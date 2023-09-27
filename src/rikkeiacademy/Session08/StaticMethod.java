package rikkeiacademy.Session08;

public class StaticMethod {
    public static final double PI = 3.14;

    public static double calCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double calRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        double circleRadius1 = 3.5;
        double circleRadius2 = 6.0;
        double triangleSide1 = 3.0;
        double triangleSide2 = 4.0;
        double triangleSide3 = 5.0;
        double triangleSide4 = 4.5;
        double triangleSide5 = 7.0;
        double triangleSide6 = 6.0;
        double rectangleWidth = 2.5;
        double rectangleHeight = 6.0;
        double rectangleWidth2 = 4.0;
        double rectangleHeight2 = 7.0;

        double circleArea1 = StaticMethod.calCircleArea(circleRadius1);
        double circleArea2 = StaticMethod.calCircleArea(circleRadius2);
        double triangleArea1 = StaticMethod.calTriangleArea(triangleSide1, triangleSide2, triangleSide3);
        double triangleArea2 = StaticMethod.calTriangleArea(triangleSide4, triangleSide5, triangleSide6);
        double rectangleArea1 = StaticMethod.calRectangleArea(rectangleWidth, rectangleHeight);
        double rectangleArea2 = StaticMethod.calRectangleArea(rectangleWidth2, rectangleHeight2);

        System.out.println("Circle 1 Area: " + circleArea1);
        System.out.println("Circle 2 Area: " + circleArea2);
        System.out.println("Triangle 1 Area: " + triangleArea1);
        System.out.println("Triangle 2 Area: " + triangleArea2);
        System.out.println("Rectangle 1 Area: " + rectangleArea1);
        System.out.println("Rectangle 2 Area: " + rectangleArea2);
    }
}



