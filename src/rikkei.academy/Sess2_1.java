package rikkei.academy;

import java.util.Scanner;

public class Sess2_1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        if (a != 0) { //Nếu a khác 0
            double x = (c - b) / a; //Phương trình có nghiệm duy nhất x = (c-b)/a
            System.out.println("Equation pass with x = " + x);
        } else { // Trường hợp a = 0;
            if (b == c) { // Nếu b = c -> Phương trình có vô số nghiệm
                System.out.println("The solution is all x!");
            } else { // nếu b # c -> Phương trình vô nghiệm
                System.out.println("No solution!");
            }
        }
    }
}
