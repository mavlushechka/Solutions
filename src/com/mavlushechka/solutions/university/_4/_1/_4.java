package com.mavlushechka.solutions.university._4._1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        int operationsNumber = scanner.nextInt();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < operationsNumber; i++) {
            int operationType = scanner.nextInt();

            switch (operationType) {
                case 1 -> {
                    int beginIndex = scanner.nextInt() - 1;
                    int endIndex = scanner.nextInt();
                    int summary = 0;

                    for (int j = beginIndex; j < endIndex; j++) {
                        summary += numbers[j];
                    }
                    results.add(summary);
                }
                case 2 -> {
                    int index = scanner.nextInt() - 1;
                    int number = scanner.nextInt();

                    numbers[index] = number;
                }
            }
        }

        results.forEach(System.out::println);
    }
}
