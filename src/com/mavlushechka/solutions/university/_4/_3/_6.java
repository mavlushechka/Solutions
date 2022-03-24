package com.mavlushechka.solutions.university._4._3;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        int firstNumberIndex = 0;
        int firstNumberPositionChangeTimes = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int minNumber = Integer.MAX_VALUE;
            int minNumberIndex = Integer.MAX_VALUE;

            for (int j = i; j < numbers.length; j++) {
                if (minNumber > numbers[j]) {
                    minNumber = numbers[j];
                    minNumberIndex = j;
                }
            }
            if (firstNumberIndex == minNumberIndex && i != minNumberIndex) {
                firstNumberIndex = i;
                firstNumberPositionChangeTimes++;
            } else if (firstNumberIndex == i && i != minNumberIndex) {
                firstNumberIndex = minNumberIndex;
                firstNumberPositionChangeTimes++;
            }
            numbers[minNumberIndex] = numbers[i];
            numbers[i] = minNumber;
        }
        System.out.println(firstNumberPositionChangeTimes);
    }
}
