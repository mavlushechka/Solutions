package com.mavlushechka.solutions.javaabeginnersguide._12_3;

public enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

class Enumerations {
    public static void main(String[] args) {
        for (Tools tool : Tools.values()) {
            System.out.println(tool.ordinal() + " " + tool);
        }
    }
}
