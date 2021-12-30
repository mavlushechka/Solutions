package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ProcessingStringsThePercentageOfGAndCCharacters {
    public static void main(String[] args) {
        String string = new Scanner(System.in).next();
        int originalLength = string.length();
        int newLength = string.toLowerCase().replaceAll("[gc]", "").length();
        double percentage = 100.0 * (originalLength - newLength) / originalLength;

        System.out.println(percentage);
    }
}
