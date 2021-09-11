package com.mavlushechka.solutions.javafromepam._1.B;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfNumbers = input.nextInt();
        int[] countOfDividers = new int[countOfNumbers];
        int[] numbers = new int[countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < countOfNumbers; i++) {
            for (int j = 1; j <= numbers[i]; j++) {
                if (numbers[i] % j == 0) countOfDividers[i]++;
            }
            if (countOfDividers[i] == 2) System.out.print(numbers[i] + " ");
        }
    }
}
