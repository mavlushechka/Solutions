package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        int searchedNumber;
        int numberOfFoundNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        searchedNumber = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchedNumber) {
                numberOfFoundNumbers++;
                System.out.printf("%d ", i + 1);
            }
        }
        System.out.printf("\n%d\n", numberOfFoundNumbers);
    }
}
