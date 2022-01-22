package com.mavlushechka.solutions.learning;

import java.io.Console;

public class ConsoleClassExample {
    public static void main(String[] args) {
        Console console = System.console();
        String password;

        System.out.print("Enter password: ");
        password = String.valueOf(console.readPassword());

        System.out.println("Your password is: " + password);
    }
}
