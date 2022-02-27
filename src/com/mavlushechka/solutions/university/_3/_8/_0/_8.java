package com.mavlushechka.solutions.university._3._8._0;

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
