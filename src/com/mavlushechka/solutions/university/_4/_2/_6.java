package com.mavlushechka.solutions.university._4._2;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        int numbersWithThreeDivisors = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 3) {
                int divisors = 2;

                for (int j = 2; j < numbers[i]; j++) {
                    if (numbers[i] % j == 0) {
                        divisors++;
                    }
                    if (divisors > 3) {
                        break;
                    }
                }
                if (divisors == 3) {
                    numbersWithThreeDivisors++;
                }
            }
        }
        System.out.println(numbersWithThreeDivisors);
    }
}
