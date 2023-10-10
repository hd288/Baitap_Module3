package demo.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(a);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int ai = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > ai) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = ai;
        }
    }
}
