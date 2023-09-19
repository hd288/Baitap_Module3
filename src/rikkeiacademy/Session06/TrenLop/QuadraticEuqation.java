package rikkeiacademy.Session06.TrenLop;

import java.util.Scanner;

public class QuadraticEuqation {
    private double a;
    private double b;
    private double c;

    public QuadraticEuqation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị c: ");
        double c = scanner.nextDouble();

        QuadraticEuqation euqation = new QuadraticEuqation(a, b, c);

        double discriminant = euqation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = euqation.getRoot1();
            double root2 = euqation.getRoot2();
            System.out.println("Nghiệm 1: " + root1);
            System.out.println("Nghiệm 2: " + root2);
        } else if (discriminant == 0) {
            double root = euqation.getRoot1();
            System.out.println("Nghiệm kép: " + root);
        } else {
            System.out.println("Pt vô nghiệm.");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }
}
