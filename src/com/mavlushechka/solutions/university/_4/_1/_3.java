package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        boolean arithmeticProgression = true;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (i > 2 && arithmeticProgression) {
                arithmeticProgression = numbers[i - 3] - numbers[i - 2] == numbers[i - 1] - numbers[i];
            }
        }

        System.out.println(arithmeticProgression ? "Yes" : "No");
    }
}
