package com.mavlushechka.solutions.university._4._1;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[scanner.nextInt()];
        int scoresForGoldMedal = Integer.MIN_VALUE;
        int scoresForSilverMedal = Integer.MIN_VALUE;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            if (scoresForGoldMedal < scores[i]) {
                scoresForGoldMedal = scores[i];
            }
        }
        for (int score : scores) {
            if (scoresForSilverMedal < score && score != scoresForGoldMedal) {
                scoresForSilverMedal = score;
            }
        }

        System.out.println(scoresForSilverMedal);
    }
}
