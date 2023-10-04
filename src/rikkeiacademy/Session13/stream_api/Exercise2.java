package rikkeiacademy.Session13.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dsadasdsa", "Das", "dsadsadsa", "dasdasdsadsad");

        List<String> list = strings.stream().filter(a -> a.length() > 5).collect(Collectors.toList());

        System.out.println(list);
    }
}
