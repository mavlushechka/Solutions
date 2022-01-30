package com.mavlushechka.solutions.learning;

interface StringConstructor {
    String create(String string);
}

public class ConstructorReferences {
    public static void main(String[] args) {
        StringConstructor stringConstructor = String::new;
        String string = stringConstructor.create("Constructor reference has been used.");

        System.out.println(string);
    }
}
