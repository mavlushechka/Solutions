package com.mavlushechka.solutions.javafromepam._1.B;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfNumbers = input.nextInt();
        Integer[] numbers = new Integer[countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++) {
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 0; i < countOfNumbers; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.print(System.lineSeparator());
        for (int i = 0; i < countOfNumbers; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
