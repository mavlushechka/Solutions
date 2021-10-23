package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class SimpleChattyBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte remainder3, remainder5, remainder7;
        byte age;

        System.out.println("""
                Hello! My name is AniMarfo.
                I was created in 2021.""");
        System.out.println("Please, remind me your name.");
        System.out.printf("What a great name you have, %s!\n", new Scanner(System.in).next());
        System.out.println("""
                Let me guess your age.
                Enter remainders of dividing your age by 3, 5 and 7.""");
        remainder3 = scanner.nextByte();
        remainder5 = scanner.nextByte();
        remainder7 = scanner.nextByte();
        age = (byte) ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105);
        System.out.printf("Your age is %s; that's a good time to start programming!", age);
    }
}