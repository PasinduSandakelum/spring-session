package com.pasindu.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class F12FIleReading {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("sample-data.text"));
        ArrayList<String> animalList = new ArrayList<String>();
        while (s.hasNext()) {
            animalList.add(s.nextLine());
        }
        s.close();

//        list.forEach(System.out::println);

        List<String> filteredAnimals1 = new ArrayList<>();

        animalList.stream()
                .filter(a -> a.contains("F"))
                .forEach(a -> filteredAnimals1.add(a));

        System.out.println(filteredAnimals1.size());

        System.out.println("----------------------------------");

        List<String> filteredAnimals2 = animalList.parallelStream()
                .filter(a -> a.contains("F"))
                .collect(Collectors.toList());

        System.out.println(filteredAnimals2.size());
    }
}
