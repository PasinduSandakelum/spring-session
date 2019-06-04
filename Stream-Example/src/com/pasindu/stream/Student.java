package com.pasindu.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    LocalDate dateOfBirth;

    public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Pasindu", LocalDate.parse("1993-09-04")));
        studentList.add(new Student("Kalum", LocalDate.parse("2005-10-06")));
        studentList.add(new Student("Nuwan", LocalDate.parse("1992-04-28")));
        studentList.add(new Student("Suranga", LocalDate.parse("1983-08-05")));
        studentList.add(new Student("Pradeep", LocalDate.parse("2010-01-02")));

        return studentList;
    }

    @Override
    public String toString() {
        return
                name + " : "  + dateOfBirth;
    }
}
