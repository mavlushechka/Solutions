package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            boolean pureDivision = false;

            for (int secondNumber : numbers) {
                if (number % secondNumber == 0) {
                    pureDivision = true;
                } else {
                    pureDivision = false;
                    break;
                }
            }
            if (pureDivision) {
                result++;
            }
        }

        System.out.println(result);
    }
}
