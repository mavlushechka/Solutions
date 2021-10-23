package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class SimpleChattyBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte remainder3, remainder5, remainder7;
        byte age;
        int number;

        System.out.println("""
                Hello! My name is AniMarfo.
                I was created in 2021.""");
        System.out.println("Please, remind me your name.");
        System.out.println("What a great name you have, " + scanner.next() + "!");
        System.out.println("""
                Let me guess your age.
                Enter remainders of dividing your age by 3, 5 and 7.""");
        remainder3 = scanner.nextByte();
        remainder5 = scanner.nextByte();
        remainder7 = scanner.nextByte();
        age = (byte) ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105);
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.printf("%s!\n", i);
        }
        System.out.println("Completed, have a nice day!");
    }
}