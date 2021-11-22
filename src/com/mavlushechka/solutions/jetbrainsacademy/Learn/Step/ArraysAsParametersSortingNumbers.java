package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAsParametersSortingNumbers {

    public static void sort(int[] numbers) {
        int[] sortedNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int min = Integer.MAX_VALUE;
            int indexOfMin = i;
            for (int j = 0; j < numbers.length; j++) {
                if (min > numbers[j]) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            numbers[indexOfMin] = Integer.MAX_VALUE;
            sortedNumbers[i] = min;
        }
        System.arraycopy(sortedNumbers, 0, numbers, 0, numbers.length);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
