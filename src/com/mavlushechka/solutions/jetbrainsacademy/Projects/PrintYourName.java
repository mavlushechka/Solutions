package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public class PrintYourName {
    public static void main(String[] args) {
        System.out.println("Hello! My name is AniMarfo.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");
        System.out.printf("What a great name you have, %s!", new Scanner(System.in).next());
    }
}