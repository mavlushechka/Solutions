package com.mavlushechka.solutions.university._3._9;

import java.util.ArrayList;

public class _2 {
    public static void main(String[] args) {
        ArrayList<String> boys = new ArrayList<>();

        boys.add("Artem");
        boys.add("Andrey");
        boys.add("Mavlon");
        boys.remove(2);
        System.out.println(boys);
    }
}
