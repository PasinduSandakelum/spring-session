package com.pasindu.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Process {
    public static void main(String[] args) {
        //add Eng for all employees' names
        List<Employee> employees = Employee.getListOfEmployees().stream()
                .map(e -> new Employee("Eng. " + e.getName()))
                .collect(Collectors.toList());

        System.out.println(employees);

        //multiply all employees' marks by 2
        List<Employee> employees1 = Employee.getListOfEmployees().stream()
                .map(e -> new Employee(e.getName(), e.marks * 2))
                .collect(Collectors.toList());

        System.out.println(employees1);

        //multiply all employees' who contains i in their names marks by 3
        List<Employee> employees2 = Employee.getListOfEmployees().stream()
                .filter(e -> e.getName().contains("i"))
                .map(e -> new Employee(e.getName(), e.getMarks() * 3))
                .collect(Collectors.toList());

        System.out.println(employees2);

        //count the number of employees who has i in their names
        int count = (int) Employee.getListOfEmployees().stream()
                .filter(e -> e.getName().contains("i"))
                .count();

        System.out.println("count of employees contains name with i " + count);


    }
}
