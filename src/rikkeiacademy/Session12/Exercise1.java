package rikkeiacademy.Session12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 5, 6, 3, 3, 1, 2, 3, 5, 7, 7};
        Map<Integer, Integer> hashMap = new HashMap<>();

        // put all elements in arraylist
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < ints.length; i++) {
            list.add(ints[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            hashMap.putIfAbsent(list.get(i), Collections.frequency(list, list.get(i)));
        }

        System.out.println(hashMap);
    }
}
