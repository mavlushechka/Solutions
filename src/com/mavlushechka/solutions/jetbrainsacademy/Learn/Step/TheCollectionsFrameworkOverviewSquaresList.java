package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheCollectionsFrameworkOverviewSquaresList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = CollectionUtils.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}

class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        Collection<Integer> result = new ArrayList<>();

        numbers.forEach(number -> result.add(number * number));

        return result;
    }
}
