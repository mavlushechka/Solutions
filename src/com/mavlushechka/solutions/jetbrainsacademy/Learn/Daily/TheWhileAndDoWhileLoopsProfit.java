package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

public class TheWhileAndDoWhileLoopsProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextInt();
        double deposit = scanner.nextInt();
        double aim = scanner.nextInt();
        int years = 0;

        while (money < aim) {
            money += (money * deposit) / 100;
            years++;
        }
        System.out.print(years);
    }
}