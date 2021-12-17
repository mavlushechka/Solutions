package com.mavlushechka.solutions.university._1._1;

import java.util.Scanner;

import static java.lang.Math.*;

public class _9 {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        double solution = pow(x, 1 + 3 * PI / 4) - 3 * pow(x, 3) - pow(pow(x + 1, 4) + log10(x / (x + 1)), 1.0 / 5);

        System.out.println(solution);
    }
}
