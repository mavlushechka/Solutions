package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class WhatIsAnExceptionAvoidDivisionByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        try {
            int result = a / ((b + c) / d);
            System.out.println(result);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Division by zero!");
        }
    }
}
