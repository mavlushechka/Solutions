package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.ArrayList;
import java.util.List;

public class TheListInterfaceGreekLetters {

    public static void main(String[] args) {
        List<GreekLetter> letterList = new ArrayList<>();

        letterList.add(new GreekLetter("Gamma",  3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha",  1));

        letterList.forEach(System.out::println);
    }

    static class GreekLetter {
        private final String letter;
        private final Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}
