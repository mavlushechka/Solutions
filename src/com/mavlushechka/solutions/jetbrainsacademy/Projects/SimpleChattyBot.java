package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class SimpleChattyBot {

    public final String NAME = "AniMarfo";

    public final int CREATED_YEAR = 2021;

    public static void main(String[] args) {
        greet("AniMarfo", "2021");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    private void greet() {
        System.out.printf("Hello! My name is %s.\nI was created in %d.\n", NAME, CREATED_YEAR);
    }

    static void remindName() {
        System.out.println("What a great name you have, " + scanner.nextLine() + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while (scanner.nextByte() != 2) {
            System.out.println("Please, try again.");
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}