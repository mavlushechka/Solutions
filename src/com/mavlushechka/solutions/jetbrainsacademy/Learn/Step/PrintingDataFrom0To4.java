package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.stream.IntStream;

public class PrintingDataFrom0To4 {
    public static void main(String[] args) {
        IntStream.range(0, 5).forEach(System.out::println);
    }
}