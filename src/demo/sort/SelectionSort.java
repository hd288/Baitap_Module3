package demo.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 1, 6, 2, 68, 9, 45, 456};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
