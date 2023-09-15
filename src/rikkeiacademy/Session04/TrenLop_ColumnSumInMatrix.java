package rikkeiacademy.Session04;

import java.util.Scanner;

public class TrenLop_ColumnSumInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Nhập giá trị cho các phần tử trong ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Phần tử tại hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Nhập số cột cần tính tổng: ");
        int targetColumn = scanner.nextInt();
        int columnSum = 0;
        for (int i = 0; i < rows; i++) {
            columnSum += matrix[i][targetColumn - 1];
        }
        System.out.println("Tổng các số ở cột " + targetColumn + " là: " + columnSum);
    }
}
