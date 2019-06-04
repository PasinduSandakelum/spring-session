package com.pasindu.stream;
import java.util.Comparator;

public class F7Foreach {
    public static void main(String[] args) {
//        Employee.getListOfEmployees().forEach(e -> System.out.println(e.getName()));

//        Employee.getListOfEmployees().forEach(System.out::println);

        Employee.getListOfEmployees().stream()
                .filter(e->e.getName().length()>4)
                .map(e-> new Employee(e.getName().substring(0,1).toUpperCase().concat(e.getName().substring(1,e.getName().length())),e.getMarks()))
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach(System.out::println);
//                .forEach(e-> System.out.println(e));
    }
}
