package rikkeiacademy.Session03;

public class TimSoChiaHet {
    public static void main(String[] args) {
        int N = 1;

        while (true) {
            if (chiaHetCho5_7_11(N)) {
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5, 7 và 11 là: " + N);
                break; // Dừng vòng lặp khi tìm được số cần
            }
            N++;
        }
    }

    public static boolean chiaHetCho5_7_11(int number) {
        return (number % 5 == 0) && (number % 7 == 0) && (number % 11 == 0);
    }
}

