package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

public class LookForFour {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 6, 2, 1, 4, 5, 8, 3, 4, 0, 12};
        int target = 4;
        int indexOfLastOccurrence = -1;

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == target) {
                indexOfLastOccurrence = i;
                break;
            }
        }
        System.out.println(indexOfLastOccurrence + ", linear");
    }
}
