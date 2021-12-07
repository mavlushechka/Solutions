package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

public class ArrayExceptionsCalculateSquare {

    public static void calculateSquare(int[] array, int index) {
        try {
            System.out.println((int) Math.pow(array[index], 2));
        } catch (Exception exception) {
            System.out.println("Exception!");
        }
    }
}
