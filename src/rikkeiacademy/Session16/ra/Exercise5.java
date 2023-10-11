package rikkeiacademy.Session16.ra;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        String filePath = "D:\\Module3\\Baitap_Module3\\src\\rikkeiacademy\\Session16\\data\\exercise3.txt";

        System.out.println(wordMaxLength(filePath));
    }

    static String wordMaxLength(String filePath) {
        String word = "";
        int maxLength = 0;
        List<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s");
                for (String w : words) {
                    if (maxLength < w.length()) {
                        word = w;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return word;
    }
}
