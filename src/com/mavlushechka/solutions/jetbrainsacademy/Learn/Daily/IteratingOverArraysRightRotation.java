package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class IteratingOverArraysRightRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayTemp = scanner.nextLine().split(" ");
        int[] array = new int[arrayTemp.length];
        int numberOfRotations = scanner.nextInt();

        for (int i = 0; i < arrayTemp.length; i++) {
            array[(i + numberOfRotations) % arrayTemp.length] = Integer.parseInt(arrayTemp[i]);
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
