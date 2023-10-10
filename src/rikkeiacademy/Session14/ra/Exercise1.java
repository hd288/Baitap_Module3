package rikkeiacademy.Session14.ra;


import rikkeiacademy.Session14.entity.Sort;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        Integer[] arr = getArr();

        System.out.println(Arrays.toString(Sort.insertionSort(arr)));

        System.out.println(Arrays.toString(Sort.bubbleSort(arr)));

//        System.out.println(Arrays.toString(Sort.selectionSort(arr)));
    }

    static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        return arr;
    }
}
