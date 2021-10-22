package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ScanningTheInputPrintingEachWordInANewLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.next());
        }
    }
}