package com.mavlushechka.solutions.javafromepam._1.B;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfNumbers = input.nextInt();
        int[] numbers = new int[countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < countOfNumbers; i++) {
            if (numbers[i] % 5 == 0 || numbers[i] % 7 == 0) System.out.print(numbers[i] + " ");
        }
    }
}
