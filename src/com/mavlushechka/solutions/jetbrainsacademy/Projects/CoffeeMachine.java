package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class CoffeeMachine {

    private int waterMilliliters;

    private int milkMilliliters;

    private int coffeeBeansGram;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has: ");
        waterMilliliters = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milkMilliliters = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        coffeeBeansGram = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        calculateIfCanMakeCups(scanner.nextInt());
    }

    private void calculateIfCanMakeCups(int cupsNumber) {
        int cupsNumberWithWater = waterMilliliters / CoffeeCup.WATER.getQuantity();
        int cupsNumberWithMilk = milkMilliliters / CoffeeCup.MILK.getQuantity();
        int cupsNumberWithCoffeeBeans = coffeeBeansGram / CoffeeCup.COFFEE_BEANS.getQuantity();

        int cupsNumberMachineCanMake = Math.min(cupsNumberWithWater, Math.min(cupsNumberWithMilk, cupsNumberWithCoffeeBeans));

        if (cupsNumberMachineCanMake > cupsNumber) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)\n", cupsNumberMachineCanMake - cupsNumber);
        } else if (cupsNumberMachineCanMake == cupsNumber) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee\n", cupsNumberMachineCanMake);
        }
    }

}

enum CoffeeCup {
    WATER(200), MILK(50), COFFEE_BEANS(15);

    private final int quantity;

    CoffeeCup(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }
}

class Person {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();
    }
}