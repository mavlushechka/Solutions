package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class SimpleChattyBot {

    public final String NAME = "AniMarfo";

    public final int CREATED_YEAR = 2021;

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        greet();
        remindName();
        guessAge();
        count();
        test();
    }

    private void greet() {
        System.out.printf("Hello! My name is %s.\nI was created in %d.\n", NAME, CREATED_YEAR);
    }

    private void remindName() {
        System.out.println("Please, remind me your name.");
        System.out.printf("What a great name you have, %s!\n", scanner.nextLine());
    }

    private void guessAge() {
        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!\n", age);
    }

    private void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    private void test() {
        System.out.println("""
        Let's test your programming knowledge.
        1. To repeat a statement multiple times.
        2. To decompose a program into several small subroutines.
        3. To determine the execution time of a program.
        4. To interrupt the execution of a program.""");
        while (scanner.nextByte() != 2) {
            System.out.println("Please, try again.");
        }
        System.out.println("Congratulations, have a nice day!");
    }
}

class Main {

    public static void main(String[] args) {
        SimpleChattyBot simpleChattyBot = new SimpleChattyBot();
        simpleChattyBot.start();
    }
}