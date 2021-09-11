package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _546 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short priceOfBanana = input.nextShort();
        int balance = input.nextInt();
        short countOfBananas = input.nextShort();
        int totalAmount = 0;
        for (short i = 1; i <= countOfBananas; i++) {
            totalAmount += priceOfBanana * i;
        }
        System.out.print((balance - totalAmount > 0) ? "0" : totalAmount-balance);
    }
}
