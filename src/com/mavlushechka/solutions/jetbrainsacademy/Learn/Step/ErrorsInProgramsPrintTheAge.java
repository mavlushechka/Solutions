package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ErrorsInProgramsPrintTheAge {
    public static void main(String[] args) {
        String information = String.format("My age is %d", new Scanner(System.in).nextInt());

        System.out.println(information);
    }
}
