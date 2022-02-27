package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        int countOfFibonacciNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (i > 1 && numbers[i - 2] + numbers[i - 1] == numbers[i]) {
                countOfFibonacciNumbers++;
            }
        }

        System.out.println(countOfFibonacciNumbers);
    }
}
