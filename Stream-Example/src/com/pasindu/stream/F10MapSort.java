package com.pasindu.stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class F10MapSort {

    public static void main(String[] args) {
        Integer passMark = 60;

        Map<String, Integer> students = new HashMap<>();
        students.put("Krish", 100);
        students.put("Nuwan", 90);
        students.put("Bhagya", 60);
        students.put("Hashini", 95);
        students.put("Suranga", 65);
        students.put("Erandaka", 55);


        students.entrySet().stream().filter(e -> e.getValue() >= passMark)
                .sorted((s1, s2) -> -s1.getValue().compareTo(s2.getValue()))
                .collect(Collectors.toList())
                .stream()
                .forEach(s -> System.out.println(s.getKey()));

        List<String> names = new ArrayList<>();
        students.entrySet().stream().filter(e -> e.getValue() >= passMark)
                .sorted((s1, s2) -> -s1.getValue().compareTo(s2.getValue()))
                .peek(s -> names.add(s.getKey()))
                .collect(Collectors.toList());
        System.out.println("-----------------");
        System.out.println(names);
//        Stream<Map<String, Integer>> studentStream = Stream.of(students);

//        studentStream.sorted().forEach(System.out::println);
    }
}

