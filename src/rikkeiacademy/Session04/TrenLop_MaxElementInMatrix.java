package rikkeiacademy.Session04;

import java.util.Scanner;

public class TrenLop_MaxElementInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 2: Nhập kích thước ma trận từ người dùng
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        // Tạo ma trận với kích thước đã nhập
        double[][] matrix = new double[rows][columns];

        // Bước 2: Nhập giá trị cho ma trận từ người dùng
        System.out.println("Nhập giá trị cho các phần tử trong ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Phần tử tại hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Bước 1: Tìm phần tử lớn nhất trong ma trận
        double maxElement = matrix[0][0]; // Giả sử phần tử đầu tiên là lớn nhất
        int maxRow = 0; // Tọa độ hàng của phần tử lớn nhất
        int maxColumn = 0; // Tọa độ cột của phần tử lớn nhất

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        // Hiển thị kết quả tìm thấy
        System.out.println("Phần tử lớn nhất trong ma trận là " + maxElement);
        System.out.println("Tọa độ của phần tử lớn nhất: Hàng " + (maxRow + 1) + ", Cột " + (maxColumn + 1));
    }
}