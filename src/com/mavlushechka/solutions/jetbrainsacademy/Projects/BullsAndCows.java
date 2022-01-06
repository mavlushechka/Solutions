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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the secret code's length:");
        generateRandomSecretCode(scanner.nextInt());
        if (secretCode != null) {
            System.out.println("Okay, let's start a game!");
            for (int i = 1; true; i++) {
                System.out.printf("Turn %d:\n", i);
                check(scanner.next());
                System.out.println(getGrade());
                if (bulls == secretCode.length()) {
                    System.out.println("Congratulations! You guessed the secret code.");
                    return;
                }
            }
        }
    }

    private void generateRandomSecretCode(int length) {
        if (length > 10) {
            System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough unique digits.");
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
        bulls = 0;
        cows = 0;

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
        return String.format("The random secret number is %s.", secretCode);
    }

    private String getGrade() {
        StringBuilder grade = new StringBuilder("Grade: ");

        if (bulls > 1 && cows > 1) {
            grade.append(String.format("%d bulls and %d cows.", bulls, cows));
        } else if (bulls > 0 && cows > 0) {
            grade.append(String.format("%d bull and %d cow.", bulls, cows));
        } else if (bulls == 0 && cows == 0) {
            grade.append("None");
        } else {
            if (bulls > 1) {
                grade.append(String.format("%d bulls.", bulls));
            } else if (bulls > 0) {
                grade.append(String.format("%d bull.", bulls));
            }

            if (cows > 1) {
                grade.append(String.format("%d cows.", cows));
            }  else if (cows > 0) {
                grade.append(String.format("%d cow.", cows));
            }
        }

        return grade.toString();
    }
}
