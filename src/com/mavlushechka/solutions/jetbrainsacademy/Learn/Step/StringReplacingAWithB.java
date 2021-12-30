package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class StringReplacingAWithB {
    public static void main(String[] args) {
        String string = new Scanner(System.in).next();
        String replacedString = string.replace('a', 'b');

        System.out.println(replacedString);
    }
}
