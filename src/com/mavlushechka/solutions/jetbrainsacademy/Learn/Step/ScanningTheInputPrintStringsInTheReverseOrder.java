package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ScanningTheInputPrintStringsInTheReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[3];

        for (byte i = 0; i < words.length; i++) {
            words[i] = scanner.next();
        }
        for (byte i = (byte) (words.length - 1); i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
