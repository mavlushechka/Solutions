package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class StringExtractingASubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next().substring(scanner.nextInt(), scanner.nextInt() + 1));
    }
}
