package rikkeiacademy.Session12;

import java.util.HashMap;
import java.util.Map;

public class Exercise5 {
    public static void main(String[] args) {
        int key = 1;
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(key++, key++);
        hashMap.put(key++, key++);
        hashMap.put(key++, key++);
        hashMap.put(key++, key++);
        hashMap.put(key++, key++);
        hashMap.put(key++, key++);

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue(1));
    }
}
