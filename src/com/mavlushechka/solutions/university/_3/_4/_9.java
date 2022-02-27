package com.mavlushechka.solutions.university._3._4;

import java.util.ArrayList;

public class _9 {
    public static void main(String[] args) {
        Operator beeline = new Operator();

        beeline.clients.add(new Client("John", "Doe", 5553535));
        System.out.println(beeline.clients.get(0));
    }
}

class Operator {
    public final ArrayList<Client> clients = new ArrayList<>();
}

class Person {
    protected final String name;
    protected final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

class Client extends Person {
    protected final long telephoneNumber;

    public Client(String name, String surname, long telephoneNumber) {
        super(name, surname);
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + telephoneNumber;
    }
}