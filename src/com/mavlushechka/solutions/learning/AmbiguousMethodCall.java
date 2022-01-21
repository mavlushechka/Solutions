package com.mavlushechka.solutions.learning;

public class AmbiguousMethodCall {
    static void print(String ... texts) {
        for (String text : texts) {
            System.out.print(text + " ");
        }
        System.out.println();
    }

    static void print(int ... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print("Hello", "World!");
        print(1, 2, 3);

        // Error: Ambiguous method call
        // print();
    }
}
