package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class SwitchStatementFloorSpaceOfTheRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        String type = scanner.next();
        double[] parameters;
        double square;

        if ("triangle".equals(type)) {
            parameters = new double[3];
        } else if ("rectangle".equals(type)) {
            parameters = new double[2];
        } else {
            parameters = new double[1];
        }
        for (int i = 0; i < parameters.length; i++) {
            parameters[i] = scanner.nextDouble();
        }

        if ("triangle".equals(type)) {
            double perimeter = (parameters[0] + parameters[1] + parameters[2]) / 2;
            square = Math.sqrt(perimeter * (perimeter - parameters[0])
                    * (perimeter - parameters[1]) * (perimeter - parameters[2]));
        } else if ("rectangle".equals(type)) {
            square = parameters[0] * parameters[1];
        } else {
            square = pi * parameters[0] * parameters[0];
        }

        System.out.println(square);
    }
}
