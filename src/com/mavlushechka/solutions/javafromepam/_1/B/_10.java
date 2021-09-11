package com.mavlushechka.solutions.javafromepam._1.B;

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfNumbers = input.nextInt();
        Integer[] numbers = new Integer[countOfNumbers];
        int[] reversedNumbers = new int[countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++) {
            numbers[i] = input.nextInt();
            int size = numbers[i].toString().length();
            StringBuilder reversedNumber = new StringBuilder();
            for (int j = size-1; j >= 0; j--) {
                reversedNumber.append(numbers[i].toString().charAt(j));
            }
            reversedNumbers[i] = Integer.parseInt(reversedNumber.toString());
            if (numbers[i] == reversedNumbers[i]) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
