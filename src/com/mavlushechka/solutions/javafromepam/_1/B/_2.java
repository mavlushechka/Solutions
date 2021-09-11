package com.mavlushechka.solutions.javafromepam._1.B;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfNumbers = input.nextInt();
        int[] numbers = new int[countOfNumbers];
        int minimum = numbers[0];
        int maximum = numbers[0];
        for (int i = 0; i < countOfNumbers; i++) {
            numbers[i] = input.nextInt();
            if (minimum > numbers[i]) minimum = numbers[i];
            if (maximum < numbers[i]) maximum = numbers[i];
        }
        System.out.print("Minimum: " + minimum + "\nMaximum: " + maximum);
    }
}
