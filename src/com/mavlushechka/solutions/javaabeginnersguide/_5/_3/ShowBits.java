package com.mavlushechka.solutions.javaabeginnersguide._5._3;

public class ShowBits {
    private final int numberOfBits;

    public ShowBits(int numberOfBits) {
        this.numberOfBits = numberOfBits;
    }

    public void show(long val) {
        for (long mask = 1L << numberOfBits -1, spacer = 0; mask != 0; mask >>>= 1) {
            System.out.print(((val & mask) != 0) ? "1" : "0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 in binary:");
        b.show(123);

        System.out.println("\n87987 in binary:");
        i.show(87987);

        System.out.println("\n237658768 in binary:");
        li.show(237658768);

        // you can also show low-order bits of any integer
        System.out.println("\nLow order 8 bits of 87987 in binary:");
        b.show(87987);
    }
}
