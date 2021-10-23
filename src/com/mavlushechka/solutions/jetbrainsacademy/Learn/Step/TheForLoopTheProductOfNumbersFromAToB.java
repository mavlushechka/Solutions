package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class TheForLoopTheProductOfNumbersFromAToB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        long product = 1;

        for (int i = start; i < end; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
