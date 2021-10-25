package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.stream.Stream;

public class PrintingDataFirstSecondThird {
    public static void main(String[] args) {
        Stream.of("first", "second", "third").forEach(System.out::println);
    }
}