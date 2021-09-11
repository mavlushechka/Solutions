package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _282 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short X = 0;
        short n = input.nextShort();
        for (short i = 0; i < n; i++) {
            String operation = input.next();
            if(operation.contains("++")) {
                X++;
            } else if(operation.contains("--")) {
                X--;
            }
        }
        System.out.print(X);
    }
}
