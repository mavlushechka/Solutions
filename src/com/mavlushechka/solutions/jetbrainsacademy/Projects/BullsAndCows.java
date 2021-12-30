package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class BullsAndCows {
    private final String secretCode = "9305";
    private int bulls = 0;
    private int cows = 0;

    public static void main(String[] args) {
        new BullsAndCows().play();
    }

    public void play() {
        check(new Scanner(System.in).next());
        System.out.println(getGrade());
    }

    private void check(String enteredSecretCode) {
        for (int i = 0; i < enteredSecretCode.length(); i++) {
            if (secretCode.contains(String.valueOf(enteredSecretCode.charAt(i)))) {
                cows++;
            }
            if (secretCode.charAt(i) == enteredSecretCode.charAt(i)) {
                bulls++;
                cows--;
            }
        }
    }

    private String getGrade() {
        StringBuilder grade = new StringBuilder("Grade: ");

        if (bulls > 0 && cows > 0) {
            grade.append(String.format("%d bull(s) and %d cow(s).", bulls, cows));
        } else if (bulls > 0) {
            grade.append(String.format("%d bull(s).", bulls));
        } else if (cows > 0) {
            grade.append(String.format("%d cow(s).", cows));
        } else {
            grade.append("None.");
        }
        grade.append(String.format(" The secret code is %s.", secretCode));

        return grade.toString();
    }
}
