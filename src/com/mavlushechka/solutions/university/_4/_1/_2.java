package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        int max = Integer.MIN_VALUE;
        int repeats = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        for (int number : numbers) {
            if (max == number) {
                repeats++;
            }
        }

        System.out.printf("%d %d\n", max, repeats);
    }
}
