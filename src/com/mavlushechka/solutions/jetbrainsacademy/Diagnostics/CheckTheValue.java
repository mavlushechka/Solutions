package com.mavlushechka.solutions.jetbrainsacademy.Diagnostics;

import java.util.Scanner;

public class CheckTheValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean lessThan10AndGreaterThan0 = value < 10 && value > 0;

        System.out.print(lessThan10AndGreaterThan0);
    }
}
