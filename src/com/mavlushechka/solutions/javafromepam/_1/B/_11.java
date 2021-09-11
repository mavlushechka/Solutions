package com.mavlushechka.solutions.javafromepam._1.B;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfNumbers = input.nextInt();
        int[] numbers = new int[countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 1; i < countOfNumbers-1; i++) {
            if (numbers[i] == (numbers[i-1] + numbers[i+1]) / 2) System.out.print(numbers[i] + " ");
        }
    }
}
