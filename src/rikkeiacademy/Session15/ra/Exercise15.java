package rikkeiacademy.Session15.ra;

import rikkeiacademy.Session15.utils.ScannerUtils;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A of triangle:");
        double a = ScannerUtils.inputDouble(scanner);

        System.out.println("Enter side B of triangle:");
        double b = ScannerUtils.inputDouble(scanner);

        System.out.println("Enter side C of triangle:");
        double c = ScannerUtils.inputDouble(scanner);

        try {
            validateTriangle(a, b, c);
            System.out.println("a, b, c are the 3 sides of the triangle");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    static void validateTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("side of the triangle greater than 0.");
        }

        if ((a + b) <= c || (b + c) <= a || (c + a) <= b) {
            throw new IllegalArgumentException("a, b, c are not side of triangle");
        }
    }
}
