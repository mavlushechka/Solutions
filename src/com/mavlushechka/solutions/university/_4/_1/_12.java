package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfJuries = scanner.nextInt();
        int numberOfProblems = scanner.nextInt();
        int[][] ratingsOfProblemsFromJury = new int[numberOfJuries][numberOfProblems];

        for (int jury = 0; jury < ratingsOfProblemsFromJury.length; jury++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int problem = 0; problem < ratingsOfProblemsFromJury[jury].length; problem++) {
                ratingsOfProblemsFromJury[jury][problem] = scanner.nextInt();
                if (ratingsOfProblemsFromJury[jury][problem] < min) {
                    min = ratingsOfProblemsFromJury[jury][problem];
                }
                if (ratingsOfProblemsFromJury[jury][problem] > max) {
                    max = ratingsOfProblemsFromJury[jury][problem];
                }
            }
            for (int problem = 0; problem < ratingsOfProblemsFromJury[jury].length; problem++) {
                if (ratingsOfProblemsFromJury[jury][problem] == max) {
                    ratingsOfProblemsFromJury[jury][problem] = 1;
                } else if (ratingsOfProblemsFromJury[jury][problem] == min) {
                    ratingsOfProblemsFromJury[jury][problem] = -1;
                } else {
                    ratingsOfProblemsFromJury[jury][problem] = 0;
                }
            }
        }

        for (int problem = 0; problem < ratingsOfProblemsFromJury.length; problem++) {
            boolean simplestProblem = true;
            int minRatingsNumber = 0;

            for (int jury = 0; jury < ratingsOfProblemsFromJury[problem].length; jury++) {
                if (ratingsOfProblemsFromJury[jury][problem] == -1) {
                    minRatingsNumber++;
                } else if (ratingsOfProblemsFromJury[jury][problem] == 1) {
                    simplestProblem = false;
                    break;
                }
            }
            simplestProblem = simplestProblem && minRatingsNumber > 2;

            if (simplestProblem) {
                System.out.printf("%d ", problem + 1);
            }
        }
        System.out.println();
    }
}
