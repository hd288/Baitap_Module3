package rikkeiacademy.Session10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List<Integer> randomList = generateRandomList();
        System.out.println("Random List: " + randomList);

        int maxElement = Collections.max(randomList);
        System.out.println("Max Element: " + maxElement);
    }

    private static List<Integer> generateRandomList() {
        List<Integer> list = new ArrayList<>();
        int maxLength = 10; // Maximum number of elements in the list

        int length = (int) (Math.random() * maxLength) + 1; // Random length of the list

        for (int i = 0; i < length; i++) {
            int randomNumber = (int) (Math.random() * 100); // Generate random number between 0 and 99
            list.add(randomNumber);
        }

        return list;
    }
}