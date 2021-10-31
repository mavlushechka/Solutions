package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class DeclaringAMethodRaiseToThePower {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        System.out.print(power(a, b));
    }

    public static long power(long a, long b) {
        long result = 1;
        for (long i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}