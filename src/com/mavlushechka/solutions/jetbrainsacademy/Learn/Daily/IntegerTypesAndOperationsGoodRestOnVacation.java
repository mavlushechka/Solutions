package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class IntegerTypesAndOperationsGoodRestOnVacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days  = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int oneNightInHotelCost = scanner.nextInt();

        System.out.println(days * foodCostPerDay + oneWayFlightCost * 2 + oneNightInHotelCost * (days - 1));
    }
}
