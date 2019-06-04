package com.pasindu.stream;

import java.util.stream.Stream;

public class F9Of {
    public static void main(String[] args) {
        Stream.of(1,3,2,5,4,5,8,6,87,5).sorted()
                .forEach(System.out::println);


        Integer[] integers={1,2,4,5,8,7,65,5,6,8,45};
        Stream<Integer> integerStream = Stream.of(integers);
        integerStream.sorted().forEach(System.out::println);
    }
}
