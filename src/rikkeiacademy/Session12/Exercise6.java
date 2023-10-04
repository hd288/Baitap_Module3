package rikkeiacademy.Session12;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Exercise6 {
    public static void main(String[] args) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        int[] arr = {2, 56, 2, 23, 5, 7, 2};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            treeMap.put(i + 1, arr[i]);
        }

        treeMap.forEach((k, v) -> System.out.println(k + ". " + v));
    }
}
