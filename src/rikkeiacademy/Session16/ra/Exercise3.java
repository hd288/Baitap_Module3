package rikkeiacademy.Session16.ra;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {
        String filePath = "D:\\Module3\\Baitap_Module3\\src\\rikkeiacademy\\Session16\\data\\exercise3.txt";

        System.out.println("Các cặp từ trùng lặp trong file:");
        for (Map.Entry<String, Integer> entry : findDuplicateWords(filePath).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    static Map<String, Integer> findDuplicateWords(String filePath) {
        Map<String, Integer> map = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s");
                for (String word : words) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
