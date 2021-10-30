package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class FunctionalDecompositionCreateAFullName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();

        System.out.println(createFullName(firstName, lastName));
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
