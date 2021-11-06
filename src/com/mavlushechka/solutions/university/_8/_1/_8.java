package com.mavlushechka.solutions.university._8._1;

import java.util.Scanner;
import java.util.Stack;

public class _8 {

    public static void addToStack(char character, Stack<Character> stack) {
        if (!stack.empty() && stack.firstElement() == character) {
            stack.remove(0);
        }
        stack.push(character);
    }

    public static void main(String[] args) {
        Stack<Character> characters = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            addToStack(scanner.next().charAt(0), characters);
        }
        System.out.print(characters);
    }
}
