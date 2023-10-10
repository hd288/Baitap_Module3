package demo.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort s = new MergeSort();
        int[] arr = {1, 6, 4, 3, 6, 8, 3, 7, 43, 21, 654, 876, 5435, 3};
        int[] sortedArr = s.sortArray(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public int[] merge(int[] arrLeft, int[] arrRight) {
        //        merge các mảng đã băm
        int n = arrLeft.length + arrRight.length;
        int[] result = new int[n];
        //i là con trỏ trong mảng result,j là con trỏ trong mảng arrLEft, k là con trỏ trong mảng arrRight
        int i = 0, j = 0, k = 0;
        while (i < n) {
//            xét case 2 mảng left và right != null
            if (j < arrLeft.length && k < arrRight.length) {
                if (arrLeft[j] <= arrRight[k]) {
                    result[i] = arrLeft[j];
                    i++;
                    j++;
                } else {
                    result[i] = arrRight[k];
                    i++;
                    k++;
                }
            }
//            xét case arrLeft hoặc arrRight null
            else {
                if (j < arrLeft.length) {
                    result[i] = arrLeft[j];
                    i++;
                    j++;
                } else {
                    result[i] = arrRight[k];
                    i++;
                    k++;
                }
            }
        }
        return result;
    }

    public int[] mergeSort(int[] arr, int left, int right) {
//trải mảng dùng recursions
//        bài toán cơ sở
        if (left >= right) {
            int[] singleElements = {arr[left]};
            return singleElements;
        }
//        băm nhỏ mảng
        int midlle = (left + right) / 2;
        int[] arrLeft = mergeSort(arr, left, midlle);
        int[] arrRight = mergeSort(arr, midlle + 1, right);
        int[] result = merge(arrLeft, arrRight);
        return result;
    }

    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}
