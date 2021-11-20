package com.mavlushechka.solutions.university._10._1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _8 {

    public static void main(String[] args) {
        ArrayDeque<Character> characters = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            characters.push(scanner.next().charAt(0));
            if (i != 0 && characters.toArray()[0] == characters.toArray()[1]) {
                System.out.print(characters.toArray()[0] + " ");
            }
        }
    }
}
