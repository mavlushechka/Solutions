package com.mavlushechka.solutions.university;

class Student {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String date;
    private final long telephoneNumber;

    public Student(int id, String firstName, String lastName, String date, long telephoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return (
                "ID: " + id + "\n" +
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Date: " + date + "\n" +
                "Telephone number: " + telephoneNumber
        );
    }
}

public class _1 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Doe", "21.01.2002", 88005553535L);
        Student student2 = new Student(2, "Andrew", "Doe", "01.01.1999", 88005553535L);
        Student[] students = { student1, student2 };

        for (Student student : students) {
            System.out.println(student + "\n");
        }
    }
}
