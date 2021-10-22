package com.mavlushechka.solutions.jetbrainsacademy.Diagnostics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GuestListOfAHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] guestsInRooms = new String[4];
        ArrayList<String> guests = new ArrayList<>();

        for (byte i = 0; i < guestsInRooms.length; i++) {
            guestsInRooms[i] = scanner.nextLine();
            guests.addAll(Arrays.asList(guestsInRooms[i].split(" ")));
        }
        Collections.reverse(guests);
        for (String guest : guests) System.out.println(guest);
    }
}
