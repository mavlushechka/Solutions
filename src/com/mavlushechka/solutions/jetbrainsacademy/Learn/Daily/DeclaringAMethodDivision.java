package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class DeclaringAMethodDivision {

    public static double divide(long a, long b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}