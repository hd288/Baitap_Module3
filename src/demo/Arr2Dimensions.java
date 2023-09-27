package demo;

import java.util.Scanner;

public class Arr2Dimensions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột: ");
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] arr2D = new int[rows][cols];

        // Main menu loop
        while (true) {
            System.out.println("*****************Menu*****************");
            System.out.println("1. Nhập giá trị các phần tử của mảng:");
            System.out.println("2. In giá trị các phần tử mảng theo ma trận:");
            System.out.println("3. In demo.ra giá trị các phần tử chia hết cho 3 và 5 trong mảng:");
            System.out.println("4. Tính tổng các phần tử trong mảng:");
            System.out.println("5. Nhập vào chỉ số dòng, tính tổng dòng theo chỉ số dòng:");
            System.out.println("6. In demo.ra giá trị các phần tử là số nguyên tố và tính tổng:");
            System.out.println("7. Sắp xếp các cột  trong mảng giảm dần:");
            System.out.println("8. Thoát");
            System.out.print("Chọn một tùy chọn (1-8): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập giá trị các phần tử của mảng
                    inputArrayElements(arr2D, rows, cols, scanner);
                    break;
                case 2:
                    // In giá trị các phần tử mảng theo ma trận
                    printArray(arr2D, rows, cols);
                    break;
                case 3:
                    // In demo.ra giá trị các phần tử chia hết cho 3 và 5 trong mảng
                    printDivisibleBy3And5(arr2D, rows, cols);
                    break;
                case 4:
                    // Tính tổng các phần tử trong mảng
                    calculateArraySum(arr2D, rows, cols);
                    break;
                case 5:
                    // Nhập vào chỉ số dòng, tính tổng dòng theo chỉ số dòng
                    calculateRowSum(arr2D, rows, cols, scanner);
                    break;
                case 6:
                    // In demo.ra giá trị các phần tử là số nguyên tố và tính tổng
                    printAndCalculatePrimes(arr2D, rows, cols);
                    break;
                case 7:
                    // Sắp xếp các cột  trong mảng giảm dần
                    sortColumnsDescending(arr2D, rows, cols);
                    break;
                case 8:
                    // Thoát
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }


    // Example method for inputting array elements:
    private static void inputArrayElements(int[][] arr, int rows, int cols, Scanner scanner) {
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }


    // Example method for printing the array:
    private static void printArray(int[][] arr, int rows, int cols) {
        System.out.println("Mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t"); // Use tab ("\t") to separate elements
            }
            System.out.println(); // Move to the next row
        }
    }


    // Example method for printing elements divisible by 3 and 5:
    private static void printDivisibleBy3And5(int[][] arr, int rows, int cols) {
        System.out.println("Các phần tử chia hết cho cả 3 và 5 trong mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] % 3 == 0 && arr[i][j] % 5 == 0) {
                    System.out.println("Phần tử tại dòng " + i + ", cột " + j + ": " + arr[i][j]);
                }
            }
        }
    }


    // Example method for calculating the sum of array elements:
    private static void calculateArraySum(int[][] arr, int rows, int cols) {
        int sum = 0; // Initialize the sum to zero

        // Iterate through the array and accumulate the sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j]; // Add the current element to the sum
            }
        }

        // Print the sum
        System.out.println("Tổng các phần tử trong mảng: " + sum);
    }


    // Example method for calculating the sum of a specific row:
    private static void calculateRowSum(int[][] arr, int rows, int cols, Scanner scanner) {
        System.out.print("Nhập chỉ số dòng để tính tổng: ");
        int rowIndex = scanner.nextInt();

        if (rowIndex < 0 || rowIndex > rows) {
            System.out.println("Chỉ số dòng không hợp lệ.");
            return; // Exit the method if the row index is out of bounds
        }

        int sum = 0; // Initialize the sum to zero

        // Iterate through the specified row and accumulate the sum
        for (int j = 0; j < cols; j++) {
            sum += arr[rowIndex][j]; // Add the current element to the sum
        }

        // Print the sum of the specified row
        System.out.println("Tổng của dòng " + rowIndex + ": " + sum);
    }


    // Example method for printing prime elements and calculating their sum:
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    private static void printAndCalculatePrimes(int[][] arr, int rows, int cols) {
        int primeSum = 0; // Initialize the sum of prime elements to zero

        System.out.println("Các phần tử là số nguyên tố:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isPrime(arr[i][j])) {
                    System.out.println("Phần tử tại dòng " + i + ", cột " + j + ": " + arr[i][j]);
                    primeSum += arr[i][j]; // Add the prime element to the sum
                }
            }
        }

        // Print the sum of prime elements
        System.out.println("Tổng của các phần tử là số nguyên tố: " + primeSum);
    }


    // Example method for sorting columns in descending order:
    private static void sortColumnsDescending(int[][] arr, int rows, int cols) {
        int[][] arrToSort = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(arr[i], 0, arrToSort[i], 0, cols);
//            for (int j = 0; j < cols; j++) {
//                arrToSort[i][j] = arr[i][j];
//            }
        }

        // Iterate through each column
        for (int j = 0; j < cols; j++) {
            // Use the bubble sort algorithm to sort the current column in descending order
            for (int i = 0; i < rows - 1; i++) {
                for (int k = 0; k < rows - i - 1; k++) {
                    if (arrToSort[k][j] < arrToSort[k + 1][j]) {
                        // Swap the elements if they are in the wrong order
                        int temp = arrToSort[k][j];
                        arrToSort[k][j] = arrToSort[k + 1][j];
                        arrToSort[k + 1][j] = temp;
                    }
                }
            }
        }

        // Print the sorted 2D array with sorted columns
        System.out.println("Mảng sau khi sắp xếp các cột giảm dần:");
        printArray(arrToSort, rows, cols); // You can use the printArray method you previously implemented
    }
}
