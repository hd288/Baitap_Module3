package demo.sort;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr, int left, int right) {
//        base case
        if (left >= right) return;
//        B1. chọn khóa
        int key = arr[(left + right) / 2];
//        B2. phân bố lại mảng theo khóa
        int k = partition(arr, left, right, key);
//        B3. chia đôi mảng => lập lại
        quickSort(arr, left, k - 1);
        quickSort(arr, k, right);
    }

    //    return pivot k
    public static int partition(int[] arr, int left, int right, int key) {
        int ileftt = left;
        int iRight = right;
        while (ileftt <= iRight) {
//            với ileft, tìm phần tử >= key để swap
            while (arr[ileftt] < key) ileftt++;
            while (arr[iRight] > key) iRight--;
//          swap 2 element có cùng vị trí
            if (ileftt <= iRight) {
                int temp = arr[ileftt];
                arr[ileftt] = arr[iRight];
                arr[iRight] = temp;
                ileftt++;
                iRight--;
            }
        }
        return ileftt;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 54, 32, 5, 2, 26, 7, 4, 2, 8, 9};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
