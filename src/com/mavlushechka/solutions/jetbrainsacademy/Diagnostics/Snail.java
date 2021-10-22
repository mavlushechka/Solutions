package com.mavlushechka.solutions.jetbrainsacademy.Diagnostics;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte currentPosition = 0;
        byte finish = scanner.nextByte();
        byte feetUp = scanner.nextByte();
        byte feetDown = scanner.nextByte();

        for (byte day = 1; currentPosition < finish; day++) {
            currentPosition += feetUp;
            if (currentPosition >= finish) System.out.print(day);
            else currentPosition -= feetDown;
        }
    }
}
