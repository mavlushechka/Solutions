package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class BullsAndCows {
    private String secretCode;
    private int bulls = 0;
    private int cows = 0;

    public static void main(String[] args) {
        new BullsAndCows().play();
    }

    public void play() {
        generateRandomSecretCode(new Scanner(System.in).nextInt());
        System.out.println(getSecretCode());
    }

    private void generateRandomSecretCode(int length) {
        if (length > 10) {
            return;
        }

        String pseudoRandomNumber = String.valueOf(System.nanoTime());
        StringBuilder newSecretNumber = new StringBuilder();

        for (int i = 0; i < pseudoRandomNumber.length(); i++) {
            char digit = pseudoRandomNumber.charAt(i);

            if (!newSecretNumber.toString().contains(String.valueOf(digit))) {
                newSecretNumber.append(digit);
            }
            if (newSecretNumber.length() == length) {
                secretCode = newSecretNumber.toString();
                break;
            }
        }

        if (newSecretNumber.length() != length) {
            generateRandomSecretCode(length);
        }
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

    private String getSecretCode() {
        if (secretCode != null) {
            return String.format("The random secret number is %s.", secretCode);
        } else {
            return "Error: can't generate a secret number with a length of 11 because there aren't enough unique digits.";
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
