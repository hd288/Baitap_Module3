package rikkeiacademy.Session04;

import java.util.Scanner;

public class TrenLop_DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận vuông: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Nhập giá trị cho các phn tử trong mảng: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("matrix[%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        int diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("tổng các số ở đường chéo chính là: " + diagonalSum);
    }
}
