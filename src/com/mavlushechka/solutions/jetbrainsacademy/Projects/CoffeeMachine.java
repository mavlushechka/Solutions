package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsNumber = new Scanner(System.in).nextInt();
        int waterMilliliters = cupsNumber * 200;
        int milkMilliliters = cupsNumber * 50;
        int beansGram = cupsNumber * 15;

        System.out.printf("""
                For %d cups of coffee you will need:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                """, cupsNumber, waterMilliliters, milkMilliliters, beansGram);
    }
}
