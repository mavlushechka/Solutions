package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class FunctionalDecompositionDecomposeAMathFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        } else if (0 < x && x < 1) {
            return f2(x);
        } else if (x >= 1) {
            return f3(x);
        }
        return 0;
    }

    private static double f1(double x) {
        return Math.pow(x, 2) + 1;
    }

    private static double f2(double x) {
        return 1 /  Math.pow(x, 2);
    }

    private static double f3(double x) {
        return Math.pow(x, 2) - 1;
    }
}
