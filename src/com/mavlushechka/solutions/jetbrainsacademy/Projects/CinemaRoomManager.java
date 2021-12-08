package com.mavlushechka.solutions.jetbrainsacademy.Projects;

import java.util.Scanner;

public final class CinemaRoomManager {

    public final byte MAX_SEATS_IN_SMALL_ROOM = 60;

    private final Scanner scanner = new Scanner(System.in);

    private char[][] seats;

    private byte rows;

    private byte seatsInEachRow;

    private boolean largeRoom;

    private int income;

    private int purchasedTickets;

    private float percentageOfPurchasedTickets;

    private int currentIncome;

    public void start() {
        System.out.println("Enter the number of rows:");
        this.rows = scanner.nextByte();
        System.out.println("Enter the number of seats in each row:");
        this.seatsInEachRow = scanner.nextByte();

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

        menu: while (true) {
            System.out.println("""
                
                1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit""");
            byte choice = scanner.nextByte();

            switch (choice) {
                case 1 -> showRoom();
                case 2 -> choosePlace();
                case 3 -> printStatistics();
                case 0 -> {
                    break menu;
                }
            }
        }
    }

    private void showRoom() {
        System.out.println("\nCinema:");
        for (int i = 0; i <= seatsInEachRow; i++) {
            System.out.printf((i != 0) ? ("%d ") : ("  "), i);
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < seatsInEachRow; j++) {
                System.out.printf(" %c", seats[i][j]);
            }
            System.out.println();
        }
    }

    private void choosePlace() {
        System.out.println("\nEnter a row number:");
        byte row = scanner.nextByte();
        System.out.println("Enter a seat number in that row:");
        byte seat = scanner.nextByte();

        try {
            if (seats[row-1][seat-1] != 'S') {
                throw new PlaceIsAlreadyTaken();
            }

            seats[row-1][seat-1] = 'B';
            purchasedTickets++;
            currentIncome += getPlacePrice(row);
            percentageOfPurchasedTickets += 1.0 / (rows * seatsInEachRow) * 100.0;
            System.out.printf("\nTicket price: %s\n", String.valueOf(Ticket.PRICE_CURRENCY) + getPlacePrice(row));
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("\nWrong input!");
            choosePlace();
        } catch (PlaceIsAlreadyTaken placeIsAlreadyTaken) {
            System.out.println("\nThat ticket has already been purchased!");
            choosePlace();
        }
    }

    private int getPlacePrice(byte row) {
        return (largeRoom) ? (row > Math.floor(rows / 2.0) ? Ticket.PRICE_FOR_BACK_SEATS : Ticket.PRICE_FOR_FRONT_SEATS) : Ticket.PRICE_DEFAULT;
    }

    private void printStatistics() {
        System.out.printf("""
                
                Number of purchased tickets: %d
                Percentage: %.2f%%
                Current income: %c%d
                Total income: %c%d
                """, purchasedTickets, percentageOfPurchasedTickets, Ticket.PRICE_CURRENCY, currentIncome, Ticket.PRICE_CURRENCY, income);
    }
}

abstract class Ticket {

    public static final char PRICE_CURRENCY = '$';

    public static final byte PRICE_DEFAULT = 10;

    public static final byte PRICE_FOR_FRONT_SEATS = 10;

    public static final byte PRICE_FOR_BACK_SEATS = 8;
}

class PlaceIsAlreadyTaken extends Exception {

    public PlaceIsAlreadyTaken() {
    }
}

class Cinema {

    public static void main(String[] args) {
        CinemaRoomManager cinemaRoomManager = new CinemaRoomManager();
        cinemaRoomManager.start();
    }
}
