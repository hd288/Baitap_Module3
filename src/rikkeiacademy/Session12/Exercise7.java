package rikkeiacademy.Session12;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Exercise7 {
    public static void main(String[] args) {
        Integer[] arr = {2, 22, 32, 3, 3, 4, 4, 65, 2, 5};
        Map<Integer, Integer> treeMap = new TreeMap<>(Comparator.comparingInt(a -> (int) a).reversed());

        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i], 0);
        }

        int i = 0;
        for (Map.Entry<Integer, Integer> m : treeMap.entrySet()) {
            if (i == 1) {
                System.out.println(m.getKey());
                break;
            }
            i++;
        }

    }
}
