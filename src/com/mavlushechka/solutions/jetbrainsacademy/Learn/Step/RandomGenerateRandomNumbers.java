package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerateRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Random random = new Random(a + b);
        int sum = 0;

        scanner.close();
        for (int i = 0; i < n; i++) {
            sum += random.nextInt(b - a + 1) + a;
        }
        System.out.println(sum);
    }
}
