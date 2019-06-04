package com.pasindu.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessStudents {
    public static void main(String[] args) {
        System.out.println("All students");
        System.out.println(Student.getStudentList());
        System.out.println();

        System.out.println("Filter age greater than 18");
        List<Student> students = Student.getStudentList().stream()
                .filter(e -> (LocalDate.now().getYear() - e.getDateOfBirth().getYear()) > 18)
                .collect(Collectors.toList());
        System.out.println(students);

//        System.out.println(LocalDate.now().getYear());
    }
}
