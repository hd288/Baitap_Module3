package rikkeiacademy.Session12.stream_api;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 43, 3, 2, 2);
        int total = integers.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);

        System.out.println("total: " + total);
    }
}
