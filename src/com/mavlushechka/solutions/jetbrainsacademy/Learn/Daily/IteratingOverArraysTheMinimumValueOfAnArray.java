package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class IteratingOverArraysTheMinimumValueOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];
        int minElementOfArray = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (minElementOfArray > array[i]) {
                minElementOfArray = array[i];
            }
        }

        System.out.println(minElementOfArray);
    }
}
