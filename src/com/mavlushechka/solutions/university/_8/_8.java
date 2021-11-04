package com.mavlushechka.solutions.university._8;

import java.util.LinkedList;

public class _8 {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Carrot");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Potato");
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println(fruits);
    }
}
