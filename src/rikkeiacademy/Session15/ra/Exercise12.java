package rikkeiacademy.Session15.ra;

public class Exercise12 {
    public static void main(String[] args) {
        int num1 = 55, num2 = 121;

        findGMD(num1, num2);
    }

    static void findGMD(int a, int b) {
        int gmd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gmd = i;
        }
        System.out.printf("Ước chung lớn nhất của %d và %d là: %d%n", a, b, gmd);
    }
}
