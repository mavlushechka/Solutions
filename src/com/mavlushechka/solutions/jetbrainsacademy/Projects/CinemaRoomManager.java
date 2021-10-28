package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public final class CinemaRoomManager {

    private final byte rows;

    private final byte seatsInEachRow;

    private final boolean largeRoom;

    private final byte MAX_SEATS_IN_SMALL_ROOM = 60;

    public static void main(String[] args) {
        CinemaRoomManager cinemaRoomManager;
        Scanner scanner = new Scanner(System.in);
        byte rows;
        byte seatsInEachRow;

        System.out.println("Enter the number of rows:");
        rows = scanner.nextByte();
        System.out.println("Enter the number of seats in each row:");
        seatsInEachRow = scanner.nextByte();
        cinemaRoomManager = new CinemaRoomManager(rows, seatsInEachRow);

        System.out.println("Total income:\n" + cinemaRoomManager.getIncome());
    }

    public CinemaRoomManager(byte rows, byte seatsInEachRow) {
        this.rows = rows;
        this.seatsInEachRow = seatsInEachRow;
        largeRoom = rows * seatsInEachRow > MAX_SEATS_IN_SMALL_ROOM;
    }

    public void showRoom() {
        for (int i = 0; i <= seatsInEachRow; i++) {
            System.out.printf((i != 0) ? ("%d ") : ("  "), i);
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            System.out.print(i);
            for (int j = 1; j <= seatsInEachRow; j++) {
                System.out.print(" S");
            }
            if (i != rows) {
                System.out.println();
            }
        }
    }

    public String getIncome() {
        int income = (int) ((!largeRoom) ? Ticket.PRICE_DEFAULT * rows * seatsInEachRow :
                seatsInEachRow * ((Ticket.PRICE_FOR_FRONT_HALF_OF_ROOM * Math.floor(rows / 2.0)) +
                (Ticket.PRICE_FOR_BACK_HALF_OF_ROOM * Math.ceil(rows / 2.0))));
        return Ticket.PRICE_CURRENCY + Integer.toString(income);
    }
}

abstract class Ticket {

    public static char PRICE_CURRENCY = '$';

    public static byte PRICE_DEFAULT = 10;

    public static byte PRICE_FOR_FRONT_HALF_OF_ROOM = 10;

    public static byte PRICE_FOR_BACK_HALF_OF_ROOM = 8;
}