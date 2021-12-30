package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ProcessingStringsNumberOfOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String substring = scanner.next();
        int frequencyOfOccurrences = (string.length() - string.replace(substring, "").length()) / substring.length();

        System.out.println(frequencyOfOccurrences);
    }
}
