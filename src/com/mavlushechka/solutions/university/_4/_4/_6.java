package com.mavlushechka.solutions.university._4._4;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = scanner.nextInt();
        int[] numbersOfGroupMembers = new int[numberOfGroups];
        int totalAmountOfMembers = 0;
        int averageAmountOfMembers;

        for (int i = 0; i < numbersOfGroupMembers.length; i++) {
            numbersOfGroupMembers[i] = scanner.nextInt();
            totalAmountOfMembers += numbersOfGroupMembers[i];
        }
        averageAmountOfMembers = (int) Math.ceil((double) totalAmountOfMembers / numbersOfGroupMembers.length);
        System.out.println(averageAmountOfMembers);
    }
}
