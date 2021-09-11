package com.mavlushechka.solutions.javafromepam._1.A;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfRandomNumbers = input.nextInt();
        for (int i = 0; i < countOfRandomNumbers; i++) {
            System.out.println(Math.random());
        }
        for (int i = 0; i < countOfRandomNumbers; i++) {
            System.out.print(Math.random() + " ");
        }
    }
}
