package rikkeiacademy.Session12;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 5, 6, 3, 3, 1, 2, 3, 5, 7, 7};
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (Integer i : integers) {
            if (!hashMap.containsValue(i)) {
                hashMap.put(i, i);
            }
        }

        for (Map.Entry<Integer, Integer> m : hashMap.entrySet()) {
            System.out.println(m.getValue());
        }
    }

}
