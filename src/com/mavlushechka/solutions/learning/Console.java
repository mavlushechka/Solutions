package com.mavlushechka.solutions.learning;

public class Console {
    public static void main(String[] args) {
        java.io.Console console = System.console();
        String password;

        System.out.print("Enter password: ");
        password = String.valueOf(console.readPassword());

        System.out.println("Your password is: " + password);
    }
}
