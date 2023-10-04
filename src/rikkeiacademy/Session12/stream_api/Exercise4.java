package rikkeiacademy.Session12.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 2, 2, 1, 2, 3, 4);

        list.sort(Comparator.reverseOrder());

        System.out.println(list.subList(0, 3));
    }
}
