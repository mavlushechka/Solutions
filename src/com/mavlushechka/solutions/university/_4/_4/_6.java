package com.mavlushechka.solutions.university._4._4;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups;
        int[] numberOfElectoratesInGroups;
        int averageNumberOfElectoratesInGroups;
        int totalNumberOfElectorates = 0;

        do {
            numberOfGroups = scanner.nextInt();
        } while (numberOfGroups < 1 || numberOfGroups > 10000);
        numberOfElectoratesInGroups = new int[numberOfGroups];
        for (int i = 0; i < numberOfElectoratesInGroups.length; i++) {
            do {
                numberOfElectoratesInGroups[i] = scanner.nextInt();
            } while (numberOfElectoratesInGroups[i] < 1 || numberOfElectoratesInGroups[i] > 9999); 
            totalNumberOfElectorates += numberOfElectoratesInGroups[i];
        }
        averageNumberOfElectoratesInGroups = (int) Math.ceil((double) totalNumberOfElectorates / numberOfGroups);

        System.out.println(averageNumberOfElectoratesInGroups);
    }
}
