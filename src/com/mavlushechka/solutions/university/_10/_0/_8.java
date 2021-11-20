package com.mavlushechka.solutions.university._10._0;

import java.util.LinkedList;
import java.util.Queue;

public class _8 {

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(14);
        numbers.add(16);
        numbers.add(9);
        numbers.add(10);
        numbers.add(15);
        numbers.add(13);
        System.out.println("First number in queue: " + numbers.toArray()[0]);
        numbers.remove();
        numbers.remove();
        numbers.remove();
        System.out.println("Queue after removing 3 numbers: " + numbers);
    }
}
