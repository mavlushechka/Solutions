package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class ErrorsInProgramsFixCompileTimeErrors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println(line2 + "\n" + line1);
    }
}