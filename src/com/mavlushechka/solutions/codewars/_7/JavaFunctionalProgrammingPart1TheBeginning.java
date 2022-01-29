package com.mavlushechka.solutions.codewars._7;

import java.util.function.Function;

public class JavaFunctionalProgrammingPart1TheBeginning {
    public static Function<Student, Boolean> f = (Student student) -> "John Smith".equals(student.getFullName()) && "js123".equals(student.studentNumber);
}

class Student {
    public final String studentNumber;
    private final String firstName;
    private final String lastName;

    public Student(String firstName, String lastName, String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}