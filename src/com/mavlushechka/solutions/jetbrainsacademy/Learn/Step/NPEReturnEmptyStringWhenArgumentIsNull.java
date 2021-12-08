package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Locale;
import java.util.Scanner;

public class NPEReturnEmptyStringWhenArgumentIsNull {

    public static String toUpperCase(String str) {
        return str != null ? str.toUpperCase(Locale.ENGLISH) : "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}
