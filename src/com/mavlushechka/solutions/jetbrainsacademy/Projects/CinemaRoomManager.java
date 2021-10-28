package com.mavlushechka.solutions.jetbrainsacademy.Projects;

public final class CinemaRoomManager {

    private final byte ROWS = 7;

    private final byte SEATS_IN_ONE_ROW = 8;

    public static void main(String[] args) {
        CinemaRoomManager cinemaRoomManager = new CinemaRoomManager();
        System.out.println("Cinema:");
        cinemaRoomManager.showRoom();
    }

    public void showRoom() {
        for (int i = 0; i <= SEATS_IN_ONE_ROW; i++) {
            System.out.printf((i != 0) ? ("%d ") : ("  "), i);
        }
        System.out.println();
        for (int i = 1; i <= ROWS; i++) {
            System.out.print(i);
            for (int j = 1; j <= SEATS_IN_ONE_ROW; j++) {
                System.out.print(" S");
            }
            if (i != ROWS) {
                System.out.println();
            }
        }
    }
}
