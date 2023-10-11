package rikkeiacademy.Session16.ra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\Module3\\Baitap_Module3\\src\\rikkeiacademy\\Session16\\data\\exercise1.txt";

        System.out.println(countWords(path));
    }

    static int countWords(String filePath) {
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s");
                count += words.length;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return count;
    }
}
