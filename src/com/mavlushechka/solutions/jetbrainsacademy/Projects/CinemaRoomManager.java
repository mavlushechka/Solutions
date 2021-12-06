package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public final class CinemaRoomManager {

    public final byte MAX_SEATS_IN_SMALL_ROOM = 60;

    private final char[][] seats;

    private final byte rows;

    private final byte seatsInEachRow;

    private final boolean largeRoom;

    private final int income;

    private final int INCOME;

    public CinemaRoomManager(byte rows, byte seatsInEachRow) {
        this.rows = rows;
        this.seatsInEachRow = seatsInEachRow;
        seats = new char[rows][seatsInEachRow];
        for (byte i = 0; i < rows; i++) {
            for (byte j = 0; j < seatsInEachRow; j++) {
                seats[i][j] = 'S';
            }
        }
        largeRoom = rows * seatsInEachRow > MAX_SEATS_IN_SMALL_ROOM;
        income = (int) ((!largeRoom) ? Ticket.PRICE_DEFAULT * rows * seatsInEachRow :
                seatsInEachRow * ((Ticket.PRICE_FOR_FRONT_SEATS * Math.floor(rows / 2.0))
                        + (Ticket.PRICE_FOR_BACK_SEATS * Math.ceil(rows / 2.0))));
    }

    public void showRoom() {
        for (int i = 0; i <= seatsInEachRow; i++) {
            System.out.printf((i != 0) ? ("%d ") : ("  "), i);
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i+1);
            for (int j = 0; j < seatsInEachRow; j++) {
                System.out.printf(" %c", seats[i][j]);
            }
            System.out.println();
        }
    }

    public String getPlacePrice(byte row) {
        return String.valueOf(Ticket.PRICE_CURRENCY) +
                ((largeRoom) ? (row > Math.floor(rows / 2.0) ? Ticket.PRICE_FOR_BACK_SEATS
                        : Ticket.PRICE_FOR_FRONT_SEATS)
                        : Ticket.PRICE_DEFAULT);
    }

    public void choosePlace(byte row, byte seat) {
        seats[row-1][seat-1] = 'B';
    }

    public String getIncome() {
        return Ticket.PRICE_CURRENCY + Integer.toString(income);
    }
}

abstract class Ticket {

    public static char PRICE_CURRENCY = '$';

    public static byte PRICE_DEFAULT = 10;

    public static byte PRICE_FOR_FRONT_SEATS = 10;

    public static byte PRICE_FOR_BACK_SEATS = 8;
}

class Cinema {

    public static void main(String[] args) {
        CinemaRoomManager cinemaRoomManager;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        byte rows = scanner.nextByte();
        System.out.println("Enter the number of seats in each row:");
        byte seatsInEachRow = scanner.nextByte();
        cinemaRoomManager = new CinemaRoomManager(rows, seatsInEachRow);

        while (true) {
            System.out.println("""
                
                1. Show the seats
                2. Buy a ticket
                0. Exit""");
            byte choice = scanner.nextByte();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                System.out.println("\nCinema:");
                cinemaRoomManager.showRoom();
            } else if (choice == 2) {
                System.out.println("\nEnter a row number:");
                byte row = scanner.nextByte();
                System.out.println("Enter a seat number in that row:");
                byte seat = scanner.nextByte();
                System.out.printf("Ticket price: %s\n", cinemaRoomManager.getPlacePrice(row));
                cinemaRoomManager.choosePlace(row, seat);
            }
        }
    }
}