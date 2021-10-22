package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ScanningTheInputPrintingStringsInTheSameOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
