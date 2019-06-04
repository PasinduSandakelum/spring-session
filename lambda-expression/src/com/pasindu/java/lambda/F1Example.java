package com.pasindu.java.lambda;

import java.util.Arrays;
import java.util.List;

public class F1Example {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("pasindu","kalum","ruwan","saman");

        names.forEach(s -> System.out.println(s));
    }
}
