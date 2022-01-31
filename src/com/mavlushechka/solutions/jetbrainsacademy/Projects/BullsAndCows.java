package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.security.InvalidParameterException;
import java.util.Random;
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
        int length;

        System.out.println("Please, enter the secret code's length:");
        length = scanner.nextInt();
        try {
            generateRandomSecretCode(length);
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
        } catch (InvalidParameterException invalidParameterException) {
            System.out.printf("Error: can't generate a secret number with a length of %d because there aren't enough unique digits.\n", length);
        }
    }

    private void generateRandomSecretCode(int length) {
        if (length > 10) {
            throw new InvalidParameterException();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            Random random = new Random();

            while (stringBuilder.length() < length) {
                int randomNumber = random.nextInt(10);

                if (!stringBuilder.toString().contains(String.valueOf(randomNumber))) {
                    stringBuilder.append(randomNumber);
                }
            }
            secretCode = stringBuilder.toString();
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
