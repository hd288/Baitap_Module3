package rikkeiacademy.Session04;

import java.util.Scanner;

public class Weekends_ConsoleApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến mảng 2 chiều
        int[][] matrix = null;
        int rows = 0;
        int cols = 0;

        while (true) {
            System.out.println("***********************MENU************************");
            System.out.println("1. Nhập giá trị các phần tử mảng 2 chiều");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
            System.out.println("4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng");
            System.out.println("5. In demo.ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột");
            System.out.println("7. Thoát");
            System.out.println("**************************************************");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập giá trị các phần tử mảng 2 chiều
                    System.out.print("Nhập số dòng (row): ");
                    rows = scanner.nextInt();
                    System.out.print("Nhập số cột (col): ");
                    cols = scanner.nextInt();
                    matrix = new int[rows][cols];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                            matrix[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    // In giá trị các phần tử theo ma trận
                    if (matrix != null) {
                        System.out.println("Giá trị các phần tử theo ma trận:");
                        printMatrix(matrix, rows, cols);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 3:
                    // In giá trị các phần tử nằm trên đường biên và tính tổng
                    if (matrix != null) {
                        int sumBoundary = sumBoundaryElements(matrix, rows, cols);
                        System.out.println("Tổng các phần tử nằm trên đường biên: " + sumBoundary);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 4:
                    // In giá trị các phần tử nằm trên đường chéo và tính tổng
                    if (matrix != null) {
                        int sumDiagonals = sumDiagonalElements(matrix, rows, cols);
                        System.out.println("Tổng các phần tử nằm trên đường chéo chính và chéo phụ: " + sumDiagonals);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 5:
                    // In giá trị lớn nhất và nhỏ nhất
                    if (matrix != null) {
                        int max = findMaxValue(matrix, rows, cols);
                        int min = findMinValue(matrix, rows, cols);
                        System.out.println("Giá trị lớn nhất trong mảng: " + max);
                        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 6:
                    // Sắp xếp mảng tăng dần theo cột
                    if (matrix != null) {
                        sortMatrixByColumn(matrix, rows, cols);
                        System.out.println("Mảng sau khi sắp xếp tăng dần theo cột:");
                        printMatrix(matrix, rows, cols);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 7:
                    // Thoát
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    // In mảng 2 chiều
    private static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Tính tổng các phần tử nằm trên đường biên của ma trận
    private static int sumBoundaryElements(int[][] matrix, int rows, int cols) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Tính tổng các phần tử nằm trên đường chéo chính và chéo phụ của ma trận
    private static int sumDiagonalElements(int[][] matrix, int rows, int cols) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j || i + j == rows - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Tìm giá trị lớn nhất trong mảng 2 chiều
    private static int findMaxValue(int[][] matrix, int rows, int cols) {
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    // Tìm giá trị nhỏ nhất trong mảng 2 chiều
    private static int findMinValue(int[][] matrix, int rows, int cols) {
        int min = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    // Sắp xếp mảng theo cột
    private static void sortMatrixByColumn(int[][] matrix, int rows, int cols) {
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows - 1; i++) {
                for (int k = i + 1; k < rows; k++) {
                    if (matrix[i][j] > matrix[k][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }
    }
}

