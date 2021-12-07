package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class IteratingOverArraysDoesAnArrayContainN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        int number;
        boolean arrayContainsNumber = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        number = scanner.nextInt();
        for (int element : array) {
            if (element == number) {
                arrayContainsNumber = true;
                break;
            }
        }
        System.out.println(arrayContainsNumber);
    }
}
