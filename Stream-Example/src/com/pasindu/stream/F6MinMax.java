package com.pasindu.stream;
import java.util.Comparator;
import java.util.Optional;

public class F6MinMax {
    public static void main(String[] args) {
        Optional<Employee> employeeMin = Employee.getListOfEmployees().stream()
                .min(Comparator.comparing(Employee::getMarks));
        System.out.println("Min  " + employeeMin.get());

        Optional<Employee> employeeMax = Employee.getListOfEmployees().stream()
                .max(Comparator.comparing(Employee::getMarks));
        System.out.println("Max  " +employeeMax.get());

    }
}
