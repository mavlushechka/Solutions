package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        for (int number : numbers) {
            if (secondMin > number && number != min) {
                secondMin = number;
            }
            if (secondMax < number && number != max) {
                secondMax = number;
            }
        }
        for (int number : numbers) {
            if (number > secondMin && number < secondMax) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
