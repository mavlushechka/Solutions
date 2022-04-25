package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

public class SortAndSearch {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9, 2, 1, 4, 5, 8, 3, 4, 0, 12};

        for (int i = 0; i < numbers.length; i++) {
            int max = Integer.MIN_VALUE;
            int indexOfMax = -1;

            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    indexOfMax = j;
                }
            }
            numbers[indexOfMax] = numbers[i];
            numbers[i] = max;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 9) {
                System.out.println(i);
                break;
            }
        }
    }
}
