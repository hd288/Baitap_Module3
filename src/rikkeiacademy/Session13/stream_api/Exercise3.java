package rikkeiacademy.Session13.stream_api;

import rikkeiacademy.Session12.entity.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Nam"), new Person("Huy"), new Person("Phát"));

        List<String> listName = list.stream().map(Person::getName).collect(Collectors.toList());

        System.out.println(listName);
    }
}
