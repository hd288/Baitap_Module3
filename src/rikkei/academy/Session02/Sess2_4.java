package rikkei.academy.Session02;

import java.util.Scanner;

public class Sess2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        System.out.print("Your height (in meters): ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        String interpretation = interpretBMI(bmi);

        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println(interpretation);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 24.9)
            return "Normal";
        else if (bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }
}
