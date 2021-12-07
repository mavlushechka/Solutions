package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

public class NPEUnknownInput {

    public static void printLength(String name) {
        System.out.println(name != null ? name.length() : "");
    }
}
