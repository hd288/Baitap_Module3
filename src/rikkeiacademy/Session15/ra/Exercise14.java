package rikkeiacademy.Session15.ra;

public class Exercise14 {
    public static void main(String[] args) {
        int[] arr = {43, 234, 321, 3, 5435, 52321, 2, 4, 5, 6, 7};

        averageArr(arr);
    }

    static void averageArr(int[] arr) {
        int average = 0;
        if (arr.length > 0) {
            int sum = 0;

            for (int number : arr) {
                sum += number;
            }

            average = sum / arr.length;
            System.out.printf("Average of array: d%n", average);
        } else {
            throw new RuntimeException("Mảng không có phần tử");
        }
    }
}
