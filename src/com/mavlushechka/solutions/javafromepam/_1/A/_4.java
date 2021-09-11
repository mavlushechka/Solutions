package com.mavlushechka.solutions.javafromepam._1.A;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "qwerty123";
        String rePassword = input.next();
        System.out.print((password.equals(rePassword) ? "Correct!" : "Incorrect..."));
    }
}
