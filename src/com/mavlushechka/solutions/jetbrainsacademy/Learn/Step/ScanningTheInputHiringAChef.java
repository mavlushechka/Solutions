package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ScanningTheInputHiringAChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] informationAboutChef = new String[5];

        for (byte i = 0; i < informationAboutChef.length; i++) {
            informationAboutChef[i] = scanner.next();
        }
        System.out.printf("The form for %s is completed." +
                " We will contact you if we need a chef that cooks %s dishes.",
                informationAboutChef[0], informationAboutChef[4]);
    }
}