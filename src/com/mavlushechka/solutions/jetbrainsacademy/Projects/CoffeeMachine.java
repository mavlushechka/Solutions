package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {

    private int waterMilliliters = 400;

    private int milkMilliliters = 540;

    private int coffeeBeansGram = 120;

    private int disposableCupsNumber = 9;

    private int moneyAmount = 550;

    public void start() {
        executeAction();
    }

    private void executeAction() {
        Scanner scanner = new Scanner(System.in);

        cycle: while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (Action.valueOf(scanner.next().toUpperCase())) {
                case BUY -> buy();
                case FILL -> fill();
                case TAKE -> take();
                case REMAINING -> showInformation();
                case EXIT -> {
                    break cycle;
                }
            }
            System.out.println();
        }
    }

    private void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String action = new Scanner(System.in).next();
        if (!Objects.equals(action, "back")) {
            CoffeeType coffeeType = switch (Integer.parseInt(action)) {
                case 1 -> CoffeeType.ESPRESSO;
                case 2 -> CoffeeType.LATTE;
                default -> CoffeeType.CAPPUCCINO;
            };
            if (waterMilliliters >= coffeeType.WATER_MILLILITERS && milkMilliliters >= coffeeType.MILK_MILLILITERS && coffeeBeansGram >= coffeeType.COFFEE_BEANS_GRAM && disposableCupsNumber >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
                disposableCupsNumber--;
                waterMilliliters -= coffeeType.WATER_MILLILITERS;
                milkMilliliters -= coffeeType.MILK_MILLILITERS;
                coffeeBeansGram -= coffeeType.COFFEE_BEANS_GRAM;
                moneyAmount += coffeeType.COST;
            } else if (waterMilliliters < coffeeType.WATER_MILLILITERS) {
                System.out.println("Sorry, not enough water!");
            } else if (milkMilliliters < coffeeType.MILK_MILLILITERS) {
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeBeansGram < coffeeType.COFFEE_BEANS_GRAM) {
                System.out.println("Sorry, not enough coffee beans!");
            } else {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    private void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWrite how many ml of water you want to add:");
        waterMilliliters += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milkMilliliters += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeansGram += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        disposableCupsNumber += scanner.nextInt();
    }

    private void take() {
        System.out.println("I gave you $" + moneyAmount);
        moneyAmount = 0;
    }

    private void showInformation() {
        System.out.printf("""
                
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                """, waterMilliliters, milkMilliliters, coffeeBeansGram, disposableCupsNumber, moneyAmount);
    }
}

enum Action {
    BUY, FILL, TAKE, REMAINING, EXIT
}

enum CoffeeType {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    public final int WATER_MILLILITERS;

    public final int MILK_MILLILITERS;

    public final int COFFEE_BEANS_GRAM;

    public final int COST;

    CoffeeType(int waterMilliliters, int milkMilliliters, int coffeeBeansGram, int cost) {
        WATER_MILLILITERS = waterMilliliters;
        MILK_MILLILITERS = milkMilliliters;
        COFFEE_BEANS_GRAM = coffeeBeansGram;
        COST = cost;
    }
}

class Person {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();
    }
}
