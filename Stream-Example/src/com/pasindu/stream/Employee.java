package com.pasindu.stream;

import java.util.ArrayList;
import java.util.List;

public class Employee {
     String name;
     Integer marks;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public static List<Employee> getListOfEmployees() {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("krish", 90));
        employeeList.add(new Employee("hasini", 92));
        employeeList.add(new Employee("bhagya", 80));
        employeeList.add(new Employee("nuwan", 88));
        employeeList.add(new Employee("suranga", 70));
        employeeList.add(new Employee("amal", 50));
        employeeList.add(new Employee("erandika", 40));
        return employeeList;
    }

    @Override
    public String toString() {
        return
                name +
                " : " + marks ;
    }
}
