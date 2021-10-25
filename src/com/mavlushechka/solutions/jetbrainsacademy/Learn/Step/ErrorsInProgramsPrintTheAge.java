package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ErrorsInProgramsPrintTheAge {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();
        String information = String.format("My age is %d", age);

        System.out.println(information);
    }
}
