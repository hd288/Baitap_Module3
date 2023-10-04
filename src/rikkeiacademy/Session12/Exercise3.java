package rikkeiacademy.Session12;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {
        int count = 1;
        Map<Integer, Double> hashMap = new HashMap<>();
        hashMap.put(count++, Math.floor(Math.random() * 20));
        hashMap.put(count++, Math.floor(Math.random() * 20));
        hashMap.put(count++, Math.floor(Math.random() * 20));
        hashMap.put(count++, Math.floor(Math.random() * 20));
        hashMap.put(count++, Math.floor(Math.random() * 20));
        hashMap.put(count++, Math.floor(Math.random() * 20));
        hashMap.put(count++, Math.floor(Math.random() * 20));
        hashMap.put(count++, Math.floor(Math.random() * 20));
        hashMap.put(count++, Math.floor(Math.random() * 20));


        System.out.println(hashMap.entrySet());

//        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(hashMap.entrySet());
//
//        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Double>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//

        for (Map.Entry<Integer, Double> m : hashMap.entrySet()) {
            System.out.println(m.getValue());
        }
    }

}
